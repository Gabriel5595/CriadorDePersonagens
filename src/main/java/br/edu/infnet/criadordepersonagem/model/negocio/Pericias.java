package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pericias {
    private boolean acrobacia;
    private boolean arcanismo;
    private boolean atletismo;
    private boolean atuacao;
    private boolean furtividade;
    private boolean historia;
    private boolean intimidacao;
    private boolean intuicao;
    private boolean investigacao;
    private boolean lidarComAnimais;
    private boolean medicina;
    private boolean natureza;
    private boolean percepcao;
    private boolean persuasao;
    private boolean pretidigitacao;
    private boolean religiao;
    private boolean sobrevivencia;

    public Pericias(boolean acrobacia, boolean arcanismo, boolean atletismo, boolean atuacao, boolean furtividade, boolean historia, boolean intimidacao, boolean intuicao, boolean investigacao, boolean lidarComAnimais, boolean medicina, boolean natureza, boolean percepcao, boolean persuasao, boolean pretidigitacao, boolean religiao, boolean sobrevivencia) {
        this.acrobacia = acrobacia;
        this.arcanismo = arcanismo;
        this.atletismo = atletismo;
        this.atuacao = atuacao;
        this.furtividade = furtividade;
        this.historia = historia;
        this.intimidacao = intimidacao;
        this.intuicao = intuicao;
        this.investigacao = investigacao;
        this.lidarComAnimais = lidarComAnimais;
        this.medicina = medicina;
        this.natureza = natureza;
        this.percepcao = percepcao;
        this.persuasao = persuasao;
        this.pretidigitacao = pretidigitacao;
        this.religiao = religiao;
        this.sobrevivencia = sobrevivencia;
    }
}
