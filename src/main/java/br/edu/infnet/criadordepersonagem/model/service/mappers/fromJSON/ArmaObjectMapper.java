package br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON;

import br.edu.infnet.criadordepersonagem.model.negocio.Arma;
import com.fasterxml.jackson.databind.ObjectMapper;

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
}
