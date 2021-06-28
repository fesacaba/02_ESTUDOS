package aula1;

public class TesteArrayPrimitivo {

    public static void main(String[] args) {
        int[] idades = new int[5];
        for (int i = 0; i <idades.length; i++){
            idades[i] = i*1;
        }
        for (int i = 0; i <idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}
