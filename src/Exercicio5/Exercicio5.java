package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Salário mínimo: R$1518,00");
        System.out.println("Digite o salário a ser recebido: ");
        double salario = leitor.nextDouble();
        double salarioMinimo = 1518;
        double qtdSalariosMinimos = salario/salarioMinimo;

        System.out.println("Seu salário: R$"+salario);
        System.out.println("Quantidade de salários mínimos: "+qtdSalariosMinimos);
    }
}
