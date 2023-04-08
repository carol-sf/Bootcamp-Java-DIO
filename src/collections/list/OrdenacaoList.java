package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        // em Lists a ordem que fica já é a de inserção
        System.out.println("\n--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        // Collections.shuffle()
        System.out.println("\n--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // Collections.sort() --> foi preciso implementar a casse Comparable em Gato
        System.out.println("\n--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // class ComparatorAlgumaCoisa --> não existe, eu tenho que fazer

        System.out.println("\n--\tOrdem Idade\t---");
        // pode ser assim, mas n precisa porque minha List já tem um metodo pra isso
        // Collections.sort(meusGatos, new ComparatorIdade()); 
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n--\tOrdem cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

        System.out.println();
    }
}