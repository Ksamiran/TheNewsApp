package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DataExt extends AppCompatActivity {

    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wv=(WebView)findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://www.freejobalert.com/upcoming-exam-dates-of-various-jobs/1835/");
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(wv.canGoBack())
            wv.goBack();
        else
            super.onBackPressed();
    }
}