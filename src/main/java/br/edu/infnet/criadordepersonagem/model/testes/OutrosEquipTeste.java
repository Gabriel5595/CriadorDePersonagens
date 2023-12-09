package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.OutrosEquip;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.convertObjectToJson;

public class OutrosEquipTeste {
    public static void main(String[] args) {
        OutrosEquip outrosEquip = new OutrosEquip();
        outrosEquip.adicionaOutrosEquip("Carda de Cânhamo", 1);
        outrosEquip.adicionaOutrosEquip("Tocha", 6);
        outrosEquip.adicionaOutrosEquip("Mochila", 1);
        outrosEquip.adicionaOutrosEquip("Capa", 1);
        outrosEquip.adicionaOutrosEquip("Ração", 30);

        System.out.println(outrosEquip.toString());

        String jsonOutrosEquip = convertObjectToJson(outrosEquip);
        appendJsonToExistingFile(jsonOutrosEquip, "Outros Equipamentos");
    }
}
