package br.edu.infnet.criadordepersonagem.model.testes;


import br.edu.infnet.criadordepersonagem.model.negocio.Atributos;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.AtributosObjectMapper;

import static br.edu.infnet.criadordepersonagem.model.negocio.Atributos.sorteiaAtributos;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.convertObjectToJson;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModificadoresDeAtributosTeste {
    public static void main(String[] args) {
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

        //Instancia atributos novos
        Atributos atributos = new Atributos();
        //adiciona os atributos
        atributos.adicionaAtributos(forca, destreza, constituicao, inteligencia, sabedoria, carisma);
        System.out.print(atributos);

        //Cria arquivo Json com a classe finalizada.
        AtributosObjectMapper.escreverJson(atributos);

        //Adiciona a classe finalizada ao arquivo personagem.json
        String jsonAtributos = convertObjectToJson(atributos);
        appendJsonToExistingFile(jsonAtributos, "Atributos e Modificadores");
    }
}
