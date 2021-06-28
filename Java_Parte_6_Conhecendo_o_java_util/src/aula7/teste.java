package aula7;

import model.Conta;
import model.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class teste {
    public static void main(String[] args) {


        Conta cc = new ContaCorrente(22,33);
        cc.deposita(333.0);

        Conta cc2 = new ContaCorrente(22,44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22,11);
        cc3.deposita(333.0);

        Conta cc4 = new ContaCorrente(22,22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta: lista) {
            System.out.println(conta);
        }

        //ordernar lista
        lista.sort(new NumeroDaContaComparator());
        System.out.println("----------------");

        for (Conta conta: lista) {
            System.out.println(conta);
        }

    }
}

 class NumeroDaContaComparator implements Comparator<Conta> {

     @Override
     public int compare(Conta c1, Conta c2) {

//         if(c1.getNumero() < c2.getNumero()){
//             return -1;
//         }
//         if(c1.getNumero() > c2.getNumero()){
//             return 1;
//         }

//         return c1.getNumero() - c2.getNumero();

         return Integer.compare(c1.getNumero(), c2.getNumero());
     }
 }
