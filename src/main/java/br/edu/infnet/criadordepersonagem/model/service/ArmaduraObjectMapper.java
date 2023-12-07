package br.edu.infnet.criadordepersonagem.model.service;

import br.edu.infnet.criadordepersonagem.model.negocio.Arma;
import br.edu.infnet.criadordepersonagem.model.negocio.Armadura;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ArmaduraObjectMapper {
    public static Armadura lerJson() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/armadura/Armadura_COTA_DE_MALHA.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado");
        } else {
            System.out.println("Arquivo encontrado com sucesso!");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, Armadura.class);
    }
}
