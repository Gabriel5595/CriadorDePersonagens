package br.edu.infnet.criadordepersonagem.model.negocio;

import br.edu.infnet.criadordepersonagem.model.negocio.Dados;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Atributos {
    @JsonProperty("Força")
    private int forca;
    @JsonProperty("Modificador de Força")
    private int modForc;
    @JsonProperty("Destreza")
    private int destreza;
    @JsonProperty("Modificador de Destreza")
    private int modDes;
    @JsonProperty("Constituição")
    private int constituicao;
    @JsonProperty("Modificador de Constituição")
    private int modConst;
    @JsonProperty("Inteligência")
    private int inteligencia;
    @JsonProperty("Modificador de Inteligência")
    private int modInte;
    @JsonProperty("Sabedoria")
    private int sabedoria;
    @JsonProperty("Modificador de Sabedoria")
    private int modSab;
    @JsonProperty("Carisma")
    private int carisma;
    @JsonProperty("Modificador de Carisma")
    private int modCar;

    //Construtor
    public void adicionaAtributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        setForca(forca);
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.modForc = calcularModificador(forca);
        this.modDes = calcularModificador(destreza);
        this.modConst = calcularModificador(constituicao);
        this.modInte = calcularModificador(inteligencia);
        this.modSab = calcularModificador(sabedoria);
        this.modCar = calcularModificador(carisma);
    }

    //Métodos
    private int calcularModificador(int valorAtributo) {
        int modCalculado = 0;
        if (valorAtributo == 1) {
            modCalculado = -5;
        } else if (valorAtributo == 2 || valorAtributo == 3) {
            modCalculado = -4;
        } else if (valorAtributo == 4 || valorAtributo == 5) {
            modCalculado = -3;
        }  else if (valorAtributo == 6 || valorAtributo == 7) {
            modCalculado = -2;
        } else if (valorAtributo == 8 || valorAtributo == 9) {
            modCalculado = -1;
        } else if (valorAtributo == 12 || valorAtributo == 13) {
            modCalculado = 1;
        } else if (valorAtributo == 14 || valorAtributo == 15) {
            modCalculado = 2;
        } else if (valorAtributo == 16 || valorAtributo == 17) {
            modCalculado = 3;
        } else if (valorAtributo == 18 || valorAtributo == 19) {
            modCalculado = 4;
        } else if (valorAtributo == 20 || valorAtributo == 21) {
            modCalculado = 5;
        } else if (valorAtributo == 22 || valorAtributo == 23) {
            modCalculado = 6;
        } else if (valorAtributo == 24 || valorAtributo == 25) {
            modCalculado = 7;
        } else if (valorAtributo == 26 || valorAtributo == 27) {
            modCalculado = 8;
        } else if (valorAtributo == 28 || valorAtributo == 29) {
            modCalculado = 9;
        } else if (valorAtributo == 30) {
            modCalculado = 10;
        }
        return modCalculado;
    }

    public static List<Integer> sorteiaAtributos() {
        List<Integer> listaSorteadaCompleta = new ArrayList<>();
        for(int i = 0; i <= 5; i++) {
            List<Integer> dadosRolados = new ArrayList<>();
            for(int x = 0; x <= 3; x++){
                dadosRolados.add(Dados.rolarD6());
            }
            System.out.println("Sequencia de rolagens " + (i+1) + " foi: " + dadosRolados + ".");
            dadosRolados.sort(Collections.reverseOrder());
            System.out.println("A nova ordem da sequencia é " + dadosRolados + ".");
            System.out.println("O número " + dadosRolados.get(3) + " será removido.");
            dadosRolados.remove(3);
            int somaDosResultados = 0;
            int y = 0;
            do {
                somaDosResultados += dadosRolados.get(y);
                y++;
            } while (y < dadosRolados.size());
            System.out.println("A soma dos resultados da rolage " + (i+1) + " foi de " + somaDosResultados + ".\n");
            listaSorteadaCompleta.add(somaDosResultados);
        }
        System.out.println("A lista de resultados é: " + listaSorteadaCompleta + ".");
        return listaSorteadaCompleta;
    }

    //toString
    @Override
    public String toString() {
        return "Força: " + getForca() + "(" + getModForc() + ")" +
                "\nDestreza: " + getDestreza() + "(" + getModDes() + ")" +
                "\nConstituição: " + getConstituicao() + "(" + getModConst() + ")" +
                "\nInteligência: " + getInteligencia() + "(" + getModInte() + ")" +
                "\nSabedoria: " + getSabedoria() + "(" + getModSab() + ")" +
                "\nCarisma: " + getCarisma() + "(" + getModCar() + ")\n";
    }
}
