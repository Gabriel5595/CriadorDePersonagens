package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.PersonagemBasico;

public class PersonagemBasicoTeste {
    public static void main(String[] args) {
        PersonagemBasico personagemBasico = new PersonagemBasico("Gabriel", "Eldred, O Destruidor");
        System.out.println(personagemBasico);
    }
}
