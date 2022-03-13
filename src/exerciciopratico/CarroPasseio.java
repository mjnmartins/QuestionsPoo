package exerciciopratico;

public class CarroPasseio extends Veiculos {

    private String cor;
    private String modelo;

    public CarroPasseio() {

    }

    public CarroPasseio(String cor, String modelo, int peso, int velocMax, float preco, Motor Motor) {
        super(peso, velocMax, preco, Motor);
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
