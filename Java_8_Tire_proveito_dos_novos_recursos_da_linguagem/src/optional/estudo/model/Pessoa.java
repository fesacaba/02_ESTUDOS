package optional.estudo.model;

import java.util.List;

public class Pessoa {

    private String nome;
    private String idade;
    private List<Endereco> end;
    private String chave;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public List<Endereco> getEnd() {
        return end;
    }

    public void setEnd(List<Endereco> end) {
        this.end = end;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", end=" + end +
                ", chave=" + chave +
                '}';
    }
}
