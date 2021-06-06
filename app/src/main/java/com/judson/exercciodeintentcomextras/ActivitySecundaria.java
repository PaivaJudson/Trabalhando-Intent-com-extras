package com.judson.exercciodeintentcomextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivitySecundaria extends AppCompatActivity {

    EditText edt_nome2;
    Button btn_retornar;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        edt_nome2 = findViewById(R.id.edt_nome2);
        btn_retornar = findViewById(R.id.btn_retornar);

        i = getIntent();

        edt_nome2.setText("Olá "+ i.getExtras().getString("enviar_nome"));

        btn_retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySecundaria.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}