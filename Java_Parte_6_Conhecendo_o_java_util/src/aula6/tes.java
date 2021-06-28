package aula6;

import java.util.ArrayList;
import java.util.List;

public class tes {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>();
        List<String> numerosString = new ArrayList<String>();

        int idade = 29; //usando o tipo primitivo
        numeros.add(idade);

        Integer idadeRef = Integer.valueOf(19); // usando wrapper
        numeros.add(idadeRef);

        // Parsing para String
        String string = idadeRef.toString();
        numerosString.add(string);

        numeros.add(26); //Autoboxing
        System.out.println(numeros);
        System.out.println(numerosString);

        //De String dentro de uma lista para Integer
        List<String> s = new ArrayList<String>();
        s.add("1");
        String p =  s.get(0);

        Integer numeroS = Integer.valueOf(p);

        System.out.println(numeroS);


        //Comparar
        Integer num1 = 1;
        Integer num2 = 1;
        System.out.println(num1.compareTo(num2));

    }
}
