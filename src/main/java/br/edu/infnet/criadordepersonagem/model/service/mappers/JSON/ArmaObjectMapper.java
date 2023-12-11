package br.edu.infnet.criadordepersonagem.model.service.mappers.JSON;

import br.edu.infnet.criadordepersonagem.model.negocio.Arma;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class ArmaObjectMapper {
    public static Arma lerJson(String arma) throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/arma/Arma_"+arma+".json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, Arma.class);
    }

    public static void escreverJson(Arma arma) {
        String nomeDoArquivoJson = "armaEscolhida";
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/"+nomeDoArquivoJson+".json";

        CriaArquivoJson.criarArquivoJson(caminho);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            // Criar ou substituir o arquivo JSON com o novo personagem
            objectMapper.writeValue(new File(caminho), arma);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Arma lerOpcaoEscolhida() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/classe/armaEscolhida.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, Arma.class);
    }
}
