package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.*;
import br.edu.infnet.criadordepersonagem.model.service.ArmaObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.ArmaduraObjectMapper;

import java.io.IOException;

public class EquipamentosTeste {
    public static void main (String[] args) throws IOException {
        //Instância da classe Arma
        Arma arma = ArmaObjectMapper.lerJson();
        //System.out.println(arma);

        //Instância da classe Armadura
        Armadura armadura = ArmaduraObjectMapper.lerJson();
        //System.out.println(armadura);

        //Instância da classe OutrosEquips
        OutrosEquip outrosEquip = new OutrosEquip("tocha",1);
        //System.out.println(outrosEquip);

        //Instância da classe Dinheiro
        Dinheiro dinheiro = new Dinheiro(100, 50,10,2);
        //System.out.println(dinheiro);

        //Instância da classe Equipamentos e impressão
        Equipamentos equipamentos = new Equipamentos(dinheiro);
        equipamentos.adicionarArma(arma);
        equipamentos.adicionarArmadura(armadura);
        equipamentos.adicionarOutrosEquips(outrosEquip);
        System.out.println(equipamentos);

        //TESTE OK
    }
}
