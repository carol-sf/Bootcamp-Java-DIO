package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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
        System.out.println("\n--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(agenda);
        for(Map.Entry<Integer,Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    
        System.out.println("\n--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda2 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        for(Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }
    
        System.out.println("\n--\tOrdem id\t--");
        Map<Integer, Contato> agenda3 = new TreeMap<>(agenda);
        for(Map.Entry<Integer,Contato> entry : agenda3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    
        System.out.println("\n--\tOrdem número telefone\t--");
        Set<Map.Entry<Integer,Contato>> agenda4 = new TreeSet<>(new ComparatorNumeroTelefone());
        agenda4.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> entry : agenda4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }
    
        System.out.println("\n--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer,Contato>> agenda5 = new TreeSet<>(new ComparatorNomeContato());
        agenda5.addAll(agenda.entrySet());
        for(Map.Entry<Integer,Contato> entry : agenda5) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println();
    }
}