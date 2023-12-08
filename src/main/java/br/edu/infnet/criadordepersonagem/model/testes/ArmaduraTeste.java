package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.Armadura;
import br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON.ArmaduraObjectMapper;

import java.io.IOException;

public class ArmaduraTeste {
    public static void main(String[] args) throws IOException {
        Armadura armadura = ArmaduraObjectMapper.lerJson();
        System.out.println(armadura.toString());
    }
}
