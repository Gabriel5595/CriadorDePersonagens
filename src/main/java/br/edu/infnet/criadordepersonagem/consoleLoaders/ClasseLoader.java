package br.edu.infnet.criadordepersonagem.consoleLoaders;

import br.edu.infnet.criadordepersonagem.model.negocio.Classe;
import br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON.ClasseObjectMapper;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.convertObjectToJson;

@Order(4)
@Component
public class ClasseLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("\n[Classe] Classe iniciada com sucesso!\n");
        System.out.println("""
                E o que você faz nesse mundo fantástico? Está na hora de escolher a sua classe!
                As classes disponíveis são Guerreiro, Patrulheiro ou Ladino.
                
                Guerreiro é talvez a mais diversificada classe de personagens nos mundos de DUNGEONS & DRAGONS. Cavaleiros em missões, lordes conquistadores, campeões reais, infantaria de elite, mercenários rígidos e bandidos reis, como guerreiros, eles compartilham de uma maestria com armas e armaduras sem precedentes, bem como um vasto conhecimento e habilidades em combate. E eles estão bem familiarizados com a morte, seja simplesmente conhecendo-a ou desafiando-a cara a cara.
                
                Patrulheiro é de aparência áspera e selvagem, um humano espreita sozinho através das sombras das árvores, caçando os orcs que ele sabe estarem planejando um assalto a uma fazenda próxima. Segurando uma espada curta em cada mão, ele se transforma em um vendaval de aço, talando um inimigo após o outro.
                
                Ladinos contam com sua perícia, furtividade e as vulnerabilidades de seus inimigos para obter vantagem em qualquer situação. Eles possuem uma habilidade especial para encontrar a solução para praticamente qualquer problema, demonstrando desenvoltura e versatilidade, a chave de qualquer grupo aventureiro de sucesso.
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual classe você escolhe? Guerreiro, Patrulheiro ou Ladino?");
        String classeEscolhida = scanner.nextLine();

        boolean finalizado = false;
        String classeFormatada = "";
        do{
            switch(classeEscolhida){
                case "Guerreiro":
                    classeFormatada = "GUERREIRO";
                    finalizado = true;
                    break;
                case "Patrulheiro":
                    classeFormatada = "PATRULHEIRO";
                    finalizado = true;
                    break;
                case "Ladino":
                    classeFormatada = "LADINO";
                    finalizado = true;
                    break;
                default:
                    System.out.println("A informação inserida não corresponde a nenhuma das opções possíveis. Verifica a " +
                            "ortografia da palavra utilizada e tente novamente");
            }
        } while(!finalizado);

        Classe classe = ClasseObjectMapper.lerJson(classeFormatada);
        System.out.println(classe.toString());

        String jsonClasse = convertObjectToJson(classe);
        appendJsonToExistingFile(jsonClasse, "Classe");
    }
}
