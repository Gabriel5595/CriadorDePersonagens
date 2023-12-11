package br.edu.infnet.criadordepersonagem.model.service.mappers.JSON;

import br.edu.infnet.criadordepersonagem.model.negocio.Classe;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class ClasseObjectMapper {
    public static Classe lerJson(String classeFormatada) throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/classe/classe_"+classeFormatada+".json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, Classe.class);
    }

    public static void escreverJson(Classe classe) {
        String nomeDoArquivoJson = "classeEscolhida";
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/"+nomeDoArquivoJson+".json";

        CriaArquivoJson.criarArquivoJson(caminho);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            objectMapper.writeValue(new File(caminho), classe);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Classe lerOpcaoEscolhida() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/classeEscolhida.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, Classe.class);
    }
}
