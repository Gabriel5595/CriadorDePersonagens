package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDeAtributos;
import br.edu.infnet.criadordepersonagem.model.negocio.Salvaguardas;

public class SalvaguardasTeste {
    public static void main(String[] args) {
        System.out.println("SALVAGUARDAS - TESTE\n");
        System.out.println("""
                Instruções:
                Após a definição dos atributos e seus modificadores, podemos utilizar esses modificadores em testes específicos.
                """);
        ModificadoresDeAtributos modificadoresDeAtributos = new ModificadoresDeAtributos(15, 16, 18, 17, 20, 11);
        Salvaguardas salvaguardas = new Salvaguardas(modificadoresDeAtributos);
        System.out.println(salvaguardas.toString());

    //TESTE OK
    }
}
