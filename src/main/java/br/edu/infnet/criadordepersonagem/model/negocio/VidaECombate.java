package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VidaECombate {
    public int classeDeArmadura;
    public int vida;
    public Classe classe;
    public Equipamentos equipamento;
    public ModificadoresDeAtributos modificadoresDeAtributos;

    public void setClasseDeArmadura(Equipamentos equipamentos) {
        String tipoDeArmadura = equipamentos.getListaArmaduras().get(0).getTipoDeArmadura();
        int defesa = equipamentos.getListaArmaduras().get(0).getDefesa();
        int modDes = modificadoresDeAtributos.getModDes();
        if (tipoDeArmadura == "Pesada") {
            this.classeDeArmadura = defesa;
        } else if (tipoDeArmadura == "Média") {
            if (modDes > 2) {
                this.classeDeArmadura = defesa + 2;
            } else {
                this.classeDeArmadura = defesa + modDes;
            }
        } else {
            this.classeDeArmadura = defesa + modDes;
        }
    }

    public void setVida() {

    }

}
