package optional.model;

public class Motorista {

    private String nome;
    private int idade;
    private Caminhao caminhao;

    public Motorista(String nome, int idade, Caminhao caminhao) {
        this.nome = nome;
        this.idade = idade;
        this.caminhao = caminhao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }
}
