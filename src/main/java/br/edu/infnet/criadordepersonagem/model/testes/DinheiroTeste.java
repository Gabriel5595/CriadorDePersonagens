package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.Dinheiro;

public class DinheiroTeste {
    public static void main(String[] args) {
        Dinheiro dinheiro = new Dinheiro(50,50,50,2);
        System.out.println(dinheiro);
    }
}
