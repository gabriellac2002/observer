package observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class EstoqueTest {

    @Test
    void deveNotificarTodosOsObservadoresQuandoOEstoqueMudar() {
        Estoque estoque = new Estoque();
        Cliente cliente = new Cliente("Ana");
        PainelEstoque painel = new PainelEstoque();
        estoque.adicionarObservador(cliente);
        estoque.adicionarObservador(painel);

        estoque.atualizarQuantidade("P-10", "Teclado", 12);

        assertEquals("Ola, Ana: Teclado agora possui 12 unidades em estoque",
                cliente.getUltimaNotificacao());
        assertEquals("P-10", painel.getCodigoProduto());
        assertEquals(12, painel.getQuantidadeExibida());
    }

    @Test
    void naoDeveNotificarObservadorRemovido() {
        Estoque estoque = new Estoque();
        Cliente cliente = new Cliente("Bruno");
        estoque.adicionarObservador(cliente);
        estoque.removerObservador(cliente);

        estoque.atualizarQuantidade("P-20", "Mouse", 8);

        assertNull(cliente.getUltimaNotificacao());
    }

    @Test
    void deveExibirAUltimaQuantidadeRecebidaNoPainel() {
        Estoque estoque = new Estoque();
        PainelEstoque painel = new PainelEstoque();
        estoque.adicionarObservador(painel);

        estoque.atualizarQuantidade("P-30", "Monitor", 5);
        estoque.atualizarQuantidade("P-30", "Monitor", 9);

        assertEquals(9, painel.getQuantidadeExibida());
    }
}
