package teste.util;

import model.Conta;
import model.ContaCorrente;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        //Gemerics
        ArrayList<Conta> lista = new ArrayList<Conta >();
        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        Conta cc2 = new ContaCorrente(22, 11);
        lista.add(cc2);

        System.out.println(lista.size());
        System.out.println(lista.get(0));
        lista.remove(1);
        System.out.println(lista);

        System.out.println("---------------------");
        Conta cc3 = new ContaCorrente(33, 33);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(44, 44);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("---------------------");
        for(Object o: lista){
            System.out.println(o);
        }
        System.out.println("---------------------");
        lista.stream().forEach(System.out::println);
        System.out.println("---------------------");
        lista.stream().forEach(e -> System.out.println(e));
    }
}
