package br.edu.infnet.criadordepersonagem.consoleLoaders;

import br.edu.infnet.criadordepersonagem.model.negocio.PersonagemBasico;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static br.edu.infnet.criadordepersonagem.model.service.mappers.toJSON.ClassToJSON.*;

@Order(1)
@Component
public class PersonagemBasicoLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Introdução
        System.out.println("[Personagem Básico] Classe iniciada com sucesso!\n");
        System.out.println("""
                BEM VINDO, AVENTUREIRO!
                Você está prestes a tomar o primeiro passo na sua aventura épica: a criação de um personagem!
                O processo poderia ser longo e desgastante... Mas eu estou aqui para facilitar as coisas! Vamos lá!\n
                O primeiro passo é definiar quem você é...
                """);

        //Requisição de informações
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome de verdade? ");
        String nomeJogador = scanner.nextLine();
        System.out.println("E nessa aventura épica como você gostaria de ser chamado, " + nomeJogador + "?");
        String nomePersonagem = scanner.nextLine();

        //criação da classe
        PersonagemBasico personagemBasico = new PersonagemBasico(nomePersonagem, nomeJogador);
        System.out.println(personagemBasico);
        String jsonPersonagemBasica = convertObjectToJson(personagemBasico);
        appendJsonToExistingFile(jsonPersonagemBasica, "Personagem Básico");
    }
}
