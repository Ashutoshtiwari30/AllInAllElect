package practise.layouts.allinallelectronics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar app_toolbar;
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        WebView browser = (WebView) findViewById(R.id.webview);
////        WebSettings websetting = browser.getSettings();
//        browser.loadUrl(URIs.domain);

        app_toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(app_toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //toggler  = new ActionBarDrawerToggle(this, drawer, )

        if (getSupportActionBar() != null) {
            app_toolbar.setTitle(getString(R.string.toolbar_title));
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
