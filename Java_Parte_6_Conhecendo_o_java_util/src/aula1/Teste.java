package aula1;

import model.Conta;
import model.ContaCorrente;

public class Teste {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);
        Conta cc2 = new ContaCorrente(22,11);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref);
    }
}
