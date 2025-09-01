package Exercicio24.domain;

public class Viagem {
    private Carro carro;
    private int tempoGasto;
    private double velocidadeMedia;

    public Viagem(Carro carro, int tempoGasto, double velocidadeMedia) {
        this.carro = carro;
        this.tempoGasto = tempoGasto;
        this.velocidadeMedia = velocidadeMedia;
    }

    public double calcularQuantidadeDeLitrosgastos(){
        double distancia = this.tempoGasto * this.velocidadeMedia;
        double litrosGastos = distancia / this.carro.getConsumo();
        return litrosGastos;
    }

    public int getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(int tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
