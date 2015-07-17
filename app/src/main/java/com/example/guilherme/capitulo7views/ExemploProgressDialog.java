package com.example.guilherme.capitulo7views;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class ExemploProgressDialog extends Activity {

    private static final String URL = "http://livroandroid.com.br/imgs/livro_android.png";
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_progress_dialog);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        //Abre a janela com a barra de progresso
        dialog = ProgressDialog.show(this, "Exemplo", "Buscando imagem. Por favor, aguarde...", false, true);
        downloadImagem(URL);
    }

    private void downloadImagem(final String urlImg) {
        new Thread(){
            @Override
            public void run() {
                try{
                    //Faz download da imagem
                    URL url = new URL(urlImg);
                    InputStream in = url.openStream();
                    //Converte a InputStream do Java para Bitmap
                    final Bitmap imagem = BitmapFactory.decodeStream(in);
                    in.close();
                    //Atualiza a tela
                    atualizaImagem(imagem);
                }catch (IOException e){
                    Log.e("Erro ao fazer download: ", e.getMessage(), e);
                }
                super.run();
            }
        }.start();
    }

    private void atualizaImagem(final Bitmap imagem) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //Fecha a janela de progresso
                dialog.dismiss();
                ImageView imgView = (ImageView) findViewById(R.id.imagemProgress);
                imgView.setImageBitmap(imagem);
            }
        });
    }
}
