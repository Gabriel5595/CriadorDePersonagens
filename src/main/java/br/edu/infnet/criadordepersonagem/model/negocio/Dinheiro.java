package br.edu.infnet.criadordepersonagem.model.negocio;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dinheiro {
    //Atributos
    public int pecasDeCobre;
    public int pecasDePrata;
    public int pecasDeOuro;
    public int pecasDePlatina;

    //Construtor
    public Dinheiro(int pecasDeCobre, int pecasDePrata, int pecasDeOuro, int pecasDePlatina){
        setPecasDeCobre(pecasDeCobre);
        setPecasDePrata(pecasDePrata);
        setPecasDeOuro(pecasDeOuro);
        setPecasDePlatina(pecasDePlatina);
    }

    //Métodos
    @Override
    public String toString() {
        return "Dinheiro:\n" +
                "Peças de Cobre: " + getPecasDeCobre() + ",\n" +
                "Peças de Prata: " + getPecasDePrata() + ",\n" +
                "Peças de Ouro: " + getPecasDeOuro() + ",\n" +
                "Peças de Platina: " + getPecasDePlatina() + ".\n";
    }
}
