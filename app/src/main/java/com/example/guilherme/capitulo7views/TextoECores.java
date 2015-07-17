package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.os.Bundle;


public class TextoECores extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_ecores);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
