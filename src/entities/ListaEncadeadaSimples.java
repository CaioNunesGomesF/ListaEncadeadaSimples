package entities;

public class ListaEncadeadaSimples<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void inserirNoFim(T dado) {
        No<T> celula = new No<>(dado);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
        //
    }

    public void inserirNoInicio(T dado) {
        if(this.tamanho == 0){ // 1
            No<T> novoNo = new No<>(dado); // 1
            this.inicio = novoNo; // 1
            this.ultimo = novoNo; // 1
        }
        else{
            No<T> novoNo = new No<>(dado, this.inicio);
            this.inicio = novoNo;
        }

        this.tamanho++;
    }


    public void remover(T dado, T dadoRemover) {
        No<T> atual = this.inicio;
        while (atual.getProximo() != null) {
            if (atual.getProximo().getDados().equals(dadoRemover)) {
                atual.setProximo(atual.getProximo().getProximo());
                this.tamanho--;
                if (atual.getProximo() == null) {
                    this.ultimo = atual;
                }
                return;
            }
            atual = atual.getProximo();
        }
    }

    public boolean buscar(T dado, T dadoBucar) {
        No<T> busca = this.inicio;
        while (busca.getProximo() != null) {
            if (busca.getProximo().getDados().equals(dadoBucar)) {
                return true;
            } else {
                busca.setProximo(busca.getProximo().getProximo());
            }
        }
            return false;
    }



    public int getTamanho() {
        return tamanho;
    }


    public String imprimir() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        No<T> atual = this.inicio;
        while (atual != null) {
            builder.append(atual.getDados());
            if (atual.getProximo() != null) {
                builder.append(", ");
            }
            atual = atual.getProximo();
        }

        builder.append("]");
        return builder.toString();
    }
}
