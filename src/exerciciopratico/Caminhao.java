package exerciciopratico;

public class Caminhao extends Veiculos {

    private float toneladas;
    private int alturaMax;
    private int comprimento;

    public Caminhao() {
    }

    public Caminhao(float toneladas, int alturaMax, int comprimento, int peso, int velocMax, float preco, Motor Motor) {
        super(peso, velocMax, preco, Motor);
        this.toneladas = toneladas;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    public float getToneladas() {
        return toneladas;
    }

    public void setToneladas(float toneladas) {
        this.toneladas = toneladas;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

   

}
