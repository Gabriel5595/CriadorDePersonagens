package br.edu.infnet.criadordepersonagem.model.testes;


import br.edu.infnet.criadordepersonagem.model.negocio.Classe;
import br.edu.infnet.criadordepersonagem.model.service.ClasseObjectMapper;

import java.io.IOException;

public class ClasseTeste {
    public static void main(String[] args) throws IOException {
        Classe classe = ClasseObjectMapper.lerJson();
        System.out.println(classe.toString());
    }
}
