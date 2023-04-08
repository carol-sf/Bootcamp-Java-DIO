package collections.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class Agenda {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};

        // Meu Comparator
        Set<Map.Entry<Integer,Contato>> agenda_meuComparator = new TreeSet<>(new ComparatorNumeroTelefone());
        agenda_meuComparator.addAll(agenda.entrySet());

        // Classe Anonima
        Set<Map.Entry<Integer,Contato>> agenda_classeAnonima = new TreeSet<>(new Comparator<Map.Entry<Integer,Contato>>() {
            @Override
            public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }            
        });
        agenda_classeAnonima.addAll(agenda.entrySet());

        // Interface Funcional
        Set<Map.Entry<Integer,Contato>> agenda_interfaceFuncional = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer,Contato>, Integer>() {
                @Override
                public Integer apply(Map.Entry<Integer, Contato> c) {
                    return c.getValue().getNumero();
                }            
        }));
        agenda_interfaceFuncional.addAll(agenda.entrySet());

        //Lambda
        Set<Map.Entry<Integer,Contato>> agenda_lambda = new TreeSet<>(Comparator.comparing(
            contato -> contato.getValue().getNumero()
        ));
        agenda_lambda.addAll(agenda.entrySet());


        // imprimindo na tela
        System.out.println("\n--\tOrdem número telefone\t--");
        
        System.out.println("Comparator criado por mim:");
        for(Map.Entry<Integer,Contato> entry : agenda_meuComparator) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }
        
        System.out.println("\nClasse Anonima:");
        for(Map.Entry<Integer,Contato> entry : agenda_classeAnonima) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        System.out.println("\nInterface Funcional:");
        for(Map.Entry<Integer,Contato> entry : agenda_interfaceFuncional) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        System.out.println("\nLambda:");
        for(Map.Entry<Integer,Contato> entry : agenda_lambda) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }

        // System.out.println("\n--\tOrdem nome contato\t--");
        // Set<Map.Entry<Integer,Contato>> agenda5 = new TreeSet<>(new ComparatorNomeContato());
        // agenda5.addAll(agenda.entrySet());
        // for(Map.Entry<Integer,Contato> entry : agenda5) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        // }

        System.out.println();
    }
}