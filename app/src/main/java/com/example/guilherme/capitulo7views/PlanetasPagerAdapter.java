package com.example.guilherme.capitulo7views;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Guilherme on 15/07/2015.
 */
public class PlanetasPagerAdapter extends PagerAdapter {
    private Context context;
    private final List<Planeta> planetas;

    public PlanetasPagerAdapter(Context c, List<Planeta> planetas) {
        this.context = c;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas != null ? planetas.size() : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        // Determina se a view informada é igual ao object retornado pelo instantiateItem
        return view == o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // Infla a view
        View view = LayoutInflater.from(this.context).inflate(R.layout.adapter_imagem, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Planeta planeta = planetas.get(position);
        img.setImageResource(planeta.img);
        // Adiciona no layout ViewGroup
        ((ViewGroup) container).addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object view) { // Remove a view do container
        ((ViewPager)container).removeView((View) view);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Título para mostrar em um PagerTitleStrip ou PagerTabStrip
        Planeta planeta = planetas.get(position);
        return planeta.nome;
    }
}
