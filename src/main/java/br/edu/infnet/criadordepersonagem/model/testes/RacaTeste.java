package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.Raca;
import br.edu.infnet.criadordepersonagem.model.service.RacaObjectMapper;
import java.io.IOException;

public class RacaTeste {
    public static void main(String[] args) throws IOException {
        Raca raca = RacaObjectMapper.lerJson();
        System.out.println(raca.toString());
    }
}

//Teste OK
