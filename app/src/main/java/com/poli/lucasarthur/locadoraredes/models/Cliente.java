package com.poli.lucasarthur.locadoraredes.models;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by lucas_000 on 08/12/2016.
 */

public class Cliente {
    private String nome;
    private Date dataAdesao;
    private int _statusCliente;
    private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String nome, Date dataAdesao, int _statusCliente) {
        this.nome = nome;
        this.dataAdesao = dataAdesao;
        this._statusCliente = _statusCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDate() {
        return this.dataAdesao;
    }

    public void setDate(Date dataAdesao) {
        this.dataAdesao = dataAdesao;
    }

    public int get_statusCliente() {
        return this._statusCliente;
    }

    public void set_statusCliente(int _statusCliente) {
        this._statusCliente = _statusCliente;
    }

    @Override
    public String toString() {
        if (this._statusCliente == 1)
            return "Nome: " + this.nome + " | Data Adesao: " + formato.format(this.dataAdesao) + " | Status: OK";
        else if (this._statusCliente == 0)
            return "Nome: " + this.nome + " | Data Adesao: " + formato.format(this.dataAdesao) + " | Status: Com Atraso";
        return "Nome: " + this.nome + " | Data Adesao: " + formato.format(this.dataAdesao) + " | Status: Desconhecido";
    }
}