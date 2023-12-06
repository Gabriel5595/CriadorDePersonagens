package br.edu.infnet.criadordepersonagem.model.testes;
import br.edu.infnet.criadordepersonagem.model.negocio.Atributos;

public class AtributosTeste {
    public static void main(String[] args) {
        System.out.println("CLASSE ATRIBUTOS - TESTE\n");
        System.out.println("""
                Instruções:
                Jogue 4 dados de 6 lados. Elimine o menor resultado dentre as quatro jogadas e some os outros 3.
                Selecione um dos atributos abaixo e insira esses resultados.
                """);
        Atributos atributos = new Atributos(15, 16, 18, 17, 20, 11);
        System.out.println(atributos.toString());

        //TESTE OK

    }
}
