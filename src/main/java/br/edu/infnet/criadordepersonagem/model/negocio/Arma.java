package br.edu.infnet.criadordepersonagem.model.negocio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Arma {
    //Atributos
    @JsonProperty("Nome")
    public String nomeDaArma;
    @JsonProperty("Tipo")
    public String tipoDaArma;
    @JsonProperty("Dados da Arma")
    public String dadoDaArma;
    @JsonProperty("Tipo de Dano")
    public String tipoDeDano;
    @JsonProperty("Corpo-a-corpo ou Distância")
    public String contatoOuDistancia;

    //Construtor
    // Métodos
    // To String
    @Override
    public String toString (){
        return "Nome da Arma: " + getNomeDaArma() + ",\n" +
                "Tipo: " + getTipoDaArma() + ",\n" +
                "Dados da Arma: " + getDadoDaArma() + ",\n" +
                "Tipo de Dano: " + getTipoDeDano() + ",\n" +
                "Corpo-a-corpo ou Distância: " + getContatoOuDistancia() + ",\n";
    }
}
