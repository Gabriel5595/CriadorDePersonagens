package br.edu.infnet.criadordepersonagem.model.negocio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonagemBasico {
    //Atributos
    @JsonProperty("Nome do Jogador")
    private String nomeJogador;
    @JsonProperty("Nome do Personagem")
    private String nomePersonagem;
    @JsonProperty("Nível")
    private int level;

    //Getters e Setters;
    //Construtor

    public void adicionaPersonagemBasico(String nomePersonagem, String nomeJogador) {
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