package br.edu.infnet.criadordepersonagem.model.negocio;

import java.util.Random;

public class Dados {

    private static Random random = new Random();

    // Método para rolar dado de 4 lados
    public static int rolarD4() {
        return rolarDados(4);
    }

    // Método para rolar dado de 6 lados
    public static int rolarD6() {
        return rolarDados(6);
    }

    // Método para rolar dado de 8 lados
    public static int rolarD8() {
        return rolarDados(8);
    }

    // Método para rolar dado de 10 lados
    public static int rolarD10() {
        return rolarDados(10);
    }

    // Método para rolar dado de 12 lados
    public static int rolarD12() {
        return rolarDados(12);
    }

    // Método para rolar dado de 20 lados
    public static int rolarD20() {
        return rolarDados(20);
    }

    // Método genérico para rolar dados de n lados
    public static int rolarDados(int lados) {
        return random.nextInt(lados) + 1;
    }
}