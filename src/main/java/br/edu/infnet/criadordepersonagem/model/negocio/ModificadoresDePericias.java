package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ModificadoresDePericias {
    //Atributos
    private int modAcrobacia_Des;
    private int modArcanismo_Int;
    private int modAtletismo_For;
    private int modAtuacao_Car;
    private int modFurtividade_Des;
    private int modHistoria_Int;
    private int modIntimidacao_Car;
    private int modIntuicao_Sab;
    private int modInvestigacao_Int;
    private int modLidarComAnimais_Sab;
    private int modMedicina_Sab;
    private int modNatureza_Int;
    private int modPercepcao_Sab;
    private int modPersuasao_Car;
    private int modPretidigitacao_Des;
    private int modReligiao_Int;
    private int modSobrevivencia_Sab;
    private Map<String, Integer> listaPericias;

    //Getters and Setters
    public void setModAcrobacia_Des(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isAcrobacia()) {
            this.modAcrobacia_Des = modificadoresDeAtributos.getModDes() + 2;
            listaPericias.put("Acrobacia", modAcrobacia_Des);
        } else {
            this.modAcrobacia_Des = modificadoresDeAtributos.getModDes();
            listaPericias.put("Acrobacia", modAcrobacia_Des);
        }
    }

    public void setModArcanismo_Int(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isArcanismo()) {
            this.modArcanismo_Int = modificadoresDeAtributos.getModInte() + 2;
            listaPericias.put("Arcanismo", modArcanismo_Int);
        } else {
            this.modArcanismo_Int = modificadoresDeAtributos.getModInte();
            listaPericias.put("Arcanismo", modArcanismo_Int);
        }
    }

    public void setModAtletismo_For(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isAtletismo()) {
            this.modAtletismo_For = modificadoresDeAtributos.getModForc() + 2;
            listaPericias.put("Atletismo", modAtletismo_For);
        } else {
            this.modAtletismo_For = modificadoresDeAtributos.getModForc();
            listaPericias.put("Atletismo", modAtletismo_For);
        }
    }

    public void setModAtuacao_Car(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                  Map<String, Integer> listaPericias) {
        if (pericias.isAtuacao()) {
            this.modAtuacao_Car = modificadoresDeAtributos.getModCar() + 2;
            listaPericias.put("Atuação", modAtuacao_Car);
        } else {
            this.modAtuacao_Car = modificadoresDeAtributos.getModCar();
            listaPericias.put("Atuação", modAtuacao_Car);
        }
    }

    public void setModFurtividade_Des(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                      Map<String, Integer> listaPericias) {
        if (pericias.isFurtividade()) {
            this.modFurtividade_Des = modificadoresDeAtributos.getModDes() + 2;
            listaPericias.put("Furtividade", modFurtividade_Des);
        } else {
            this.modFurtividade_Des = modificadoresDeAtributos.getModDes();
            listaPericias.put("Furtividade", modFurtividade_Des);
        }
    }

    public void setModHistoria_Int(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isHistoria()) {
            this.modHistoria_Int = modificadoresDeAtributos.getModInte() + 2;
            listaPericias.put("História", modHistoria_Int);
        } else {
            this.modHistoria_Int = modificadoresDeAtributos.getModInte();
            listaPericias.put("História", modHistoria_Int);
        }
    }

    public void setModIntimidacao_Car(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                      Map<String, Integer> listaPericias) {
        if (pericias.isIntimidacao()) {
            this.modIntimidacao_Car = modificadoresDeAtributos.getModCar() + 2;
            listaPericias.put("Intimidação", modIntimidacao_Car);
        } else {
            this.modIntimidacao_Car = modificadoresDeAtributos.getModCar();
            listaPericias.put("Intimidação", modIntimidacao_Car);
        }
    }

    public void setModIntuicao_Sab(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isIntuicao()) {
            this.modIntuicao_Sab = modificadoresDeAtributos.getModSab() + 2;
            listaPericias.put("Intuição", modIntuicao_Sab);
        } else {
            this.modIntuicao_Sab = modificadoresDeAtributos.getModSab();
            listaPericias.put("Intuição", modIntuicao_Sab);
        }
    }

    public void setModInvestigacao_Int(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                       Map<String, Integer> listaPericias) {
        if (pericias.isInvestigacao()) {
            this.modInvestigacao_Int = modificadoresDeAtributos.getModInte() + 2;
            listaPericias.put("Investigação", modInvestigacao_Int);
        } else {
            this.modInvestigacao_Int = modificadoresDeAtributos.getModInte();
            listaPericias.put("Investigação", modInvestigacao_Int);
        }
    }

    public void setModLidarComAnimais_Sab(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                          Map<String, Integer> listaPericias) {
        if (pericias.isLidarComAnimais()) {
            this.modLidarComAnimais_Sab = modificadoresDeAtributos.getModSab() + 2;
            listaPericias.put("Lidar com Animais", modLidarComAnimais_Sab);
        } else {
            this.modLidarComAnimais_Sab = modificadoresDeAtributos.getModSab();
            listaPericias.put("Lidar com Animais", modLidarComAnimais_Sab);
        }
    }

    public void setModMedicina_Sab(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isMedicina()) {
            this.modMedicina_Sab = modificadoresDeAtributos.getModSab() + 2;
            listaPericias.put("Medicina", modMedicina_Sab);
        } else {
            this.modMedicina_Sab = modificadoresDeAtributos.getModSab();
            listaPericias.put("Medicina", modMedicina_Sab);
        }
    }

    public void setModNatureza_Int(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isNatureza()) {
            this.modNatureza_Int = modificadoresDeAtributos.getModInte() + 2;
            listaPericias.put("Natureza", modNatureza_Int);
        } else {
            this.modNatureza_Int = modificadoresDeAtributos.getModInte();
            listaPericias.put("Natureza", modNatureza_Int);
        }
    }

    public void setModPercepcao_Sab(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isPercepcao()) {
            this.modPercepcao_Sab = modificadoresDeAtributos.getModSab() + 2;
            listaPericias.put("Percepção", modPercepcao_Sab);
        } else {
            this.modPercepcao_Sab = modificadoresDeAtributos.getModSab();
            listaPericias.put("Percepção", modPercepcao_Sab);
        }
    }

    public void setModPersuasao_Car(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                    Map<String, Integer> listaPericias) {
        if (pericias.isPersuasao()) {
            this.modPersuasao_Car = modificadoresDeAtributos.getModCar() + 2;
            listaPericias.put("Persuasão", modPersuasao_Car);
        } else {
            this.modPersuasao_Car = modificadoresDeAtributos.getModCar();
            listaPericias.put("Persuasão", modPersuasao_Car);
        }
    }

    public void setModPretidigitacao_Des(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                         Map<String, Integer> listaPericias) {
        if (pericias.isPretidigitacao()) {
            this.modPretidigitacao_Des = modificadoresDeAtributos.getModDes() + 2;
            listaPericias.put("Pretidigitação", modPretidigitacao_Des);
        } else {
            this.modPretidigitacao_Des = modificadoresDeAtributos.getModDes();
            listaPericias.put("Prestidigitação", modPretidigitacao_Des);
        }
    }

    public void setModReligiao_Int(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                   Map<String, Integer> listaPericias) {
        if (pericias.isReligiao()) {
            this.modReligiao_Int = modificadoresDeAtributos.getModInte() + 2;
            listaPericias.put("Religião", modReligiao_Int);
        } else {
            this.modReligiao_Int = modificadoresDeAtributos.getModInte();
            listaPericias.put("Religião", modReligiao_Int);
        }
    }

    public void setModSobrevivencia_Sab(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias,
                                        Map<String, Integer> listaPericias) {
        if (pericias.isSobrevivencia()) {
            this.modSobrevivencia_Sab = modificadoresDeAtributos.getModSab() + 2;
            listaPericias.put("Sobrevivência", modSobrevivencia_Sab);
        } else {
            this.modSobrevivencia_Sab = modificadoresDeAtributos.getModSab();
            listaPericias.put("Sobrevivência", modSobrevivencia_Sab);
        }
    }

    public ModificadoresDePericias(ModificadoresDeAtributos modificadoresDeAtributos, Pericias pericias) {
        listaPericias = new HashMap<>();
        setModAcrobacia_Des(modificadoresDeAtributos, pericias, listaPericias);
        setModArcanismo_Int(modificadoresDeAtributos, pericias, listaPericias);
        setModAtletismo_For(modificadoresDeAtributos, pericias, listaPericias);
        setModAtuacao_Car(modificadoresDeAtributos, pericias, listaPericias);
        setModFurtividade_Des(modificadoresDeAtributos, pericias, listaPericias);
        setModHistoria_Int(modificadoresDeAtributos, pericias, listaPericias);
        setModIntimidacao_Car(modificadoresDeAtributos, pericias, listaPericias);
        setModIntuicao_Sab(modificadoresDeAtributos, pericias, listaPericias);
        setModInvestigacao_Int(modificadoresDeAtributos, pericias, listaPericias);
        setModLidarComAnimais_Sab(modificadoresDeAtributos, pericias, listaPericias);
        setModMedicina_Sab(modificadoresDeAtributos, pericias, listaPericias);
        setModNatureza_Int(modificadoresDeAtributos, pericias, listaPericias);
        setModPercepcao_Sab(modificadoresDeAtributos, pericias, listaPericias);
        setModPersuasao_Car(modificadoresDeAtributos, pericias, listaPericias);
        setModPretidigitacao_Des(modificadoresDeAtributos, pericias, listaPericias);
        setModReligiao_Int(modificadoresDeAtributos, pericias, listaPericias);
        setModSobrevivencia_Sab(modificadoresDeAtributos, pericias, listaPericias);
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

//Teste OK