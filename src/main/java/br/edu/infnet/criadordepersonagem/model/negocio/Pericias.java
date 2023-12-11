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
    private boolean prestidigitacao;
    private boolean religiao;
    private boolean sobrevivencia;

    public void adicionarPericias(boolean acrobacia, boolean arcanismo, boolean atletismo, boolean atuacao, boolean furtividade,
                                  boolean historia, boolean intimidacao, boolean intuicao, boolean investigacao,
                                  boolean lidarComAnimais, boolean medicina, boolean natureza, boolean percepcao, boolean persuasao, boolean prestidigitacao, boolean religiao, boolean sobrevivencia) {
        setAcrobacia(acrobacia);
        setArcanismo(arcanismo);
        setAtletismo(atletismo);
        setAtuacao(atuacao);
        setFurtividade(furtividade);
        setHistoria(historia);
        setIntimidacao(intimidacao);
        setIntuicao(intuicao);
        setInvestigacao(investigacao);
        setLidarComAnimais(lidarComAnimais);
        setMedicina(medicina);
        setNatureza(natureza);
        setPercepcao(percepcao);
        setPersuasao(persuasao);
        setPrestidigitacao(prestidigitacao);
        setReligiao(religiao);
        setSobrevivencia(sobrevivencia);
    }
}
