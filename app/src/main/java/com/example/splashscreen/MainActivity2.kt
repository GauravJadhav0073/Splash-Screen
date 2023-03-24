package com.example.splashscreen

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val webViewVariable = findViewById<WebView>(R.id.webview2)

        webviewSetup(webViewVariable)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webviewSetup(webView: WebView){
        webView.webViewClient=WebViewClient()

        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.google.com/")
        }
    }
}