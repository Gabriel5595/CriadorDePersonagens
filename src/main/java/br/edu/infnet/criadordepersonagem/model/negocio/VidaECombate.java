package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.edu.infnet.criadordepersonagem.model.negocio.Dados.*;

@Getter
@Setter
public class VidaECombate {
    public int classeDeArmadura;
    public int vida;
    public Map<String, Integer> combateCorpoACorpo;
    public Map<String, Integer> combateADistancia;
    public Classe classe;
    public Equipamentos equipamento;
    public ModificadoresDeAtributos modificadoresDeAtributos;

    public void setClasseDeArmadura(Equipamentos equipamentos, ModificadoresDeAtributos modificadoresDeAtributos) {
        String tipoDeArmadura = equipamentos.getListaArmaduras().get(0).getTipoDeArmadura();
        int defesa = equipamentos.getListaArmaduras().get(0).getDefesa();
        int modDes = modificadoresDeAtributos.getModDes();
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

    public void setVida(Classe classe) {
        String dadoDeVida = classe.getDadosDeVida();
        switch (dadoDeVida) {
            case "1d4" -> this.vida = rolarD4();
            case "1d6" -> this.vida = rolarD6();
            case "1d8" -> this.vida = rolarD8();
            case "1d10" -> this.vida = rolarD10();
            case "1d12" -> this.vida = rolarD12();
            case "1d20" -> this.vida = rolarD20();
        }
    }

    public void setCombateCorpoACorpo(Equipamentos equipamentos) {
        List<Arma> listaArmas = equipamentos.getListaArmas();
        Map<String, Integer> combateCorpoACorpo = new HashMap<>();
        for (Arma arma : listaArmas) {

        }
    }

    public VidaECombate(Classe classe, Equipamentos equipamento, ModificadoresDeAtributos modificadoresDeAtributos) {
        setClasseDeArmadura(equipamento, modificadoresDeAtributos);
        setVida(classe);
        setEquipamento(equipamento);
        setClasse(classe);
        setModificadoresDeAtributos(modificadoresDeAtributos);
    }

    public String toString() {
        return "Vida e Combate"
    }

}
