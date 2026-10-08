package observer;

import java.util.Objects;

public class Cliente implements ObservadorEstoque {

    private final String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = Objects.requireNonNull(nome, "O nome do cliente e obrigatorio");
    }

    public void atualizar(Produto produto) {
        ultimaNotificacao = "Ola, " + nome + ": " + produto.nome()
                + " agora possui " + produto.quantidade() + " unidades em estoque";
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}
