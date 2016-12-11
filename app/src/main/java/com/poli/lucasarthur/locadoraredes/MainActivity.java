package com.poli.lucasarthur.locadoraredes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.poli.lucasarthur.locadoraredes.views.ClientesActivity;
import com.poli.lucasarthur.locadoraredes.views.FilmesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clientes = (Button) findViewById(R.id.clienteBtn);
        Button filmes = (Button) findViewById(R.id.filmeBtn);

        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ClientesList = new Intent(MainActivity.this, ClientesActivity.class);
                startActivity(ClientesList);
            }
        });

        filmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent FilmesList = new Intent(MainActivity.this, FilmesActivity.class);
                startActivity(FilmesList);
            }
        });
    }
}
