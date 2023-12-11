package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class OutrosEquip {
    //Atributos
    Map<String, Integer> listaDeOutrosEquips = new HashMap<>();

    // Métodos
    public void adicionaOutrosEquip(String nomeDoEquip, int quant){
        listaDeOutrosEquips.put(nomeDoEquip, quant);
    }

    // To String
    public String toString() {
        StringBuilder EquipsFormatados = new StringBuilder();
        for (Map.Entry<String, Integer> Equip : getListaDeOutrosEquips().entrySet()){
            EquipsFormatados.append(Equip.getKey())
                    .append(": ")
                    .append(Equip.getValue())
                    .append("\n");
        }

        return "Outros Equipamentos:\n" + EquipsFormatados;
    }

}