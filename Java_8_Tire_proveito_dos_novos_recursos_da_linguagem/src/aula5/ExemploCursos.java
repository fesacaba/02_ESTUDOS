package aula5;

import aula4.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 133));
        cursos.add(new Curso("C", 55));


        System.out.println("");
        System.out.println("--- Java 8 - Optional");
        Optional<Curso> optionalCurso = cursos
                .stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny();

        Curso curso = optionalCurso.orElse(null);
        System.out.println(curso.getNome());

        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("");
        System.out.println("--- Java 8 - Optional / Com if Present");

        cursos
                .stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("");
        System.out.println("--- Java 8 - Optional / Optional Double - SUM");

        OptionalDouble media = cursos
                .stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();
        System.out.println(media.getAsDouble());

        System.out.println("");
        System.out.println("--- Java 8 - Optional / Return to list");

        List<Curso> newCursos = cursos
                .stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());

        System.out.println(newCursos.iterator().next().getNome());
        //é possivel atribuir a nova lista para a antiga

        System.out.println("");
        System.out.println("--- Java 8 - Optional / Return to list / MAP");

        cursos
                .stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));


        System.out.println("");
        System.out.println("--- Java 8 - Optional / Paralelo /  Return to list / MAP");

        cursos
                .parallelStream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

    }
}
