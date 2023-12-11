package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.Arma;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ArmaObjectMapper;

import java.io.IOException;
import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.convertObjectToJson;

public class ArmaTeste {
    public static void main (String[] args) throws IOException {
        System.out.println("[Equipamentos] Classe iniciada com sucesso!\n");
        System.out.println("""
                Hora de encher a mochila! (Não se preocupe, você vai ganhar uma mochila).
                Você poderá escolher uma arma, uma armadura e a sua mochila será preenchida automaticamente com tudo que um aventureiro precisa.
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Como você se vê batalhando? Com um Espada Curta, uma Adaga ou um Arco Longo?");

        String armaEscolhida = scanner.nextLine();

        boolean finalizado = false;
        String armaFormatada = "";
        do{
            switch(armaEscolhida){
                case "Espada Curta":
                    armaFormatada = "ESPADA_CURTA";
                    finalizado = true;
                    break;
                case "Adaga":
                    armaFormatada = "ADAGA";
                    finalizado = true;
                    break;
                case "Arco Longo":
                    armaFormatada = "ARCO_LONGO";
                    finalizado = true;
                    break;
                default:
                    System.out.println("A informação inserida não corresponde a nenhuma das opções possíveis. Verifica a " +
                            "ortografia da palavra utilizada e tente novamente");
            }
        } while(!finalizado);

        Arma arma = ArmaObjectMapper.lerJson(armaFormatada);
        System.out.println(arma.toString());

        String jsonArma = convertObjectToJson(arma);
        appendJsonToExistingFile(jsonArma, "Arma");
    }
}
