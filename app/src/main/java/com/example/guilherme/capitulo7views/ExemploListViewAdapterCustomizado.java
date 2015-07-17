package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class ExemploListViewAdapterCustomizado extends Activity implements AdapterView.OnItemClickListener{

    protected static final String TAG = "livro";
    private ListView listView;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_exemplo_list_view_adapter_customizado);
        // ListView
        listView = (ListView) findViewById(R.id.listview);
        List<Planeta> planetas = Planeta.getPlanetas();
        listView.setAdapter(new PlanetaAdapter(this, planetas));
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int idx, long id) {
        Planeta p = (Planeta) parent.getAdapter().getItem(idx);
        Toast.makeText(this, "Planeta: " + p.nome, Toast.LENGTH_SHORT).show();
    }
}
