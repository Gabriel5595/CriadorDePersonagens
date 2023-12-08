package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Equipamentos {
    //Atributos
    public List<Arma> listaArmas;
    public List<Armadura> listaArmaduras;
    public List<OutrosEquip> listaOutrosEquips;
    public Dinheiro dinheiro;

    //Construtor
    public Equipamentos(Dinheiro dinheiro) {
        this.listaArmas = new ArrayList<>();
        this.listaArmaduras = new ArrayList<>();
        this.listaOutrosEquips = new ArrayList<>();
        setDinheiro(dinheiro);
    }

    //Métodos
    public void adicionarArma(Arma arma) {
        listaArmas.add(arma);
    }

    public void adicionarArmadura(Armadura armadura) {
        listaArmaduras.add(armadura);
    }

    public void adicionarOutrosEquips(OutrosEquip outrosEquip) {
        listaOutrosEquips.add(outrosEquip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Armas:\n");
        for (Arma arma : listaArmas) {
            sb.append(arma.toString()).append("\n");
        }

        sb.append("Armaduras:\n");
        for (Armadura armadura : listaArmaduras) {
            sb.append(armadura.toString()).append("\n");
        }

        sb.append("Outros Equipamentos:\n");
        for (OutrosEquip equip : listaOutrosEquips) {
            sb.append(equip.toString()).append("\n");
        }

        sb.append("Dinheiro: \n").append(dinheiro.toString());

        return sb.toString();
    }
}
