
package br.ufpb.dc.agenda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaAgendaTest {

    private SistemaAgendaMap sistema;

    @BeforeEach
    public void setUp() {
        sistema = new SistemaAgendaMap();
    }

    @Test
    public void testeCadastrarEPesquisarContato() {
        // Teste de Cadastro
        boolean cadastrou = sistema.cadastraContato("Ana Silva", "83999998888");
        assertTrue(cadastrou, "O contato deveria ter sido cadastrado com sucesso.");

        // Teste de Pesquisa
        Contato contatoEncontrado = sistema.pesquisaContato("Ana Silva");
        assertNotNull(contatoEncontrado, "O contato deveria ter sido encontrado.");
        assertEquals("Ana Silva", contatoEncontrado.getNome());
        assertEquals("83999998888", contatoEncontrado.getTelefone());
    }

    @Test
    public void testeRemoverContato() {
        sistema.cadastraContato("Carlos", "83988887777");
        boolean removido = sistema.removeContato("Carlos");
        assertTrue(removido);
        assertNull(sistema.pesquisaContato("Carlos"));
    }
}