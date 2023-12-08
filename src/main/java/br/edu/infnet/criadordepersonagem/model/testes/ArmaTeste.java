package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.Arma;
import br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON.ArmaObjectMapper;

import java.io.IOException;

public class ArmaTeste {
    public static void main (String[] args) throws IOException {
        Arma arma = ArmaObjectMapper.lerJson();
        System.out.println(arma.toString());
    }
}
