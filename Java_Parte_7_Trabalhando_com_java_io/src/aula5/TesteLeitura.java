package aula5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas2.csv"), "UTF-8");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner linhasScanner = new Scanner(linha);
            linhasScanner.useLocale(Locale.US);
            linhasScanner.useDelimiter(",");

            String tipoDaConta = linhasScanner.next();
            int agencia = linhasScanner.nextInt();
            int numero = linhasScanner.nextInt();
            String titular = linhasScanner.next();
            double saldo = linhasScanner.nextDouble();

            String value = String.format(new Locale("pt","BR") ,
                    "%s - %04d-%08d, %20s: %05.2f",
                    tipoDaConta, agencia, numero, titular, saldo);

            System.out.println(value);

            linhasScanner.close();
            /*String[] valores = linha.split(",");
            System.out.println(Arrays.toString(valores));
            System.out.println(valores[3]);*/
        }

        scanner.close();
    }
}
