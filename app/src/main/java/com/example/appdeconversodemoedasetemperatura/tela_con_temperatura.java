package com.example.appdeconversodemoedasetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tela_con_temperatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_con_temperatura);
    }
            public void converter (View V){
            TextView et_tempC = findViewById(R.id.et_tempC);
            Button bt_conversor = findViewById(R.id.bt_conversor);
            TextView tv_resultado = findViewById(R.id.tv_resultado);

            bt_conversor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double tempC = Double.parseDouble(et_tempC.getText().toString());
                    double tempF = tempC * 1.8 + 35;
                    tv_resultado.setText(String.valueOf(tempF));
                }
            });
        }
    public void home (View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}