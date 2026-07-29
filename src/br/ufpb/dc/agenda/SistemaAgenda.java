package br.ufpb.dc.agenda;

import java.io.IOException;

public interface SistemaAgenda {

    boolean cadastraContato(String nome, String telefone);

    Contato pesquisaContato(String nome);

    boolean removeContato(String nome);

    void salvarDados() throws IOException;

    void recuperarDados() throws IOException;
}