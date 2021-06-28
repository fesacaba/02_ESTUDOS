package aula6;

public class outoTeste {

    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue());//unboxing

        Double dRef = Double.valueOf(26);//autoboxing
        System.out.println(dRef.doubleValue());//unboxing

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        Number nRef = Integer.valueOf(28); //autoboxing
        System.out.println(nRef);
    }
}
