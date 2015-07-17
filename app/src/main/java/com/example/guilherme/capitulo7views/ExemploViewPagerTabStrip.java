package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.os.Bundle;

import java.util.List;


public class ExemploViewPagerTabStrip extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_view_pager_tab_strip);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        //Planetas
        List<Planeta> planetas = Planeta.getPlanetas();
    }

}
