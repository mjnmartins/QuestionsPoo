package exerciciopratico;

public class Veiculos {

    private int peso;
    private int velocMax;
    private float preco;

    public Veiculos() {
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0;

    }

    public Veiculos(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
