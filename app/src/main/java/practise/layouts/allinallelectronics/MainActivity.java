package practise.layouts.allinallelectronics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import practise.layouts.allinallelectronics.constants.URIs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView browser = (WebView) findViewById(R.id.webview);
        WebSettings websetting = browser.getSettings();
        browser.loadUrl(URIs.domain);

    }
}
