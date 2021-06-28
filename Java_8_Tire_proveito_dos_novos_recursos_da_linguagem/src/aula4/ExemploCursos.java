package aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 133));
        cursos.add(new Curso("C", 55));


        System.out.println("");
        System.out.println("--- Java 8 - Ordenacao por critério");
        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("");
        System.out.println("--- Java 8 - Stream Filter");
        cursos
                .stream()
                .filter(c-> c.getAlunos() >= 100)
                .forEach(c -> System.out.println(c.getNome()));

        System.out.println("");
        System.out.println("--- Java 8 - Stream / Filter / Quantos alunos tem cada curso");
        cursos
                .stream()
                .filter(c-> c.getAlunos() >= 100)
                .map(c -> c.getAlunos())
                .forEach(total -> System.out.println(total));

        System.out.println("");
        System.out.println("--- Java 8 - Stream / Filter / Metodo Reference / Quantos alunos tem cada curso");
        cursos
                .stream()
                .filter(c-> c.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        System.out.println("");
        System.out.println("--- Java 8 - Stream / Filter / Metodo Reference / SUM / Quantos alunos tem cada curso");

        int soma = cursos
                .stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(soma);


    }
}
