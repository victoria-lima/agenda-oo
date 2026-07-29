package br.ufpb.dc.agenda;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {

    private String caminhoArquivo;

    public GravadorDeDados(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public GravadorDeDados() {
        this("contatos.dat");
    }

    @SuppressWarnings("unchecked")
    public Map<String, Contato> recuperarContatos() throws IOException {
        File file = new File(this.caminhoArquivo);
        if (!file.exists()) {
            return new HashMap<>();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (Map<String, Contato>) in.readObject();
        } catch (ClassNotFoundException e) {
            throw new IOException("Classe não encontrada ao recuperar dados", e);
        }
    }

    public void salvarContatos(Map<String, Contato> contatos) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(this.caminhoArquivo))) {
            out.writeObject(contatos);
        }
    }
}