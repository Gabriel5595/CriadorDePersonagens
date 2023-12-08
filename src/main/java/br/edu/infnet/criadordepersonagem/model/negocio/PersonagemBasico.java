package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonagemBasico {
    //Atributos
    private String nomePersonagem;
    private String nomeJogador;
    private int level;

    //Getters e Setters;
    //Construtor

    public PersonagemBasico(String nomePersonagem, String nomeJogador) {
        setNomePersonagem(nomePersonagem);
        setNomeJogador(nomeJogador);
        setLevel(1);
    }

    //Métodos;

    //toString;
    @Override
    public String toString() {
        return "\nDados Básicos do Personagem\n" +
                "Nome do Jogador: " + getNomeJogador() + ",\n" +
                "Nome do Personagem: " + getNomePersonagem() + ",\n" +
                "Nível: " + getLevel() + ".\n";
    }
}
