package aula6;

import java.io.*;

public class TesteSerializacao {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


//        Cliente cliente = new Cliente();
//        cliente.setCpf("35272352807");
//        cliente.setNome("Felipe Barreto");
//        cliente.setProfissao("Analista de Sistema");
//
////        String nome = "Felipe Barreto";
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente);
    }


}
