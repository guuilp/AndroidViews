package com.example.guilherme.capitulo7views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Guilherme on 15/07/2015.
 */
public class SimplesAdapter extends BaseAdapter {

    private String[] planetas = new String[]{"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter",
            "Saturno", "Urano", "Netuno", "Plutão"};
    private Context context;

    public SimplesAdapter(Context context){
        super();
        this.context = context; // O context é necessário para criar a view
    }

    @Override
    public int getCount() {
        return planetas.length; // Retorna a quantidade de itens do adapter
    }

    @Override
    public Object getItem(int position) {
        return planetas[position]; // Retorna o objeto para esta posição
    }

    @Override
    public long getItemId(int position) {
        return position; // Retorna o id do objeto para esta posição
    }

    @Override
    // Retorna a View para esta posição
    public View getView(int position, View convertView, ViewGroup parent) {
        String planeta = planetas[position];
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_simples, parent, false);
        TextView t = (TextView) view.findViewById(R.id.textoAdapter);
        t.setText(planeta);
        return view;
    }
}
