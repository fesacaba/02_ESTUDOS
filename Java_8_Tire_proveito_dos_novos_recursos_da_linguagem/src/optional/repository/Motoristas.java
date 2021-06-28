package optional.repository;

import optional.model.Caminhao;
import optional.model.Motorista;
import optional.model.Seguro;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Motoristas {
    private Map<String, Motorista> motoristas = new HashMap<>();

    public Motoristas() {
        Seguro seguro = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Mercedes", seguro);
        Motorista motoristaJoao = new Motorista("Joao", 40, caminhao);
        Motorista motoristaJose = new Motorista("Jose", 25, null);

        motoristas.put("Joao", motoristaJoao);
        motoristas.put("Jose", motoristaJose);
    }

    public Motorista porNome(String nome) {
        return motoristas.get(nome);
    }
}
