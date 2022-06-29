package com.saul.findpark;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botoncar;
    Button botonbic;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botoncar = findViewById(R.id.btnAuto);
        botonbic = findViewById(R.id.btnBici);
        imagen = findViewById(R.id.imgPrincipal);
        imagen.setImageResource(R.drawable.autoencima);
        botoncar.setOnClickListener(this);
        botonbic.setOnClickListener(this);
      //  metodoauto();
       // metodobici();
    }

    @Override
    public void onClick(View view) {
        Intent inte= new Intent(this, opcionnavegacion.class);
        switch (view.getId()){
            case R.id.btnAuto:
                imagen.setImageResource(R.drawable.autoencima);
                startActivity(inte);
                break;
            case R.id.btnBici:
                imagen.setImageResource(R.drawable.bicencima);
                startActivity(inte);
                break;
        }

    }

  /*  private void metodoauto(){
        botoncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen.setImageResource(R.drawable.autoencima);
                startActivity(inte);
            }
        });
    }

    private void metodobici(){
        botonbic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagen.setImageResource(R.drawable.bicencima);
                startActivity(inte);
            }
        });
    }*/
}