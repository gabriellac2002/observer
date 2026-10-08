package observer;

// Observer: recebe uma atualizacao sempre que o estoque for alterado.
public interface ObservadorEstoque {

    void atualizar(Produto produto);
}
