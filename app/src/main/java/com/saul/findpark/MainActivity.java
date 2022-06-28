package com.saul.findpark;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button botoncar;
    Button botonbic;
    ImageView imagen;
    boolean estadoboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botoncar = findViewById(R.id.btnAuto);
        botonbic = findViewById(R.id.btnBici);
        imagen = findViewById(R.id.imgPrincipal);
        imagen.setImageResource(R.drawable.autoencima);
        metodoauto();
        metodobici();

    }
    private void metodoauto(){
        botoncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen.setImageResource(R.drawable.autoencima);
            }
        });
    }

    private void metodobici(){
        botonbic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen.setImageResource(R.drawable.bicencima);
            }
        });
    }
}