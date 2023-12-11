package br.edu.infnet.criadordepersonagem.model.service.mappers.JSON;

import br.edu.infnet.criadordepersonagem.model.negocio.PersonagemBasico;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class PersonagemBasicoObjectMapper {
    public static void escreverJson(PersonagemBasico personagemBasico) {
        String nomeDoArquivoJson = "personagemBasicoEscolhido";
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/"+nomeDoArquivoJson+".json";

        CriaArquivoJson.criarArquivoJson(caminho);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            objectMapper.writeValue(new File(caminho), personagemBasico);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PersonagemBasico lerOpcaoEscolhida() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/personagemBasicoEscolhido.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, PersonagemBasico.class);
    }
}
