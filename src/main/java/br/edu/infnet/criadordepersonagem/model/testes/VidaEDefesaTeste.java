package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.*;
import br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON.ArmaObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON.ArmaduraObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON.ClasseObjectMapper;

import java.io.IOException;

public class VidaEDefesaTeste {
    public static void main(String[] args) throws IOException {
        Classe classe = ClasseObjectMapper.lerJson("ANAO");

        Arma arma = ArmaObjectMapper.lerJson("ESPADA_CURTA");
        Armadura armadura = ArmaduraObjectMapper.lerJson("COTA_DE_MALHA");
        OutrosEquip outrosEquip = new OutrosEquip();
        outrosEquip.adicionaOutrosEquip("Carda de Cânhamo", 1);
        Dinheiro dinheiro = new Dinheiro(100, 50,10,2);
        Equipamentos equipamentos = new Equipamentos(dinheiro);
        equipamentos.adicionarArma(arma);
        equipamentos.adicionarArmadura(armadura);
        equipamentos.adicionarOutrosEquips(outrosEquip);

        ModificadoresDeAtributos modificadoresDeAtributos = new ModificadoresDeAtributos(15, 16, 18, 17, 20, 11);

        VidaEDefesa vidaEDefesa = new VidaEDefesa(classe, equipamentos, modificadoresDeAtributos);
        System.out.println(vidaEDefesa);
    }
}
