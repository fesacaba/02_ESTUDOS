package aula1;

import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(11,22);
        ContaCorrente cc2 = new ContaCorrente(33,44);
        ContaPoupanca cc3 = new ContaPoupanca(33,44);
        Cliente cliente = new Cliente();

        referencias[0] = cc1;
        referencias[1] = cc2;
        referencias[2] = cc3;
        referencias[3] = cliente;

        System.out.println(referencias[0]);
        System.out.println(referencias[1]);
        System.out.println(referencias[2]);
        System.out.println(referencias[3]);

    }}
