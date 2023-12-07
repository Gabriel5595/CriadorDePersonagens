package br.edu.infnet.criadordepersonagem.model.negocio;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Armadura {
    @JsonProperty("Nome")
    public String nomeDaArmadura;
    @JsonProperty("Tipo de Armadura")
    public String tipoDeArmadura;
    @JsonProperty("Defesa")
    public int defesa;
    @JsonProperty("Requisito de Força")
    public int forcaRequisito;
    @JsonProperty("Desvantagem de Furtividade")
    public boolean desvantagemFurtividade;

    //Construtor
    // Métodos
    // To String
    @Override
    public String toString (){
        return "Nome da Armadura: " + getNomeDaArmadura() + ",\n" +
                "Tipo de Armadura: " + getTipoDeArmadura() + ",\n" +
                "Defesa: " + getDefesa() + ",\n" +
                "Requisito de Força: " + getForcaRequisito() + ",\n" +
                "Desvantagem de Furtividade: " + getForcaRequisito() + ".\n";
    }
}
