package one.digitalinnovation.ecossistemaEDocumentacaoJava.POO.Fundamentos;

public class Carro {
    private String cor;
    private String modelo;
    private double capacidateTanque;

    Carro(){

    }

    public Carro(String cor, String modelo, double capacidateTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidateTanque = capacidateTanque;
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

    public double getCapacidateTanque() {
        return capacidateTanque;
    }

    public void setCapacidateTanque(double capacidateTanque) {
        this.capacidateTanque = capacidateTanque;
    }

    public double totalValorTanque(double valorCombustivel) {
        return capacidateTanque * valorCombustivel;
    }
}
