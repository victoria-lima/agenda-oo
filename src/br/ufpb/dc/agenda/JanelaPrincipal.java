package br.ufpb.dc.agenda;

import br.ufpb.dc.agenda.controller.AgendaAddController;

import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame {

    private SistemaAgenda sistema = new SistemaAgendaMap();

    public JanelaPrincipal() {
        setTitle("Sistema de Agenda");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnAdicionar = new JButton("Cadastrar Contato");
        JButton btnPesquisar = new JButton("Pesquisar Contato");
        JButton btnSair = new JButton("Salvar e Sair");

        btnAdicionar.addActionListener(new AgendaAddController(sistema, this));

        btnPesquisar.addActionListener(e -> {
            String nome = JOptionPane.showInputDialog(this, "Digite o nome para pesquisar:");
            if (nome != null) {
                Contato contato = sistema.pesquisaContato(nome);
                if (contato != null) {
                    JOptionPane.showMessageDialog(this, contato.toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Contato não encontrado!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnSair.addActionListener(e -> {
            try {
                sistema.salvarDados();
                JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
                System.exit(0);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(btnAdicionar);
        add(btnPesquisar);
        add(btnSair);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JanelaPrincipal janela = new JanelaPrincipal();
            janela.setVisible(true);
        });
    }
}