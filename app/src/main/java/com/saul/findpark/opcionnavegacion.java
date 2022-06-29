package com.saul.findpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class opcionnavegacion extends AppCompatActivity implements View.OnClickListener{
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcionnavegacion);
        imagen= findViewById(R.id.imgMapa1);
        imagen.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent con= new Intent(this, Menu_navegacion.class);
        startActivity(con);
    }
}