package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toast;


public class ExemploViewPager extends Activity {

    // Planetas
    private int[] imagens = {R.drawable.planeta_01_mercurio, R.drawable.planeta_02_venus,
            R.drawable.planeta_03_terra, R.drawable.planeta_04_marte, R.drawable.planeta_05_jupiter,
            R.drawable.planeta_06_saturno, R.drawable.planeta_07_urano, R.drawable.planeta_08_neptuno,
            R.drawable.planeta_09_plutao};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_view_pager);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        ViewPager g = (ViewPager) findViewById(R.id.viewPager);
        g.setAdapter(new ImagemPagerAdapter(this, imagens));
        g.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) { }

            @Override
            public void onPageSelected(int i) {
                Toast t = Toast.makeText(getBaseContext(), "Imagem: " + i, Toast.LENGTH_SHORT);
                t.show();
            }

            @Override
            public void onPageScrollStateChanged(int i) { }
        });
    }


}
