package br.edu.infnet.criadordepersonagem.model.testes;


import br.edu.infnet.criadordepersonagem.model.negocio.Classe;
import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDePericias;
import br.edu.infnet.criadordepersonagem.model.negocio.Pericias;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.AtributosObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClasseObjectMapper;
import br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.PericiasObjectMapper;

import java.io.IOException;
import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.JSON.ClassToJSON.convertObjectToJson;

public class ClasseTeste {
    public static void main(String[] args) throws IOException {
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
                    //Cria Instancia classe Pericias
                    Pericias periciasGuerreiro = new Pericias();
                    //Adiciona informação a classe Pericia sem o construtor
                    periciasGuerreiro.adicionarPericias(false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false);
                    //Transforma classe me arquivo Json
                    PericiasObjectMapper.escreverJson(periciasGuerreiro);

                    //Cria Instancia classe ModificadorDePericia
                    ModificadoresDePericias modificadoresDePericiasGuerreiro = new ModificadoresDePericias();
                    //Adiciona informação a classe ModificadorDePericia sem o construtor
                    modificadoresDePericiasGuerreiro.adicionarModificadoresDePericias(AtributosObjectMapper.lerOpcaoEscolhida(), periciasGuerreiro);
                    //Imprime os atributos
                    System.out.println(modificadoresDePericiasGuerreiro.toString());

                    //Transforma classe em arquivo Json
                    String jsonPericiasGuerreiro = convertObjectToJson(modificadoresDePericiasGuerreiro);
                    appendJsonToExistingFile(jsonPericiasGuerreiro, "Perícias");
                    finalizado = true;
                    break;
                case "Patrulheiro":
                    classeFormatada = "PATRULHEIRO";

                    Pericias periciasPatrulheiro = new Pericias();
                    periciasPatrulheiro.adicionarPericias(false,false,true,false,false,false,false,false,false,true, false, false,true,false,false,false,true);

                    ModificadoresDePericias modificadoresDePericiasPatrulheiro = new ModificadoresDePericias();
                    modificadoresDePericiasPatrulheiro.adicionarModificadoresDePericias(AtributosObjectMapper.lerOpcaoEscolhida(), periciasPatrulheiro);
                    System.out.println(modificadoresDePericiasPatrulheiro.toString());

                    String jsonPericiasPatrulheiro = convertObjectToJson(modificadoresDePericiasPatrulheiro);
                    appendJsonToExistingFile(jsonPericiasPatrulheiro, "Perícias");

                    finalizado = true;
                    break;
                case "Ladino":
                    classeFormatada = "LADINO";
                    Pericias periciasLadino = new Pericias();
                    periciasLadino.adicionarPericias(true,false,true,false,true,false,false,false,false,false,false, false, true,false,false,false,false);

                    ModificadoresDePericias modificadoresDePericiasLadino = new ModificadoresDePericias();
                    modificadoresDePericiasLadino.adicionarModificadoresDePericias(AtributosObjectMapper.lerOpcaoEscolhida(), periciasLadino);
                    System.out.println(modificadoresDePericiasLadino.toString());

                    String jsonPericiasLadino = convertObjectToJson(modificadoresDePericiasLadino);
                    appendJsonToExistingFile(jsonPericiasLadino, "Perícias");

                    finalizado = true;
                    break;
                default:
                    System.out.println("A informação inserida não corresponde a nenhuma das opções possíveis. Verifica a " +
                            "ortografia da palavra utilizada e tente novamente");
            }
        } while(!finalizado);

        //Instancia classe com atibutos da base de dados
        Classe classe = ClasseObjectMapper.lerJson(classeFormatada);
        System.out.println(classe.toString());

        //Cria arquivo Json com a classe finalizada.
        ClasseObjectMapper.escreverJson(classe);

        //Adiciona a classe finalizada ao arquivo personagem.json
        String jsonClasse = convertObjectToJson(classe);
        appendJsonToExistingFile(jsonClasse, "Classe");
    }
}
