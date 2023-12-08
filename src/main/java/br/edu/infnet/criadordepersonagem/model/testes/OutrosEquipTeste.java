package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.OutrosEquip;

public class OutrosEquipTeste {
    public static void main(String[] args) {
        OutrosEquip tocha = new OutrosEquip("tocha", 1);
        System.out.println(tocha.toString());
    }
}
