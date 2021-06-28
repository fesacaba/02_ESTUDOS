package optional.estudo;

import optional.estudo.model.Endereco;
import optional.estudo.model.Pessoa;
import optional.estudo.model.chave.ChaveDePessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestDeOpcao {

    public static void main(String[] args) {

        Endereco end1 = new Endereco();
        end1.setRua("Alpes");
        end1.setNumero("269");
        end1.setBairro("Jardim Presidente Dutra");
        end1.setCidade("Guarulhos");

        Endereco end2 = new Endereco();
        end2.setRua("Joaquim Carlos");
        end2.setNumero("1194");
        end2.setBairro("Bras");
        end2.setCidade("São Paulo");

        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(end1);
        enderecos.add(end2);

        Pessoa felipe = new Pessoa();
        felipe.setNome("Felipe");
        felipe.setIdade("33");
        felipe.setEnd(enderecos);


        ChaveDePessoa chave = new ChaveDePessoa();
        chave.setNome(felipe.getNome());
        chave.setIdade(felipe.getIdade());
        chave.setNumero(gerarNumero(enderecos));
        felipe.setChave(chave.toString());

        System.out.println(felipe);
    }


    private static String gerarNumero(List<Endereco> enderecos) {
        Optional<String> numero = enderecos
                .stream()
                .map(e -> e.getNumero())
                .findFirst();

        String valor = numero.get();
        return valor;
    }
}
