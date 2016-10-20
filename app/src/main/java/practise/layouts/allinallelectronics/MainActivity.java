package practise.layouts.allinallelectronics;

import android.support.v7.app.AppCompatActivity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView browser=(WebView)findViewById(R.id.webview);
        WebSettings websetting=browser.getSettings();
        browser.loadUrl("http://www.Allinallelectronics.in");

    }
}
