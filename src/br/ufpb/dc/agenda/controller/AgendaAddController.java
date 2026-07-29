package br.ufpb.dc.agenda.controller;

import br.ufpb.dc.agenda.SistemaAgenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaAddController implements ActionListener {

    private SistemaAgenda sistema;
    private JFrame janelaPrincipal;

    public AgendaAddController(SistemaAgenda sistema, JFrame janela) {
        this.sistema = sistema;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Digite o nome do contato:");
        if (nome != null && !nome.trim().isEmpty()) {
            String telefone = JOptionPane.showInputDialog(janelaPrincipal, "Digite o telefone do contato:");
            if (telefone != null) {
                boolean cadastrou = sistema.cadastraContato(nome, telefone);
                if (cadastrou) {
                    JOptionPane.showMessageDialog(janelaPrincipal, "Contato cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(janelaPrincipal, "Contato não cadastrado. Nome já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}