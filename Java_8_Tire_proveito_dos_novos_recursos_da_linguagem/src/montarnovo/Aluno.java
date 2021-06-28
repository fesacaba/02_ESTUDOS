package montarnovo;

public class Aluno {

    private String disciplina;
    private int idade;
    private double nota;
    private double score;

    public Aluno() {
    }

    public Aluno(String disciplina, int idade, double nota, double score) {
        this.disciplina = disciplina;
        this.idade = idade;
        this.nota = nota;
        this.score = score;
    }


    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "disciplina='" + disciplina + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                ", score=" + score +
                '}';
    }
}
