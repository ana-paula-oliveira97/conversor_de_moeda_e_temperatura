package com.example.appdeconversodemoedasetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moeda (View v) {
        Intent i = new Intent(this, tela_con_moeda.class);
        startActivity(i);
    }
    public void temperatura (View v) {
        Intent i = new Intent(this, tela_con_temperatura.class);
        startActivity(i);
    }
}