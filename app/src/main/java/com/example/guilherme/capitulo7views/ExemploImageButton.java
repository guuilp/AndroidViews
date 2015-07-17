package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class ExemploImageButton extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_image_button);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        ImageButton img1 = (ImageButton) findViewById(R.id.img1);
        final Context context = this;
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Imagem 1 OK", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton img2 = (ImageButton) findViewById(R.id.img2);
        img2.setImageResource(R.drawable.ic_beenhere_black_48dp);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Imagem 2 OK", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
