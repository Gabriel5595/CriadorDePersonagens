package br.edu.infnet.criadordepersonagem.model.testes;

import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDeAtributos;
import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDePericias;
import br.edu.infnet.criadordepersonagem.model.negocio.Pericias;

public class ModificadoresDePericiasTeste {
    public static void main(String[] args) {
        System.out.println("CLASSE MODIFICADOR DE PERÍCIAS - TESTE\n");
        System.out.println("""
                Instruções:
                Depois que os atributos são distribuídos, que os modificadores de atributos são informados, que a Raça e a Classe são também definidas, os modificadores de atributos serão gerados automaticamente.
                """);
        ModificadoresDeAtributos modificadoresDeAtributos = new ModificadoresDeAtributos(15, 16, 18, 17, 20, 11);
        Pericias pericias = new Pericias(true, false, false,true, false, false,true, false, false,true, false, false, false
                , false,true, false, false);
        ModificadoresDePericias modificadoresDePericias = new ModificadoresDePericias(modificadoresDeAtributos, pericias);
        System.out.println(modificadoresDePericias.toString());
    }
}
