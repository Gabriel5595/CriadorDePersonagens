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

    //Construtor;

    public PersonagemBasico(String nomePersonagem, String nomeJogador, int level, String alinhamento) {
        setNomePersonagem(nomePersonagem);
        setNomeJogador(nomeJogador);
        setLevel(level);
        setAlinhamento(alinhamento);
    }

    //Métodos;

    //toString;
    public String toString() {
        return "Nome do Jogador: " + getNomeJogador() +
                "\nNome do Personagem: " + getNomePersonagem() +
                "\nNível: " + getLevel() +
                "\nAlinhamento: " + getAlinhamento();
    }
}
