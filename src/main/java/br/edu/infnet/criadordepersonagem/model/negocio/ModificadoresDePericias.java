package br.edu.infnet.criadordepersonagem.model.negocio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModificadoresDePericias {
    //Atributos
    @JsonProperty("Acrobacia")
    private int modAcrobacia_Des;
    @JsonProperty("Arcanismo")
    private int modArcanismo_Int;
    @JsonProperty("Atletismo")
    private int modAtletismo_For;
    @JsonProperty("Atuação")
    private int modAtuacao_Car;
    @JsonProperty("Furtividade")
    private int modFurtividade_Des;
    @JsonProperty("História")
    private int modHistoria_Int;
    @JsonProperty("Intimidação")
    private int modIntimidacao_Car;
    @JsonProperty("Intuição")
    private int modIntuicao_Sab;
    @JsonProperty("Investigação")
    private int modInvestigacao_Int;
    @JsonProperty("Lidar com Animais")
    private int modLidarComAnimais_Sab;
    @JsonProperty("Medicina")
    private int modMedicina_Sab;
    @JsonProperty("Natureza")
    private int modNatureza_Int;
    @JsonProperty("Percepção")
    private int modPercepcao_Sab;
    @JsonProperty("Persuasão")
    private int modPersuasao_Car;
    @JsonProperty("Prestidigitação")
    private int modPrestidigitacao_Des;
    @JsonProperty("Religião")
    private int modReligiao_Int;
    @JsonProperty("Sobrevivência")
    private int modSobrevivencia_Sab;
    @JsonIgnore
    private Map<String, Integer> listaPericias;

    //Getters and Setters
    public void setModAcrobacia_Des(Atributos atributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isAcrobacia()) {
            this.modAcrobacia_Des = atributos.getModDes() + 2;
        } else {
            this.modAcrobacia_Des = atributos.getModDes();
        }
    }

    public void setModArcanismo_Int(Atributos atributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isArcanismo()) {
            this.modArcanismo_Int = atributos.getModInte() + 2;
        } else {
            this.modArcanismo_Int = atributos.getModInte();
        }
    }

    public void setModAtletismo_For(Atributos atributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isAtletismo()) {
            this.modAtletismo_For = atributos.getModForc() + 2;
        } else {
            this.modAtletismo_For = atributos.getModForc();
        }
    }

    public void setModAtuacao_Car(Atributos atributos, Pericias pericias,
                                  Map<String, Integer> listaPericias) {
        if (pericias.isAtuacao()) {
            this.modAtuacao_Car = atributos.getModCar() + 2;
        } else {
            this.modAtuacao_Car = atributos.getModCar();
        }
    }

    public void setModFurtividade_Des(Atributos atributos, Pericias pericias,
                                      Map<String, Integer> listaPericias) {
        if (pericias.isFurtividade()) {
            this.modFurtividade_Des = atributos.getModDes() + 2;
        } else {
            this.modFurtividade_Des = atributos.getModDes();
        }
    }

    public void setModHistoria_Int(Atributos atributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isHistoria()) {
            this.modHistoria_Int = atributos.getModInte() + 2;
        } else {
            this.modHistoria_Int = atributos.getModInte();
        }
    }

    public void setModIntimidacao_Car(Atributos atributos, Pericias pericias,
                                      Map<String, Integer> listaPericias) {
        if (pericias.isIntimidacao()) {
            this.modIntimidacao_Car = atributos.getModCar() + 2;
        } else {
            this.modIntimidacao_Car = atributos.getModCar();
        }
    }

    public void setModIntuicao_Sab(Atributos atributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isIntuicao()) {
            this.modIntuicao_Sab = atributos.getModSab() + 2;
        } else {
            this.modIntuicao_Sab = atributos.getModSab();
        }
    }

    public void setModInvestigacao_Int(Atributos atributos, Pericias pericias,
                                       Map<String, Integer> listaPericias) {
        if (pericias.isInvestigacao()) {
            this.modInvestigacao_Int = atributos.getModInte() + 2;
        } else {
            this.modInvestigacao_Int = atributos.getModInte();
        }
    }

    public void setModLidarComAnimais_Sab(Atributos atributos, Pericias pericias,
                                          Map<String, Integer> listaPericias) {
        if (pericias.isLidarComAnimais()) {
            this.modLidarComAnimais_Sab = atributos.getModSab() + 2;
        } else {
            this.modLidarComAnimais_Sab = atributos.getModSab();
        }
    }

    public void setModMedicina_Sab(Atributos atributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isMedicina()) {
            this.modMedicina_Sab = atributos.getModSab() + 2;
        } else {
            this.modMedicina_Sab = atributos.getModSab();
        }
    }

    public void setModNatureza_Int(Atributos atributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isNatureza()) {
            this.modNatureza_Int = atributos.getModInte() + 2;
        } else {
            this.modNatureza_Int = atributos.getModInte();
        }
    }

    public void setModPercepcao_Sab(Atributos atributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isPercepcao()) {
            this.modPercepcao_Sab = atributos.getModSab() + 2;
        } else {
            this.modPercepcao_Sab = atributos.getModSab();
        }
    }

    public void setModPersuasao_Car(Atributos atributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isPersuasao()) {
            this.modPersuasao_Car = atributos.getModCar() + 2;
        } else {
            this.modPersuasao_Car = atributos.getModCar();
        }
    }

    public void setModPrestidigitacao_Des(Atributos atributos, Pericias pericias,
                                         Map<String, Integer> listaPericias) {
        if (pericias.isPrestidigitacao()) {
            this.modPrestidigitacao_Des = atributos.getModDes() + 2;
        } else {
            this.modPrestidigitacao_Des = atributos.getModDes();
        }
    }

    public void setModReligiao_Int(Atributos atributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isReligiao()) {
            this.modReligiao_Int = atributos.getModInte() + 2;
        } else {
            this.modReligiao_Int = atributos.getModInte();
        }
    }

    public void setModSobrevivencia_Sab(Atributos atributos, Pericias pericias,
                                        Map<String, Integer> listaPericias) {
        if (pericias.isSobrevivencia()) {
            this.modSobrevivencia_Sab = atributos.getModSab() + 2;
        } else {
            this.modSobrevivencia_Sab = atributos.getModSab();
        }
    }

    public void adicionarModificadoresDePericias(Atributos atributos, Pericias pericias) {
        listaPericias = new HashMap<>();
        setModAcrobacia_Des(atributos, pericias, listaPericias);
        setModArcanismo_Int(atributos, pericias, listaPericias);
        setModAtletismo_For(atributos, pericias, listaPericias);
        setModAtuacao_Car(atributos, pericias, listaPericias);
        setModFurtividade_Des(atributos, pericias, listaPericias);
        setModHistoria_Int(atributos, pericias, listaPericias);
        setModIntimidacao_Car(atributos, pericias, listaPericias);
        setModIntuicao_Sab(atributos, pericias, listaPericias);
        setModInvestigacao_Int(atributos, pericias, listaPericias);
        setModLidarComAnimais_Sab(atributos, pericias, listaPericias);
        setModMedicina_Sab(atributos, pericias, listaPericias);
        setModNatureza_Int(atributos, pericias, listaPericias);
        setModPercepcao_Sab(atributos, pericias, listaPericias);
        setModPersuasao_Car(atributos, pericias, listaPericias);
        setModPrestidigitacao_Des(atributos, pericias, listaPericias);
        setModReligiao_Int(atributos, pericias, listaPericias);
        setModSobrevivencia_Sab(atributos, pericias, listaPericias);
    }

    @Override
    public String toString() {
        StringBuilder listaPericiasFormatado = new StringBuilder();
        for (Map.Entry<String, Integer> pericia : listaPericias.entrySet()){
            listaPericiasFormatado.append(pericia.getKey())
                    .append(": ")
                    .append(pericia.getValue())
                    .append("\n");
        }

        return "Perícias: \n" +
                listaPericiasFormatado + "\n";
    }
}
