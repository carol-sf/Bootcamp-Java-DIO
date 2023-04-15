package collections.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Imprima todos os elementos dessa lista de String: ");

        // System.out.println("Classe Annonima:");
        // numerosAleatorios.stream().forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String t) {
        //         System.out.println(t);
        //     }
        // });

        // System.out.println("Lambda:");
        // numerosAleatorios.stream().forEach(numeros -> System.out.println(numeros));

        // System.out.println("Reference Method:");
        // numerosAleatorios.forEach(System.out::println);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");

        // // só apareceu 4 numeros pq o set nao aceita numeros repetidos
        // Set<String> collectSet = numerosAleatorios.stream()
        //                                 .limit(5)
        //                                 .collect(Collectors.toSet());
        //                                 collectSet.forEach(System.out::println);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Transforme esta lista de String em uma lista de números inteiros.");

        // numerosAleatorios.stream()
        //     .map(new Function<String,Integer>() {
        //         @Override
        //             public Integer apply(String t) {
        //                 return Integer.parseInt(t);
        //         }
        //     })
        //     .forEach(System.out::println);

        // numerosAleatorios.stream().map(numString -> Integer.parseInt(numString));

        // List<Integer> collectList = numerosAleatorios.stream()
        //     .map(Integer::parseInt)
        //     .collect(Collectors.toList());
        // collectList.forEach(System.out::println);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");

        // List<Integer> listaParesMaioresQueDois =  numerosAleatorios.stream()
        //     .map(Integer::parseInt)
        //     .filter(new Predicate<Integer>() {
        //         @Override
        //         public boolean test(Integer t) {
        //             if(t % 2 == 0 && t > 2) return true;
        //             return false; 
        //         }                
        //     }).collect(Collectors.toList());
        // System.out.println(listaParesMaioresQueDois);

        // List<Integer> listaParesMaioresQueDois =  numerosAleatorios.stream()
        //     .map(Integer::parseInt)
        //     .filter(num -> (num % 2 == 0 && num > 2))      
        //     .collect(Collectors.toList());
        // System.out.println(listaParesMaioresQueDois);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Mostre a média dos números: ");
        // numerosAleatorios.stream()
        //     .mapToInt(Integer::parseInt)
        //     .average()
        //     .ifPresent(System.out::println);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger =  numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        // System.out.println("Antes: " + numerosAleatoriosInteger);
        // numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer t) {
        //         if(t % 2 != 0) return true;
        //         return false;
        //     }
        // });
        // System.out.println("Depois " + numerosAleatoriosInteger);
        
        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        // numerosAleatorios.stream()
        //     .skip(3)
        //     .forEach(System.out::println);
        
        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");
        // long contNumerosUnicos = numerosAleatoriosInteger.stream()
        //     .distinct()
        //     .count();
        // System.out.println(contNumerosUnicos);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.print("Mostre o menor valor da lista: ");
        // numerosAleatoriosInteger.stream()
        //     .mapToInt(Integer::intValue)
        //     .min()
        //     .ifPresent(System.out::println);
        
        // System.out.print("Mostre o maior valor da lista: ");
        // numerosAleatoriosInteger.stream()
        //     .mapToInt(Integer::intValue)
        //     .max()
        //     .ifPresent(System.out::println);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Pegue apenas os números pares e some:");
        // int somaNumerosPares = numerosAleatoriosInteger.stream()
        //     .filter(num -> (num % 2 == 0))
        //     .mapToInt(Integer::intValue)
        //     .sum();
        // System.out.println(somaNumerosPares);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Mostre a lista na ordem númerica: ");
        // List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
        //     .sorted(Comparator.naturalOrder())
        //     .collect(Collectors.toList());
        // System.out.println(numerosOrdemNatural);

        // ---------------------------------------------------------------------------------------------------------------
        // System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        // Map<Boolean, List<Integer>> numerosMultiplosDe3e5 = numerosAleatoriosInteger.stream()
        //     .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        // System.out.println(numerosMultiplosDe3e5);
    }
}
