package exerciciopratico;

public class Veiculos {

    private int peso;
    private int velocMax;
    private float preco;
    private Motor motor;
   
    public Veiculos() {
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0;
        motor = new Motor();
    }

    public Veiculos(int peso, int velocMax, float preco, Motor Motor) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
        this.motor = motor;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
