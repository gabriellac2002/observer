package observer;

public class ExemploObserver {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Cliente cliente = new Cliente("Ana");
        PainelEstoque painel = new PainelEstoque();

        estoque.adicionarObservador(cliente);
        estoque.adicionarObservador(painel);
        estoque.atualizarQuantidade("P-10", "Teclado", 12);

        System.out.println(cliente.getUltimaNotificacao());
        System.out.println("Painel: " + painel.getCodigoProduto()
                + " possui " + painel.getQuantidadeExibida() + " unidades");
    }
}
