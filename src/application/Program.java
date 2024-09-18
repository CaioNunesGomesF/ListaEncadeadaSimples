package application;

import entities.ListaEncadeadaSimples;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ListaEncadeadaSimples<Integer> lista = new ListaEncadeadaSimples<>();

        // Adicionar primeiro número

        lista.inserirNoFim(1);
        System.out.println(lista.toString());

        // Adicionar segundo número

        lista.inserirNoFim(2);
        System.out.println(lista.toString());

        // Adicionar terceiro número

        lista.inserirNoFim(3);
        System.out.println(lista.toString());

        // Adicionar quarto número

        lista.inserirNoFim(4);
        System.out.println(lista.toString());

        // remover o segundo número

        lista.remover(4, 2);
        System.out.println(lista.toString());

        // inserir na primeira posição

        lista.inserirNoInicio(0);
        System.out.println(lista.toString());

        // Bucar uma posição


        if(lista.buscar(4, 1)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("\nTempo de execução em nanossegundos: " + duration);
        System.out.println("Tempo de execução em milissegundos: " + duration / 1_000_000);
    }
}
