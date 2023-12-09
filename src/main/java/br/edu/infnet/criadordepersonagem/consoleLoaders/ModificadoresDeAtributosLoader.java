package br.edu.infnet.criadordepersonagem.consoleLoaders;


import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDeAtributos;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDeAtributos.sorteiaAtributos;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.convertObjectToJson;

@Order(2)
@Component
public class ModificadoresDeAtributosLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("[Atributos e Modificadores de Atributos] Classe iniciada com sucesso!\n");
        System.out.println("""
                Muito do que o personagem faz no jogo depende de seus seis atributos: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma.
                Para definí-las serão rolados 4 dados de 6 lados (4d6). Dentre esses resultados os menor deles será descartado e os três restantes serão somados.
                Esse processo será repetido 6 vezes.
                Ao final do processo os 6 resultados serão apresentados e você poderá escrever a ordem dos atributos respectivo a cada resultado.
                """);
        List<Integer> listaSorteadaCompleta = sorteiaAtributos();

        Scanner scanner = new Scanner(System.in);
        List<String> atributosEscolhidos = new ArrayList<>();
        int forca = 0;
        int destreza = 0;
        int constituicao = 0;
        int inteligencia = 0;
        int sabedoria = 0;
        int carisma = 0;
        int escolhas = 0;
        do{
            System.out.println("Com base na lista apresentada acima, escreva o nome de cada atributo sem repetí-los.");
            String escolhaDoUsuario = scanner.nextLine();
            if(!atributosEscolhidos.contains(escolhaDoUsuario)){
                switch(escolhaDoUsuario){
                    case "Força":
                        forca = listaSorteadaCompleta.get(escolhas);
                        System.out.println("O valor na posição " + (escolhas+1) + " foi adicionado ao atributo Força.\n");
                        atributosEscolhidos.add(escolhaDoUsuario);
                        escolhas++;
                        break;
                    case "Destreza":
                        destreza = listaSorteadaCompleta.get(escolhas);
                        System.out.println("O valor na posição " + (escolhas+1) + " foi adicionado ao atributo Destreza.\n");
                        atributosEscolhidos.add(escolhaDoUsuario);
                        escolhas++;
                        break;
                    case "Constituição":
                        constituicao = listaSorteadaCompleta.get(escolhas);
                        System.out.println("O valor na posição " + (escolhas+1) + " foi adicionado ao atributo Constituição.\n");
                        atributosEscolhidos.add(escolhaDoUsuario);
                        escolhas++;
                        break;
                    case "Inteligência":
                        inteligencia = listaSorteadaCompleta.get(escolhas);
                        System.out.println("O valor na posição " + (escolhas+1) + " foi adicionado ao atributo Inteligência.\n");
                        atributosEscolhidos.add(escolhaDoUsuario);
                        escolhas++;
                        break;
                    case "Sabedoria":
                        sabedoria = listaSorteadaCompleta.get(escolhas);
                        System.out.println("O valor na posição " + (escolhas+1) + " foi adicionado ao atributo Sabedoria.\n");
                        atributosEscolhidos.add(escolhaDoUsuario);
                        escolhas++;
                        break;
                    case "Carisma":
                        carisma = listaSorteadaCompleta.get(escolhas);
                        System.out.println("O valor na posição " + (escolhas+1) + " foi adicionado ao atributo Carisma.\n");
                        atributosEscolhidos.add(escolhaDoUsuario);
                        escolhas++;
                        break;
                    default:
                        System.out.println("A informação inserida não corresponde a nenhuma das opções possíveis. Verifica a " +
                                "ortografia da palavra utilizada e tente novamente");
                }
            } else {
                System.out.println("A opção escolhida não é válida pois já foi utilizada anteriormente. Tente novamente.");
            }
        } while (escolhas < 6);

        ModificadoresDeAtributos modificadoresDeAtributos = new ModificadoresDeAtributos(forca, destreza, constituicao,
                inteligencia, sabedoria, carisma);
        System.out.print(modificadoresDeAtributos);
        String jsonModificadoresDeAtributo = convertObjectToJson(modificadoresDeAtributos);
        appendJsonToExistingFile(jsonModificadoresDeAtributo, "Modificadores de Atributos");
    }

}
