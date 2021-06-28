package file.exemple_move;

import java.io.File;

public class Programa {

    public static void main(String[] args) {

        //origin
        File file = new File("/home/felipe/ProjetosPessoais/Estudos/01_Desenvolvedor_Java/Java_8_Tire_proveito_dos_novos_recursos_da_linguagem/src/file.exemple_move/arq2.txt");

        //destino
        if(file.renameTo
                (new File("/home/felipe/ProjetosPessoais/Estudos/01_Desenvolvedor_Java/Java_8_Tire_proveito_dos_novos_recursos_da_linguagem/src/file.exemple_move/pacote_teste/arq2.txt")))
        {
            file.delete();
            System.out.println("File moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }
}
