package optional.teste;

import optional.model.Seguro;

import java.math.BigDecimal;
import java.util.Optional;

public class TesteOptional {

    public static void main(String[] args) {
        Seguro seguro = new Seguro("Franquia reduzida", new BigDecimal("600"));

//        Se não tem certeza se vai vir alguma coisa
        Optional<Seguro> seguroOpcional = Optional.ofNullable(null);


    }
}
