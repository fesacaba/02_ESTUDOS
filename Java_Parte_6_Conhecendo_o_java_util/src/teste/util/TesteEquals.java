package teste.util;

import model.Conta;
import model.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteEquals {

    public static void main(String[] args) {

        //contains
        //Arraylist ele reorganiza toda a lista quando vc remove um
        List<Conta> lista = new ArrayList<Conta >();

        Conta conta1 = new ContaCorrente(22, 1);
        lista.add(conta1);
        Conta conta2 = new ContaCorrente(22, 22);
        lista.add(conta2);
        Conta conta3 = new ContaCorrente(22, 22);
        boolean esta = lista.contains(conta3);

        System.out.println(esta);

        //LinkedList guarda referencia do elemente anterior e posterior - tem q interar em todos para saber o index

        List<Conta> listaLigada = new LinkedList<Conta >();
        listaLigada.add(conta1);
        System.out.println(lista);

        //Vetor  - Treadsave
        List<Conta> listaVetor = new Vector<Conta>();
        listaVetor.add(conta1);
        System.out.println("Vetor: " + listaVetor);


    }
}
