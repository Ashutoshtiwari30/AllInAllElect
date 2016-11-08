package practise.layouts.allinallelectronics;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

// FULL Class PATH with package name

public class MainActivity extends AppCompatActivity {

    /**
     * Main Screen Container
     * Toolbar and RecylerView/ListView
     * <p/>
     * Sidebar (NavigationView)
     */
    private DrawerLayout drawer;// targets the root viewgroup of this activity

    private Toolbar app_toolbar;
    private NavigationView navigationView;
    private Context context;

    private ActionBarDrawerToggle toggler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        app_toolbar = (Toolbar) findViewById(R.id.app_toolbar);

        /** Only if when we require the action bar supported functionalities attached to this toolbar otherwise
         * toolbar would have behaved only a simple layout
         */
        setSupportActionBar(app_toolbar);

        navigationView = (NavigationView) findViewById(R.id.design_navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                String message = null;

                switch (item.getItemId()) {
                    case R.id.item_services:
                        message = "Services Clicked";
                        break;
                    case R.id.item_project:
                        message = "Projects Clicked";
                        break;
                    case R.id.item_about:
                        message = "Clicked";
                        break;
                    case R.id.item_gallery:
                        message = "Clicked";
                        break;
                    case R.id.item_contactus:
                        message = "Clicked";
                        break;

                    default:
                        return false;

                }

                Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

                return true;
            }
        });

        toggler = new ActionBarDrawerToggle(this, drawer, app_toolbar, R.string.drawer_status_open, R.string.drawer_status_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                Toast.makeText(context, getString(R.string.drawer_status_open), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                Toast.makeText(context, getString(R.string.drawer_status_close), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                Log.i("MainActivity", "Slide opened till " + slideOffset);
            }
        };

        drawer.addDrawerListener(toggler);

        if (getSupportActionBar() != null) {
            app_toolbar.setTitle(getString(R.string.toolbar_title));
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // to make the hamburger icon appear on the toolbar and thus make it sync with the sidedrawer
        toggler.syncState();
    }
}
