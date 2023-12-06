package br.edu.infnet.criadordepersonagem.model.negocio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Classe {
    @JsonProperty("Nome")
    private String nomeClasse;
    @JsonProperty("Dado de Vida")
    private int dadosDeVida;
    @JsonProperty("Características da Classe")
    private Map<String, String> caractDaClasse;
    private int proficiencia;
    private Raca raca;
    private ModificadoresDeAtributos modificadoresDeAtributos;
    private BonusEProficiencias bonusEProficiencias;
    private Salvaguardas salvaguardas;
    private Pericias pericias;


}
