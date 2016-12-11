package com.poli.lucasarthur.locadoraredes.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lucas_000 on 08/12/2016.
 */

public class Filme {
    private String nome;
    private Date dataEstreia;
    private String _genero;
    private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public Filme(String nome, Date dataEstreia, String _genero) {
        this.nome = nome;
        this.dataEstreia = dataEstreia;
        this._genero = _genero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDate() {
        return this.dataEstreia;
    }

    public void setDate(Date dataEstreia) {
        this.dataEstreia = dataEstreia;
    }

    public String get_genero() {
        return this._genero;
    }

    public void set_genero(String _genero) {
        this._genero = _genero;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Data Lançamento: " + formato.format(this.dataEstreia) + " | Gênero: " + this._genero;
    }
}
