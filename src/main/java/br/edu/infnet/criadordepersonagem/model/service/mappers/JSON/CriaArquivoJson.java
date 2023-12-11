package br.edu.infnet.criadordepersonagem.model.service.mappers.JSON;

import java.io.File;
import java.io.IOException;

public class CriaArquivoJson {
    public static void criarArquivoJson(String caminho) {
        try {
            File arquivoJson = new File(caminho);

            if (arquivoJson.createNewFile()) {
                System.out.println("Arquivo JSON criado: " + arquivoJson.getAbsolutePath());
            } else {
                System.out.println("O arquivo JSON já existe e foi substituido.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
