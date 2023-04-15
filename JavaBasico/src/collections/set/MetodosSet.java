package collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.sampled.SourceDataLine;

public class MetodosSet {

    public static void main(String[] args) {
        // O set forma listas sem repetir elementos

        // LINKED HASH SET -ordem de inserção ----------------------------------------------------------------------------
        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas_LinkedHashSet = new LinkedHashSet<>(){{
            add(7d);
            add(8.5);
            add(9.3);
            add(5d);
            add(7d);
            add(0d);
            add(3.6);
        }};
        System.out.println(notas_LinkedHashSet);

        // TREE SET - ordem de natural -----------------------------------------------------------------------------------
        Set<Double> notas_TreeSet = new TreeSet<>(notas_LinkedHashSet); // só posso inserir desse jeito porque "notas_LinkedHashSet" é do tipo "Double" que possui o "Comparable"
        System.out.println(notas_TreeSet);

        // HASH SET - ordem aleatória ------------------------------------------------------------------------------------
        
        // Criar lista e toString()
        System.out.println("\nCrie uma lista com sete notas: ");
        // só vai aparecer 6 elementos
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        // add() --> é adicionado em posição aleatória
        System.out.println("\nAdicione na lista a nota 10: ");
        notas.add(10d);
        System.out.println(notas);

        // contains()
        System.out.println("\nConfira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5d));

        // itarator() --> retorna um valor do tipo Iterator
        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
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

        // itaretor() + remove()
        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);

        // clear
        System.out.println("\nApague toda a lista");
        notas.clear();
        System.out.println(notas);

        // isEmpty
        System.out.println("\nConfira se a lista está vazia: ");
        System.out.println(notas.isEmpty());

        // METODOS DE COLLECTIONS ----------------------------------------------------------------------------------------

        // min()
        System.out.println("\nExiba a menor nota: ");
        System.out.println(Collections.min(notas));

        // max()
        System.out.println("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        // O SET NAO PERMITE ACESSAR POSIÇÕES NA LISTA -------------------------------------------------------------------
        // System.out.println("\nExiba a posição da nota 5.0: ");                  // indexOf(index)
        // System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");    // add(index,value)
        // System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");           // set(index)
        // System.out.println("\nExiba a terceira nota adicionada: ");             // get(index)
        // System.out.println("\nRemova a nota da posição 0");                     // remove(index)

        System.out.println();
    }

}
