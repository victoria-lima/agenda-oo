package br.ufpb.dc.agenda;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SistemaAgendaMap implements SistemaAgenda {

    private Map<String, Contato> contatos;
    private GravadorDeDados gravador;

    public SistemaAgendaMap() {
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    @Override
    public boolean cadastraContato(String nome, String telefone) {
        if (!this.contatos.containsKey(nome)) {
            Contato novoContato = new Contato(nome, telefone);
            this.contatos.put(nome, novoContato);
            return true;
        }
        return false;
    }

    @Override
    public Contato pesquisaContato(String nome) {
        return this.contatos.get(nome);
    }

    @Override
    public boolean removeContato(String nome) {
        if (this.contatos.containsKey(nome)) {
            this.contatos.remove(nome);
            return true;
        }
        return false;
    }

    @Override
    public void salvarDados() throws IOException {
        this.gravador.salvarContatos(this.contatos);
    }

    @Override
    public void recuperarDados() throws IOException {
        this.contatos = this.gravador.recuperarContatos();
    }
}