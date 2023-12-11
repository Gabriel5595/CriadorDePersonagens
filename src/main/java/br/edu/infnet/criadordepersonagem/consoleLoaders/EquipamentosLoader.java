package br.edu.infnet.criadordepersonagem.consoleLoaders;

import br.edu.infnet.criadordepersonagem.model.negocio.Arma;
import br.edu.infnet.criadordepersonagem.model.negocio.Armadura;
import br.edu.infnet.criadordepersonagem.model.negocio.Dinheiro;
import br.edu.infnet.criadordepersonagem.model.negocio.OutrosEquip;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ArmaObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ArmaduraObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.DinheiroObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.OutrosEquipObjectMapper;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.convertObjectToJson;

@Order(5)
@Component
public class EquipamentosLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("[Equipamentos] Classe iniciada com sucesso!\n");
        System.out.println("""
                Hora de encher a mochila! (Não se preocupe, você vai ganhar uma mochila).
                Você poderá escolher uma arma, uma armadura e a sua mochila será preenchida automaticamente com tudo que um aventureiro precisa.
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Como você se vê batalhando? Com um Espada Curta, uma Adaga ou um Arco Longo?");

        String armaEscolhida = scanner.nextLine();

        boolean armaFinalizada = false;
        String armaFormatada = "";
        do{
            switch(armaEscolhida){
                case "Espada Curta":
                    armaFormatada = "ESPADA_CURTA";
                    armaFinalizada = true;
                    break;
                case "Adaga":
                    armaFormatada = "ADAGA";
                    armaFinalizada = true;
                    break;
                case "Arco Longo":
                    armaFormatada = "ARCO_LONGO";
                    armaFinalizada = true;
                    break;
                default:
                    System.out.println("A informação inserida não corresponde a nenhuma das opções possíveis. Verifica a " +
                            "ortografia da palavra utilizada e tente novamente");
            }
        } while(!armaFinalizada);

        Arma arma = ArmaObjectMapper.lerJson(armaFormatada);
        System.out.println(arma.toString());

        ArmaObjectMapper.escreverJson(arma);

        String jsonArma = convertObjectToJson(arma);
        appendJsonToExistingFile(jsonArma, "Arma");

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

        ArmaduraObjectMapper.escreverJson(armadura);

        String jsonArmadura = convertObjectToJson(armadura);
        appendJsonToExistingFile(jsonArmadura, "Armadura");

        System.out.println("""
                Quem diria! Já saiu da casa dos seus pais? Porque o seu personagem acabou de ganhar uma GRANA!
                Isso mesmo! Estamos enchendo os seus bolsos!
                """);

        Dinheiro dinheiro = new Dinheiro();
        dinheiro.adicionaDinheiro(100,50,2,0);
        System.out.println(dinheiro.toString());

        DinheiroObjectMapper.escreverJson(dinheiro);

        String jsonDinheiro = convertObjectToJson(dinheiro);
        appendJsonToExistingFile(jsonDinheiro, "Dinheiro");

        OutrosEquip outrosEquip = new OutrosEquip();
        outrosEquip.adicionaOutrosEquip("Carda de Cânhamo", 1);
        outrosEquip.adicionaOutrosEquip("Tocha", 6);
        outrosEquip.adicionaOutrosEquip("Mochila", 1);
        outrosEquip.adicionaOutrosEquip("Capa", 1);
        outrosEquip.adicionaOutrosEquip("Ração", 30);

        System.out.println(outrosEquip.toString());

        OutrosEquipObjectMapper.escreverJson(outrosEquip);

        String jsonOutrosEquip = convertObjectToJson(outrosEquip);
        appendJsonToExistingFile(jsonOutrosEquip, "Outros Equipamentos");
    }
}
