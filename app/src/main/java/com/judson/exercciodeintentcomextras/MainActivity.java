package com.judson.exercciodeintentcomextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_enviar;
    EditText edt_nome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_enviar = findViewById(R.id.btn_enviar);
        edt_nome = findViewById(R.id.edt_nome);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strNome = edt_nome.getText().toString();

                Intent intent = new Intent(MainActivity.this, ActivitySecundaria.class);
                intent.putExtra("enviar_nome", strNome);

                startActivity(intent);
            }
        });

    }


}