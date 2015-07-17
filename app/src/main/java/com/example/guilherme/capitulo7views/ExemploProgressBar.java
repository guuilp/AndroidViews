package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class ExemploProgressBar extends Activity {

    private static final String TAG = "livro";
    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_progress_bar);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        //Barra de progresso
        mProgress = (ProgressBar) findViewById(R.id.barraProgresso);
        Button b = (Button) findViewById(R.id.btOk);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(){
                    @Override
                    public void run() {
                        for (int i = 0; i <= 100; i++){
                            final int progress = i;
                            //Atualiza a barra de progresso
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Log.d(TAG, ">> Progress: " + progress);
                                    mProgress.setProgress(progress);
                                }
                            });
                            try{
                                Thread.sleep(200);
                            }catch(InterruptedException e){  }
                        }
                        Log.d(TAG, "Fim");
                    }
                }.start();
            }});
    }
}
