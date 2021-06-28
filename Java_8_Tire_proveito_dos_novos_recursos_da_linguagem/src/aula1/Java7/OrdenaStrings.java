package aula1.Java7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora casa do codigo");
        palavras.add("Caelum");

        System.out.println("---  Java 7: Comparador Por Ordem Alfabética");
        Collections.sort(palavras);
        System.out.println(palavras);

        System.out.println("");
        System.out.println("---  Java 7: Comparador Com Parametro");
        Comparator<String> comparator = new ComparadorPorTamanho();
        Collections.sort(palavras, comparator);
        System.out.println(palavras);

        System.out.println("");
        System.out.println("---  Java 7: Iteracao");
        for(String p : palavras){
            System.out.println(p);
        }

    }
}
