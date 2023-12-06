package br.edu.infnet.criadordepersonagem.model.negocio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Raca {
    @JsonProperty("Nome")
    private String nomeRaca;
    @JsonProperty("Tamanho")
    private String tamanho;
    @JsonProperty("Deslocamento")
    private String deslocamento;
    @JsonProperty("Traços Raciais")
    private Map<String, String> tracosRaciais;
    @JsonProperty("subRaça")
    private List<String> subRacas;

    @Override
    public String toString() {
        StringBuilder tracoFormatado = new StringBuilder();
        for (Map.Entry<String, String> traco : getTracosRaciais().entrySet()){
            tracoFormatado.append(traco.getKey())
                    .append(": ")
                    .append(traco.getValue())
                    .append("\n");
        }

        return "Raça: " + getNomeRaca() + "\n" +
                "Tamanho: " + getTamanho() + "\n" +
                "Deslocamento: " + getDeslocamento() + "\n" +
                "Traços Raciais: \n" + tracoFormatado +
                "SubRaça: " + getSubRacas() + "\n";
    }

}
