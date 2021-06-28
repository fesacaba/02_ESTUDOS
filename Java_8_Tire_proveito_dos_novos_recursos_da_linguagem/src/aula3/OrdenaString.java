package aula3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora casa do codigo");
        palavras.add("Caelum");

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao ( Lambda - Comparator / Interface Funcional)");

        Function<String, Integer> funcao = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Comparator<? super String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);
        System.out.println(palavras);

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao ( Lambda - Comparator / Interface Funcional)");

        palavras.sort(Comparator.comparing(s -> s.length()));
        System.out.println(palavras);

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao ( Lambda - Comparator / Metodo Reference)");

        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
        System.out.println("--- Java 8 : Iteracao ( Lambda - Comparator / Metodo Reference)");
        palavras.forEach(System.out::println);


    }
}
