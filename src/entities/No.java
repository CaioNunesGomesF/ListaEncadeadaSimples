package entities;

public class No<T> {

    private T elemento;
    private No<T> proximo;

    public No(){

    }
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    public No(T dado, No<T> proximo) {
        this.elemento = dado;
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setDado(T Dado) {
        this.elemento = Dado;
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
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}
