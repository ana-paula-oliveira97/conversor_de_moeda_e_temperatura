package com.example.appdeconversodemoedasetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tela_con_moeda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_con_moeda);
    }
    public void converter (View V){
        TextView ed_dinheiro = findViewById(R.id.ed_dinheiro);
        Button btn_converter = findViewById(R.id.btn_converter);
        TextView tv_resul = findViewById(R.id.tv_resul);

        btn_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valorReal = Double.parseDouble(ed_dinheiro.getText().toString());
                Double valorDolar = valorReal * 5.20;

                tv_resul.setText(String.valueOf(valorDolar));
            }
        });

    }
    public void home (View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}