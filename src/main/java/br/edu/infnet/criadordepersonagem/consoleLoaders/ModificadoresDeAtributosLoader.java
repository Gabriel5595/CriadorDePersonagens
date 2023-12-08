package br.edu.infnet.criadordepersonagem.consoleLoaders;


import br.edu.infnet.criadordepersonagem.model.negocio.ModificadoresDeAtributos;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class ModificadoresDeAtributosLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("[Atributos e Modificadores de Atributos] Classe iniciada com sucesso!\n");
        System.out.println("""
                Muito do que o personagem faz no jogo depende de seus seis atributos: Força, Destreza, Constituição, Inteligência, Sabedoria e Carisma.
                Para definí-las serão rolados 4 dados de 6 lados (4d6). Dentre esses resultados os menor deles será descartado e os três restantes serão somados.
                Esse processo será repetido 6 vezes.
                Ao final do processo os 6 resultados serão apresentados e você poderá escrever a ordem dos atributos respectivo a cada resultado.
                """);
        ModificadoresDeAtributos.defineAtributos();
    }

}
