package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.*;
import br.edu.infnet.criadordepersonagem.model.service.mappers.ArmaObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.ArmaduraObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.ClasseObjectMapper;

import java.io.IOException;

public class VidaEDefesaTeste {
    public static void main(String[] args) throws IOException {
        Classe classe = ClasseObjectMapper.lerJson();

        Arma arma = ArmaObjectMapper.lerJson();
        Armadura armadura = ArmaduraObjectMapper.lerJson();
        OutrosEquip outrosEquip = new OutrosEquip("tocha",1);
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
