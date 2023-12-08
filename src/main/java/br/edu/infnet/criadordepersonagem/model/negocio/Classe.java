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
    private String dadosDeVida;
    @JsonProperty("Características da Classe")
    private Map<String, String> caractDaClasse;

    public String toString() {
        StringBuilder CaracFormatada = new StringBuilder();
        for (Map.Entry<String, String> traco : getCaractDaClasse().entrySet()){
            CaracFormatada.append(traco.getKey())
                    .append(": ")
                    .append(traco.getValue())
                    .append("\n");
        }
        return "Nome da Classe: " + getNomeClasse() + ",\n" +
                "Dados de Vida: " + getDadosDeVida() + ",\n" +
                "Características da Classe: \n" + CaracFormatada + ".\n";
    }
}
