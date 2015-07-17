package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = new String[]{
                "Texto e Cores",
                "AutoCompleteTextView",
                "ImageButton",
                "ToggleButton",
                "Check e Radio",
                "Spinner",
                "ProgressDialog",
                "ProgressBar",
                "AlertDialog",
                "ListView - exemplo simples",
                "ListView - planetas",
                "GridView",
                "Gallery",
                "ViewPager",
                "ViewPager + TitleStrip",
                "ViewPager + TabStrip",
                "ImageSwitcher",
                "WebView",
                "MinhaView",
                "Touch"
        };
        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < items.length; ++i) {
            list.add(items[i]);
        }
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        final ListView listaDeAtividades = (ListView) findViewById(R.id.listaDeAtividades);
        listaDeAtividades.setAdapter(adapter);

        listaDeAtividades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getApplicationContext(),TextoECores.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),ExemploAutoCompleteTextView.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(),ExemploImageButton.class));
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(), "Ainda não desenvolvido", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(), "Ainda não desenvolvido", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(), ExemploSpinner.class));
                        break;
                    case 6:
                        startActivity(new Intent(getApplicationContext(),ExemploProgressDialog.class));
                        break;
                    case 7:
                        startActivity(new Intent(getApplicationContext(),ExemploProgressBar.class));
                        break;
                    case 8:
                        startActivity(new Intent(getApplicationContext(),ExemploAlertDialog.class));
                        break;
                    case 9:
                        startActivity(new Intent(getApplicationContext(),ExemploListViewSimples.class));
                        break;
                    case 10:
                        startActivity(new Intent(getApplicationContext(),ExemploListViewAdapterCustomizado.class));
                        break;
                    case 11:
                        Toast.makeText(getApplicationContext(), "Ainda não desenvolvido", Toast.LENGTH_SHORT).show();
                        break;
                    case 12:
                        Toast.makeText(getApplicationContext(), "Ainda não desenvolvido", Toast.LENGTH_SHORT).show();
                        break;
                    case 13:
                        startActivity(new Intent(getApplicationContext(), ExemploViewPager.class));
                        break;
                    case 14:
                        Toast.makeText(getApplicationContext(), "Ainda não desenvolvido", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        finish();
                        break;
                }
            }
        });
    }
}
