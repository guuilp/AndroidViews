package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.app.AlertDialog.Builder;

public class ExemploAlertDialog extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_alert_dialog);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        Button btAlertDialog = (Button) findViewById(R.id.btAlertDialog);
        final Context context = this;
        btAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Builder builder = new Builder(context);
                builder.setIcon(R.drawable.ic_directions_bike_black_48dp);
                builder.setTitle("Teste de alert dialog");
                builder.setMessage("Mensagem de teste");
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Clicou em sim!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                });
                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Clicou em não!", Toast.LENGTH_SHORT).show();
                        return;
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}
