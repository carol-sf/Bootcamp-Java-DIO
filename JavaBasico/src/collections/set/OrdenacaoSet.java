package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class OrdenacaoSet {
    public static void main(String[] args) {

        //HashSet
        System.out.println("\n--\tOrdem aleatória\t--");
        Set<Serie> series1 = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        for (Serie serie: series1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // TreeSet
        System.out.println("\n--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> series2 = new TreeSet<>(series1);
        for (Serie serie: series2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // TreeSet - addAll()
        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpsisodio());
        series3.addAll(series1);
        for (Serie serie: series3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println();
    }
}
