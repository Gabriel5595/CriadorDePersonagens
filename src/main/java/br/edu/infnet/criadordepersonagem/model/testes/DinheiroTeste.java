package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.Dinheiro;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.convertObjectToJson;

public class DinheiroTeste {
    public static void main(String[] args) {
        System.out.println("""
                Quem diria! Já saiu da casa dos seus pais? Porque o seu personagem acabou de ganhar uma GRANA!
                Isso mesmo! Estamos enchendo os seus bolsos!
                """);

        Dinheiro dinheiro = new Dinheiro(100, 50,10,0);
        System.out.println(dinheiro.toString());

        String jsonDinheiro = convertObjectToJson(dinheiro);
        appendJsonToExistingFile(jsonDinheiro, "Dinheiro");
    }
}
