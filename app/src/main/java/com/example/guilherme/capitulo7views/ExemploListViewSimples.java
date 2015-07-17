package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class ExemploListViewSimples extends Activity implements AdapterView.OnItemClickListener{

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_list_view_simples);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new SimplesAdapter(this));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // Objeto selecionado, que neste caso era de um array de strings
        String s = (String) parent.getAdapter().getItem(position);
        Toast.makeText(this, "Texto selecionado: " + s + ", posição: " + position, Toast.LENGTH_SHORT).show();
    }
}
