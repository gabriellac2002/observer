package observer;

public class PainelEstoque implements ObservadorEstoque {

    private String codigoProduto;
    private int quantidadeExibida;

    public void atualizar(Produto produto) {
        this.codigoProduto = produto.codigo();
        this.quantidadeExibida = produto.quantidade();
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidadeExibida() {
        return quantidadeExibida;
    }
}
