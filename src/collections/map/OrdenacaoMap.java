package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class OrdenacaoMap {
    public static void main(String[] args) {
        
        //HashMap
        System.out.println("\n--\tOrdem aleatória\t--");
        Map<String,Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String,Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        //LinkedHashMap
        System.out.println("\n--\tOrdem Inserção\t--");
        Map<String, Livro> livros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String,Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        // TreeMap - o padrao é organizar de acordo com as chaves
        System.out.println("\n--\tOrdem alfabética autores\t--");
        Map<String,Livro> livros3 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String,Livro> livro : livros3.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        // TreeMap - fazendo meu próprio comparator
        System.out.println("\n--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String,Livro>> livros4 = new TreeSet<>(new ComparatorNome());
        livros4.addAll(livros.entrySet());
        for(Map.Entry<String,Livro> livro : livros4) { //aq n preciso de entrySet(), pq estou fazando a iteracao em cima
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        // System.out.println("\n--\tOrdem número de página\t--");

        System.out.println();
    }
}
