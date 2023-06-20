package com.evelyn.chichande.videostreamforandroidtv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView= findViewById(R.id.webview);
    }

    public void buttonPlayVideo(View view){

        webView.loadUrl("https://www.youtube.com/watch?v=Ke7swHtOS2I");
    }
}