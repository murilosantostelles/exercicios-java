package Exercicio23.domain;

public class Professor {
    private String nome;
    double valorHoraAula;
    int numeroDeAulas;
    double percentualDescontoInss;

    public Professor(String nome, double valorHoraAula, int numeroDeAulas, double percentualDescontoInss) {
        this.nome = nome;
        this.valorHoraAula = valorHoraAula;
        this.numeroDeAulas = numeroDeAulas;
        this.percentualDescontoInss = percentualDescontoInss;
    }

    public double calcularSalarioBruto(){
        double salarioBruto = this.valorHoraAula * this.numeroDeAulas;
        return salarioBruto;
    }

    public double calcularSalarioLiquido(){
        double salarioBruto = this.valorHoraAula * this.numeroDeAulas;
        double valorDesconto = salarioBruto * (this.percentualDescontoInss / 100.0);
        double salarioLiquido = salarioBruto - valorDesconto;
        return salarioLiquido;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public int getNumeroDeAulas() {
        return numeroDeAulas;
    }

    public void setNumeroDeAulas(int numeroDeAulas) {
        this.numeroDeAulas = numeroDeAulas;
    }

    public double getPercentualDescontoInss() {
        return percentualDescontoInss;
    }

    public void setPercentualDescontoInss(double percentualDescontoInss) {
        this.percentualDescontoInss = percentualDescontoInss;
    }
}
