package montarnovo;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("logica 1", 10, 1.5, 1.5);
        Aluno aluno2 = new Aluno("logica 2", 10, 4.5, 4.5);
        Aluno aluno3 = new Aluno("logica 3", 10, 4.5, 4.5);
        Aluno aluno4 = new Aluno("logica 4", 10, 4.5, 4.5);
        Aluno aluno5 = new Aluno("logica 5", 10, 4.5, 4.5);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

        System.out.println("-------------");
        System.out.println("Solucao com java 7");
        System.out.println("-------------");

        double score = 0;

        for (Aluno alun : alunos) {
            if (alun.getDisciplina().equals("logica 1")) {
                score = alun.getScore();
            }
            alun.setNota(alun.getNota() + score);
            if (!alun.getDisciplina().equals("logica 1")){
                System.out.println(alun);
            }
        }

        System.out.println("-------------");
        System.out.println("Solucao com java 8");
        System.out.println("-------------");

    }
}
