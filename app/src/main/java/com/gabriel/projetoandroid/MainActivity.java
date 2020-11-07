package com.gabriel.projetoandroid;

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

    public void Entrar (View v){

        Intent intent = new Intent(getApplicationContext(), telasApp.class);
        startActivity(intent);
    }
    public void cadastrar(View view){
        startActivity(new Intent(this, telaCadastro.class));
    }
}