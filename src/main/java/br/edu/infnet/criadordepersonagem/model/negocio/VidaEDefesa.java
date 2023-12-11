package br.edu.infnet.criadordepersonagem.model.negocio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import static br.edu.infnet.criadordepersonagem.model.negocio.Dados.*;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class VidaEDefesa {
    @JsonProperty("Vida")
    public int vida;
    @JsonProperty("Classe de Armadura")
    public int classeDeArmadura;
    @JsonIgnore
    public Classe classe;
    @JsonIgnore
    public Armadura armadura;
    @JsonIgnore
    public Atributos atributos;

    public void setClasseDeArmadura(Armadura armadura, Atributos atributos) {
        String tipoDeArmadura = armadura.getTipoDeArmadura();
        int defesa = armadura.getDefesa();
        int modDes = atributos.getModDes();
        if (tipoDeArmadura.equals("Pesada")) {
            this.classeDeArmadura = defesa;
        } else if (tipoDeArmadura.equals("Média")) {
            if (modDes > 2) {
                this.classeDeArmadura = defesa + 2;
            } else {
                this.classeDeArmadura = defesa + modDes;
            }
        } else {
            this.classeDeArmadura = defesa + modDes;
        }
    }

    public void setVida(Classe classe, Atributos atributos) {
        String dadoDeVida = classe.getDadosDeVida();
        switch (dadoDeVida) {
            case "1d4" -> this.vida = rolarD4() + atributos.getModConst();
            case "1d6" -> this.vida = rolarD6() + atributos.getModConst();
            case "1d8" -> this.vida = rolarD8() + atributos.getModConst();
            case "1d10" -> this.vida = rolarD10() + atributos.getModConst();
            case "1d12" -> this.vida = rolarD12() + atributos.getModConst();
            case "1d20" -> this.vida = rolarD20() + atributos.getModConst();
        }
    }

    public VidaEDefesa(Classe classe, Armadura armadura, Atributos atributos) {
        setClasseDeArmadura(armadura, atributos);
        setVida(classe, atributos);
    }

    @Override
    public String toString() {
        return "Vida e Defesa\n" +
                "Vida: " + getVida() + ",\n" +
                "Classe de Armadura: " + getClasseDeArmadura() + ".\n";
    }
}
