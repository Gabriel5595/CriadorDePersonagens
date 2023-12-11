package br.edu.infnet.criadordepersonagem.model.service.mappers.JSON;

import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDePericias;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class ModificadoresDeAtributosObjectMapper {
    public static void escreverJson(ModificadoresDePericias modificadoresDePericias) {
        String nomeDoArquivoJson = "modificadoresDePericiasEscolhidos";
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/" + nomeDoArquivoJson + ".json";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            // Criar ou substituir o arquivo JSON com o novo personagem
            objectMapper.writeValue(new File(caminho), modificadoresDePericias);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ModificadoresDePericias lerOpcaoEscolhida() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/modificadoresDePericiasEscolhidos.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, ModificadoresDePericias.class);
    }
}
