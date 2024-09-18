package entities;

public class No<T> {

    private T dados;
    private No<T> proximo;

    public No(){

    }
    public No(T dados) {
        this.dados = dados;
        this.proximo = null;
    }
    public No(T dado, No<T> proximo) {
        this.dados = dado;
        this.proximo = proximo;
    }

    public T getDados() {
        return dados;
    }

    public void setDado(T Dado) {
        this.dados = Dado;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado =" + dados +
                ", proximo=" + proximo +
                '}';
    }
}
