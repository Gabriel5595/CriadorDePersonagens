package br.edu.infnet.criadordepersonagem.model.negocio;

public class Atributos {

    //Atributos
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

    //Getters e Setters
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }
    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    //Construtor
    public Atributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma) {
        setForca(forca);
        setDestreza(destreza);
        setConstituicao(constituicao);
        setInteligencia(inteligencia);
        setSabedoria(sabedoria);
        setCarisma(carisma);
    }

    //Métodos


    //To String
    @Override
    public String toString() {
        return "Força: " + getForca() +
                "\nDestreza: " + getDestreza() +
                "\nConstituição: " + getConstituicao() +
                "\nInteligência: " + getInteligencia() +
                "\nSabedoria: " + getSabedoria() +
                "\nCarisma: " + getCarisma();
    }
}
