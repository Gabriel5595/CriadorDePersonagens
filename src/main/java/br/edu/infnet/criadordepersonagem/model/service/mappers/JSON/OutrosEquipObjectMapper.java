package br.edu.infnet.criadordepersonagem.model.service.mappers.JSON;

import br.edu.infnet.criadordepersonagem.model.negocio.OutrosEquip;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class OutrosEquipObjectMapper {
    public static void escreverJson(OutrosEquip outrosEquip) {
        String nomeDoArquivoJson = "outrosEquipsEscolhidos";
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/"+nomeDoArquivoJson+".json";

        CriaArquivoJson.criarArquivoJson(caminho);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            objectMapper.writeValue(new File(caminho), outrosEquip);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static OutrosEquip lerOpcaoEscolhida() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/outrosEquipsEscolhidos.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, OutrosEquip.class);
    }
}
