package com.base.k4mediaassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        WebView myWebView = new WebView(this);
        setContentView(myWebView);

        myWebView.getSettings().setJavaScriptEnabled(true);

        myWebView.setWebChromeClient(new WebChromeClient());
        myWebView.setWebViewClient(new WebViewClient());
//        myWebView.loadUrl("https://flappybird.io/");

        String url = getIntent().getStringExtra("url");
        myWebView.loadUrl(url);


    }
}