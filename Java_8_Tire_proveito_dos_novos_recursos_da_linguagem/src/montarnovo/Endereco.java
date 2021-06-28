package montarnovo;

public class Endereco {

    private String nomeRua;
    private int numeroRua;

    public Endereco() {
    }

    public Endereco(String nomeRua, int numeroRua) {
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "nomeRua='" + nomeRua + '\'' +
                ", numeroRua=" + numeroRua +
                '}';
    }
}
