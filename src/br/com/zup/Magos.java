package br.com.zup;

public class Magos extends Heroi {
    private double poderMagico;

    public Magos(String nome, double vida) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public double getPoderMagicos() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }
}
