package br.com.zup;

public class Guerreiros extends Heroi {
    private double poderAtaque;

    public Guerreiros(String nome, double vida) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public void aplicarDano() {
        double aplicarDano = this.getPoderAtaque();
        this.setPoderAtaque(aplicarDano);
    }
}
