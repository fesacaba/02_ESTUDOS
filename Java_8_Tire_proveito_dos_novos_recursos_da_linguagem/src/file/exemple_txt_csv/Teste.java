package file.exemple_txt_csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) throws IOException {

        List<String> lista = new ArrayList<String>();
        lista.add("teste");
        lista.add("teste2");
        String data = "one two three four" + "\n" +
                "one two three four";
        //Use a BufferedReader to read from actual Text file
        String csv = data.replace(" ", ",");
        System.out.println(csv);

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("MyCSV.csv")));
        out.println(lista);
        out.close();
    }
}
