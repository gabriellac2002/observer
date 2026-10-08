package observer;

public record Produto(String codigo, String nome, int quantidade) {

    public Produto {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade em estoque nao pode ser negativa");
        }
    }
}
