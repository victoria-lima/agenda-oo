package br.ufpb.dc.agenda;

import java.io.Serializable;

public class Contato implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato() {
        this("", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato: " + nome + " - Tel: " + telefone;
    }
}