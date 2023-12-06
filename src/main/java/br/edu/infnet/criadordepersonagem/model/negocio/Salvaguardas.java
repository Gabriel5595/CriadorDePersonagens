package br.edu.infnet.criadordepersonagem.model.negocio;

import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDeAtributos;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Salvaguardas {
    private int salvaguardaForc;
    private int SalvaguardaDes;
    private int SalvaguardaInt;
    private int SalvaguardaSab;
    private int SalvaguardaCar;

    public Salvaguardas(ModificadoresDeAtributos modificadoresDeAtributos){
        this.salvaguardaForc = modificadoresDeAtributos.getModForc();
        this.SalvaguardaDes = modificadoresDeAtributos.getModDes();
        this.SalvaguardaInt = modificadoresDeAtributos.getModInte();
        this.SalvaguardaSab = modificadoresDeAtributos.getModSab();
        this.SalvaguardaCar = modificadoresDeAtributos.getModCar();
    }
}
