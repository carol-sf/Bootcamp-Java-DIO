package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MetodosList {
    public static void main(String[] args) {

        // Criar lista e toString()
        System.out.println("\nCrie uma lista com sete notas: ");
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        // indexOf()
        System.out.println("\nExiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5d));

        // add()
        System.out.println("\nAdicione na lista a nota 10: ");
        notas.add(10.0);
        System.out.println(notas.toString());

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        // set()
        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        // get()
        System.out.println("\nExiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));

        // contains()
        System.out.println("\nConfira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5d));

        // itarator()
        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        // size()
        System.out.println("\nExiba a média das notas: ");
        System.out.println(soma / notas.size());

        // remove()
        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        // itaretor() + remove()
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7d)
                iterator2.remove();
        }
        System.out.println(notas);

        // // clear
        // System.out.println("\nApague toda a lista");
        // notas.clear();
        // System.out.println(notas);

        // // isEmpty
        // System.out.println("\nConfira se a lista está vazia: ");
        // System.out.println(notas.isEmpty());

        // foreach
        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas)
            System.out.print(nota + " ");

        // METODOS DE COLECTIONS

        // min()
        System.out.println("\n\nExiba a menor nota: ");
        System.out.println(Collections.min(notas));

        // max()
        System.out.println("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        // LINKEDLIST

        // criar, percorrer, adicionar e mostrar
        System.out.println("\nCrie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List<Double> notas2 = new LinkedList<>();
        for (Double nota : notas) {
            notas2.add(nota);
        }
        System.out.println("notas = " + notas);
        System.out.println("notas2 = " + notas2);

        // getFirst()
        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(((LinkedList<Double>) notas2).getFirst());

        System.out.println("\nMostre a primeira nota da nova lista removendo-o: ");
        // System.out.println(((LinkedList<Double>) notas).removeFirst());

    }
}
