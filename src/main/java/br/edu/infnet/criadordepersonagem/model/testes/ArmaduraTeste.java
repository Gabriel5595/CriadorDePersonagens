package br.edu.infnet.criadordepersonagem.model.testes;


import br.edu.infnet.criadordepersonagem.model.negocio.Armadura;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ArmaduraObjectMapper;

import java.io.IOException;
import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.convertObjectToJson;

public class ArmaduraTeste {
    public static void main(String[] args) throws IOException {
        System.out.println("[Equipamentos] Classe iniciada com sucesso!\n");
        System.out.println("""
                Hora de encher a mochila! (Não se preocupe, você vai ganhar uma mochila).
                Você poderá escolher uma arma, uma armadura e a sua mochila será preenchida automaticamente com tudo que um aventureiro precisa.
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("E como serão as suas vestimentas no campo de batalha? Uma Cota de Malha, Couro ou um Gibão de " +
                "Peles?");

        String armaduraEscolhida = scanner.nextLine();

        boolean armaduraFinalizada = false;
        String armaduraFormatada = "";
        do{
            switch(armaduraEscolhida){
                case "Cota de Malha":
                    armaduraFormatada = "COTA_DE_MALHA";
                    armaduraFinalizada = true;
                    break;
                case "Couro":
                    armaduraFormatada = "COURO";
                    armaduraFinalizada = true;
                    break;
                case "Gibão de Peles":
                    armaduraFormatada = "GIBAO_DE_PELES";
                    armaduraFinalizada = true;
                    break;
                default:
                    System.out.println("A informação inserida não corresponde a nenhuma das opções possíveis. Verifica a " +
                            "ortografia da palavra utilizada e tente novamente");
            }
        } while(!armaduraFinalizada);

        Armadura armadura = ArmaduraObjectMapper.lerJson(armaduraFormatada);
        System.out.println(armadura.toString());

        String jsonArmadura = convertObjectToJson(armadura);
        appendJsonToExistingFile(jsonArmadura, "Armadura");

        ArmaduraObjectMapper.escreverJson(armadura);
    }
}
