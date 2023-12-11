package br.edu.infnet.criadordepersonagem.model.service.mappers.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class ClassToJSON {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> String convertObjectToJson(T object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void appendJsonToExistingFile(String newJson, String identifier) {
        String existingFileName = "./src/main/java/br/edu/infnet/criadordepersonagem/recursos/JSON/personagem/Personagem.json";
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(existingFileName, "rw")) {
            long fileLength = randomAccessFile.length();

            if (fileLength == 0) {
                randomAccessFile.write("{".getBytes());
                randomAccessFile.write(("\"" + identifier + "\":" + newJson).getBytes());
                randomAccessFile.write("}".getBytes());
                System.out.println("Informações adicionadas ao arquivo " + existingFileName);
            }
            if (fileLength > 0) {
                randomAccessFile.seek(fileLength - 1); // Posiciona o ponteiro no último caractere do arquivo
                char lastChar = (char) randomAccessFile.readByte();

                if (lastChar == '}') {

                    randomAccessFile.seek(fileLength - 1);
                    randomAccessFile.setLength(fileLength - 1);
                    long newFileLength = randomAccessFile.length();

                    randomAccessFile.seek(newFileLength - 1);
                    char newLastChar = (char) randomAccessFile.readByte();

                    if (newLastChar == '}' || newLastChar == '\n') {

                        randomAccessFile.write(",".getBytes());
                        randomAccessFile.write(("\"" + identifier + "\":" + newJson).getBytes());
                        randomAccessFile.write("}".getBytes());
                        System.out.println("Informações adicionadas ao arquivo " + existingFileName);

                    } else if (newLastChar == '{') {

                        randomAccessFile.write(("\"" + identifier + "\":" + newJson).getBytes());
                        randomAccessFile.write("}".getBytes());
                        System.out.println("Informações adicionadas ao arquivo " + existingFileName);

                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}