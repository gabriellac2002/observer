package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Subject: concentra a mudanca de estoque e notifica todos os interessados.
public class Estoque implements EstoqueObservado {

    private final List<ObservadorEstoque> observadores = new ArrayList<>();
    private Produto produto;

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(Objects.requireNonNull(observador, "O observador e obrigatorio"));
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void atualizarQuantidade(String codigo, String nome, int quantidade) {
        this.produto = new Produto(codigo, nome, quantidade);
        notificarObservadores();
    }

    public Produto getProduto() {
        return produto;
    }

    public void notificarObservadores() {
        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(produto);
        }
    }
}
