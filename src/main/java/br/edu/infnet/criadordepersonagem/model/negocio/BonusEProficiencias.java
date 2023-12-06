package br.edu.infnet.criadordepersonagem.model.negocio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BonusEProficiencias {
    private boolean proficienciaEmArmadurasLeves;
    private boolean proficienciaEmArmadurasMedias;
    private boolean proficienciaEmArmadurasPesadas;
    private boolean proficienciaEmEscudos;
    private boolean proficienciaEmArmasComuns;
    private boolean proficienciaEmArmasMarciais;
}
