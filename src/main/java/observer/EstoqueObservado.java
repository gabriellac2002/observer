package observer;

public interface EstoqueObservado {

    void adicionarObservador(ObservadorEstoque observador);

    void removerObservador(ObservadorEstoque observador);

    void notificarObservadores();
}
