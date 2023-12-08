package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutrosEquip {
    //Atributos
    public String nomeDoEquip;
    public int quant;

    //Construtor
    public OutrosEquip(String nomeDoEquip, int quant) {
        setNomeDoEquip(nomeDoEquip);
        setQuant(quant);
    }
    // Métodos
    // To String
    public String toString() {
        return "Nome do Equipamento: " + getNomeDoEquip() + ",\n" +
                "Quantidade: " + getQuant() + ".\n";
    }

}
