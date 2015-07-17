package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;


public class ExemploSpinner extends Activity {

    private int[] imagens = {R.drawable.planeta_01_mercurio,
            R.drawable.planeta_02_venus,
            R.drawable.planeta_03_terra,
            R.drawable.planeta_04_marte,
            R.drawable.planeta_05_jupiter,
            R.drawable.planeta_06_saturno,
            R.drawable.planeta_07_urano,
            R.drawable.planeta_08_neptuno,
            R.drawable.planeta_09_plutao};

    private String[] planetas = new String[]{"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter",
            "Saturno", "Urano", "Netuno", "Plutão"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_spinner);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        final ImageView img = (ImageView) findViewById(R.id.img);
        final Spinner combo = (Spinner) findViewById(R.id.comboPlanetas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, planetas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo.setAdapter(adapter);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                img.setImageResource(imagens[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {  }
        });
    }
}
