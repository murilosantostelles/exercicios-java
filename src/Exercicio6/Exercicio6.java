package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = leitor.nextDouble();

        double reajusteValor = valor + valor * 0.05;

        System.out.println(valor+" com 5% de reajuste: "+ reajusteValor);
    }
}
