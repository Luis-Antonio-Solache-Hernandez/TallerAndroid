package com.example.android.tallerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class VisorHTML extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_html);
        WebView visor = (WebView) findViewById(R.id.visorhtml);
        String pagina = getIntent().getExtras().getString("pagina");
        visor.loadUrl("http://"+pagina);
    }
}
