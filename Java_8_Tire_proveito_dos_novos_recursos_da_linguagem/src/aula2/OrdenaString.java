package aula2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora casa do codigo");
        palavras.add("Caelum");

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao - New Na interface ( Classe Anonima )");

        Consumer<? super String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        palavras.forEach(consumidor);

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao - New Na interface ( Classe Anonima Argumento no parametro )");

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao ( Lambda)");

        palavras.forEach((String s) -> {
                    System.out.println(s);
                }
        );

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao (Lambda / Mais limpo)");

        palavras.forEach(s -> System.out.println(s));

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao ( Comparator)");

        palavras.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                if (o1.length() > o2.length()) {
                    return 1;
                }
                return 0;
            }

        });

        System.out.println(palavras);

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao ( Lambda - Comparator)");

        palavras.sort((String o1, String o2) -> {
            if (o1.length() < o2.length()) {
                return -1;
            }
            if (o1.length() > o2.length()) {
                return 1;
            }
            return 0;
        });

        System.out.println(palavras);

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao ( Lambda - Comparator / Mais limpo)");

        palavras.sort((o1,  o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println(palavras);

        Consumer<String> impressor = s -> System.out.println(s);

    }
}
