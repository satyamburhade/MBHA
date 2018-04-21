package com.delaroystudios.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class PaytmWebsite extends AppCompatActivity {
    private static WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paytm_website);

        browser = (WebView)findViewById(R.id.webView);

        browser.setWebViewClient(
                new SSLTolerentWebViewClient()
        );

        String url = "https://paytm.com/";

        browser.getSettings().setLoadsImagesAutomatically(true);

        browser.getSettings().setJavaScriptEnabled(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.loadUrl(url);
    }
}
