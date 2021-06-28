package optional.teste;

import optional.model.Caminhao;
import optional.model.Motorista;
import optional.model.Seguro;
import optional.repository.Motoristas;

public class ConsultaCobertura {

    public static void main(String[] args) {
        Motoristas motoristas = new Motoristas();
        Motorista motorista = motoristas.porNome("Jose");

        //Vamos tratar do modo Feiao
        String cobertura = "Sem seguro";
        if (motorista.getCaminhao() != null) {
            Caminhao caminhao = motorista.getCaminhao();
            if (caminhao != null) {
                Seguro seguro = caminhao.getSeguro();
                if (seguro != null) {
                    cobertura = seguro.getCobertura();
                }
            }
        }

        System.out.println(cobertura);
    }

}
