package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

import static br.edu.infnet.criadordepersonagem.model.negocio.Dados.*;

@Getter
@Setter
public class VidaEDefesa {
    public int classeDeArmadura;
    public int vida;
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

    public void setVida(Classe classe, ModificadoresDeAtributos modificadoresDeAtributos) {
        String dadoDeVida = classe.getDadosDeVida();
        switch (dadoDeVida) {
            case "1d4" -> this.vida = rolarD4() + modificadoresDeAtributos.getModConst();
            case "1d6" -> this.vida = rolarD6() + modificadoresDeAtributos.getModConst();
            case "1d8" -> this.vida = rolarD8() + modificadoresDeAtributos.getModConst();
            case "1d10" -> this.vida = rolarD10() + modificadoresDeAtributos.getModConst();
            case "1d12" -> this.vida = rolarD12() + modificadoresDeAtributos.getModConst();
            case "1d20" -> this.vida = rolarD20() + modificadoresDeAtributos.getModConst();
        }
    }

    public VidaEDefesa(Classe classe, Equipamentos equipamento, ModificadoresDeAtributos modificadoresDeAtributos) {
        setClasseDeArmadura(equipamento, modificadoresDeAtributos);
        setVida(classe, modificadoresDeAtributos);
        setEquipamento(equipamento);
        setClasse(classe);
        setModificadoresDeAtributos(modificadoresDeAtributos);
    }

    @Override
    public String toString() {
        return "Vida e Defesa\n" +
                "Vida: " + getVida() + ",\n" +
                "Classe de Armadura: " + getClasseDeArmadura() + ".\n";
    }

}
