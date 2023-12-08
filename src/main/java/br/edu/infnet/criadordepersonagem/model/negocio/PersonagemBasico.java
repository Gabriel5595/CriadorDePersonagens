package br.edu.infnet.criadordepersonagem.model.negocio;

public class PersonagemBasico {
    //Atributos
    private String nomePersonagem;
    private String nomeJogador;
    private int level;
    private String alinhamento;

    //Getters e Setters;

    public String getNomePersonagem() {
        return nomePersonagem;
    }
    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public String getAlinhamento() {
        return alinhamento;
    }
    public void setAlinhamento(String alinhamento) {
        this.alinhamento = alinhamento;
    }

    //Construtor

    public PersonagemBasico(String nomePersonagem, String nomeJogador) {
        setNomePersonagem(nomePersonagem);
        setNomeJogador(nomeJogador);
        setLevel(1);
    }

    //Métodos;

    //toString;
    @Override
    public String toString() {
        return "\nDados Básicos do Personagem\n" +
                "Nome do Jogador: " + getNomeJogador() + ",\n" +
                "Nome do Personagem: " + getNomePersonagem() + ",\n" +
                "Nível: " + getLevel() + ".\n";
    }
}
