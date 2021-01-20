package com.amirht97.drawerview;



import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import static app.app.log;
import static app.app.toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextViewVazir textViewVazir,textHtmlView;
    ButtonViewVazir btnWebView;
    WebView webView;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getResources().getString(R.string.Title));


        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(ContextCompat.getColor(this, R.color.white));

        DrawerLayout drawerLayout = findViewById(R.id.drawerlayout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerToggle.syncState();

        getListener();
        setListener();
        textHtmlView.setText((HtmlCompat.fromHtml("<h2>این یک نمونه html است</h2>",HtmlCompat.FROM_HTML_MODE_COMPACT)));

        Uri uri = Uri.parse("https://hajifirouz2.cdn.asset.aparat.com/aparat-video/561654f8ed3f5b2686fcfaf69cb0b71e29223836-240p.mp4?wmsAuthSign=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0b2tlbiI6ImYzNDU2ZTFkZjViYmJjNjMwMTE4MDc1ZDk4NTRmODNjIiwiZXhwIjoxNjExMTkyNTA3LCJpc3MiOiJTYWJhIElkZWEgR1NJRyJ9.a0Xw4pvNoEJOoHVcMwtv1IfJoSwfwJMhUB3vLSUuWt0");
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.start();
        log("Video is Loading");
        toast("Video is loading");
    }

    public void getListener()
    {
        textViewVazir = findViewById(R.id.textViewVazir);
        textHtmlView = findViewById(R.id.textHtmlView);
        btnWebView = findViewById(R.id.btnWebView);
        webView = findViewById(R.id.webView);
        videoView = findViewById(R.id.videoView);
    }

    public void setListener()
    {
        btnWebView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view == btnWebView)
        {
            toast("Web is loading");
            log("this WebView");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("https://digikala.com");

        }
    }

}