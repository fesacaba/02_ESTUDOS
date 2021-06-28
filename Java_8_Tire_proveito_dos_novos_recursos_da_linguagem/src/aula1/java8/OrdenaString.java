package aula1.java8;

import aula1.Java7.ComparadorPorTamanho;

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
        System.out.println("--- Java 8 : Comparador Com Parametro");
        Comparator<String> comparator = new ComparadorPorTamanho();
        palavras.sort(comparator);
        System.out.println(palavras);

        System.out.println("");
        System.out.println("--- Java 8 : Iteracao - Com comsumer");
        Consumer<? super String> consumidor = new ImprimeNaLinha() ;
        palavras.forEach(consumidor);


    }
}
