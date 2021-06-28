package aula1;

import model.Conta;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta cc) {
        this.referencias[this.posicaoLivre] = cc;
        posicaoLivre ++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int i) {
        return this.referencias[i];
    }
}
