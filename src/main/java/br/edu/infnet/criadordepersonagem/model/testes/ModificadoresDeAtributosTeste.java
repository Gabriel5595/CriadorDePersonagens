package br.edu.infnet.criadordepersonagem.model.testes;
import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDeAtributos;

public class ModificadoresDeAtributosTeste {
    public static void main(String[] args) {
        System.out.println("CLASSE MODIFICADOR DE ATRIBUTOS - TESTE\n");
        System.out.println("""
                Instruções:
                Jogue 4 dados de 6 lados. Elimine o menor resultado dentre as quatro jogadas e some os outros 3.
                Selecione um dos atributos abaixo e insira esses resultados.
                Quando esses valores tiverem sido atribuídos a cada um dos seus seis atributos, os modificadores serão calculados com base na tabela de Modificadores de Atributos presentes no Livro do Jogador.
                """);
        ModificadoresDeAtributos modificadoresDeAtributos = new ModificadoresDeAtributos(15, 16, 18, 17, 20, 11);
        System.out.println(modificadoresDeAtributos.toString());

        //TESTE OK

    }
}
