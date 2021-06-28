package aula1;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object cc) {
        this.referencias[this.posicaoLivre] = cc;
        posicaoLivre ++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int i) {
        return this.referencias[i];
    }
}
