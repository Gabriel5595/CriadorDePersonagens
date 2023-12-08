package br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON;

import br.edu.infnet.criadordepersonagem.model.negocio.Raca;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class RacaObjectMapper {
    public static Raca lerJson() throws IOException {
        String caminho = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/raca/Raca_ANAO.json";
        File arquivoJson = new File(caminho);

        if (!arquivoJson.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(arquivoJson, Raca.class);
    }
}