package com.poli.lucasarthur.locadoraredes.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poli.lucasarthur.locadoraredes.R;
import com.poli.lucasarthur.locadoraredes.models.Filme;
import com.poli.lucasarthur.locadoraredes.util.FilmeDAO;

import java.util.ArrayList;
import java.util.List;

import static com.poli.lucasarthur.locadoraredes.R.id.listaFilmes;

public class FilmesActivity extends AppCompatActivity {

    ArrayList<Filme> filmes;
    ListView listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmes);


        listaFilmes = (ListView) findViewById(R.id.listaFilmes);

        FilmeDAO dao = new FilmeDAO(FilmesActivity.this);
//        dao.execute("http://10.0.2.2:5000/api/Filmes");
        dao.execute("https://raw.githubusercontent.com/LucasArthur94/dataRedes/master/movies.json");
    }

    public void setlist(ArrayList<Filme> list ){

        filmes = list;

        ArrayAdapter<Filme> adapter = new ArrayAdapter<Filme>(this,android.R.layout.simple_list_item_1,filmes);
        listaFilmes.setAdapter(adapter);


    }
}
