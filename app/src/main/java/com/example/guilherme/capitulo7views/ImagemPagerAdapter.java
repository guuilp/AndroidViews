package com.example.guilherme.capitulo7views;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Guilherme on 15/07/2015.
 */
public class ImagemPagerAdapter extends PagerAdapter {
    private Context context;
    private final int[] imagens;

    public ImagemPagerAdapter(Context context, int[] imagens) {
        this.context = context;
        this.imagens = imagens;
    }

    @Override
    public int getCount() {
        return imagens != null ? imagens.length : 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        // Determina se a view informada é igual ao object retornado pelo instantiateItem
        return view == o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //Infla a view
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_imagem, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        img.setImageResource(imagens[position]);
        ((ViewGroup) container).addView(view); //Adiciona ao layout ViewGroup
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object view) { // Remove a view do container
        ((ViewPager)container).removeView((View) view);
    }
}
