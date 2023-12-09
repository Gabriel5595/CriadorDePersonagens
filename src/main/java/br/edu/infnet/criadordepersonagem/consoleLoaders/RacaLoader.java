package br.edu.infnet.criadordepersonagem.consoleLoaders;

import br.edu.infnet.criadordepersonagem.model.negocio.Raca;
import br.edu.infnet.criadordepersonagem.model.service.mappers.fromJSON.RacaObjectMapper;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.appendJsonToExistingFile;
import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.convertObjectToJson;

@Order(3)
@Component
public class RacaLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("[Raça] Classe iniciada com sucesso!\n");
        System.out.println("""
                Agora é a hora de escolher a qual raça o seu personagem vai escolher!
                Você poder escolher entre Humano, Elfo e Anão.
                Nos confins da maioria dos mundos, os humanos são a mais jovem das raças comuns, chegando mais tarde no cenário mundial e com uma vida curta, se comparados aos anões, elfos e dragões. Talvez seja por causa de suas vidas mais curtas que eles se esforcem para alcançar o máximo que podem nos anos que têm. Ou talvez eles sintam que têm algo a provar às raças mais antigas, e é por esta razão que eles constroem seus poderosos impérios através da conquista e do comércio. O que quer que os motive, os humanos são os inovadores, os realizadores e os pioneiros dos mundos.
                Elfos são um povo mágico de graça sobrenatural, vivendo no mundo sem pertencer inteiramente à ele. Eles vivem em lugares de beleza etérea, no meio de antigas florestas ou em torres prateadas brilhando com luz feérica, onde uma música suave ecoa através do ar e fragrâncias suaves flutuam na brisa. Elfos amam a natureza e a magia, a arte e o estudo, a música e a poesia, e as coisas boas do mundo.
                Reinos ricos de antiga grandeza, salões esculpidos nas raízes das montanhas, o eco de picaretas e martelos nas minas profundas e nas forjas ardentes, um compromisso com o clã e a tradição, e um ódio impetuoso contra goblins e orcs – essas linhas comuns unem todos os anões.
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual raça você escolhe? Humano, Elfo ou Anão?");
        String racaEscolhida = scanner.nextLine();

        boolean finalizado = false;
        String racaFormatada = "";
        do{
            switch(racaEscolhida){
                case "Humano":
                    racaFormatada = "HUMANO";
                    finalizado = true;
                    break;
                case "Elfo":
                    racaFormatada = "ELFO";
                    finalizado = true;
                    break;
                case "Anão":
                    racaFormatada = "ANAO";
                    finalizado = true;
                    break;
                default:
                    System.out.println("A informação inserida não corresponde a nenhuma das opções possíveis. Verifica a " +
                            "ortografia da palavra utilizada e tente novamente");
            }
        } while(!finalizado);

        Raca raca = RacaObjectMapper.lerJson(racaFormatada);
        System.out.println(raca.toString());

        String jsonRaca = convertObjectToJson(raca);
        appendJsonToExistingFile(jsonRaca, "Raça");
    }
}
