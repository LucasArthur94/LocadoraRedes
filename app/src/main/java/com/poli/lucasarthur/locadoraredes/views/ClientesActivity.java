package com.poli.lucasarthur.locadoraredes.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.poli.lucasarthur.locadoraredes.R;
import com.poli.lucasarthur.locadoraredes.models.Cliente;
import com.poli.lucasarthur.locadoraredes.util.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClientesActivity extends AppCompatActivity {

    ArrayList<Cliente> clientes;
    ListView listaClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        listaClientes = (ListView) findViewById(R.id.listaClientes);

        ClienteDAO dao = new ClienteDAO(ClientesActivity.this);
//        dao.execute("http://10.0.2.2:5000/api/Clientes");
        dao.execute("https://raw.githubusercontent.com/LucasArthur94/dataRedes/master/clients.json");
    }

    public void setlist(ArrayList<Cliente> list ){

        clientes = list;

        ArrayAdapter<Cliente> adapter = new ArrayAdapter<Cliente>(this,android.R.layout.simple_list_item_1,clientes);
        listaClientes.setAdapter(adapter);


    }
}
