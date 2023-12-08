package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.Dados;

public class DadosTeste {
    public static void main(String[] args) {
        System.out.println(Dados.rolarD4());
        System.out.println(Dados.rolarD6());
        System.out.println(Dados.rolarD8());
        System.out.println(Dados.rolarD10());
        System.out.println(Dados.rolarD12());
        System.out.println(Dados.rolarD20());
        System.out.println(Dados.rolarD100());
    }
}
