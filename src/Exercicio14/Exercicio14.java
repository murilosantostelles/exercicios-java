package Exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("ALGORITMO JAVA DE TROCA DE VALORES. A VIRA B E B VIRA A.");

        System.out.println("Digite o valor A:");
        int valorA = leitor.nextInt();

        System.out.println("Digite o valor B: ");
        int valorB = leitor.nextInt();

        int aux = 0;
        aux = valorA;
        valorA = valorB;
        valorB = aux;

        System.out.println("(new) Valor A:"+valorA);
        System.out.println("(new) Valor B:"+ valorB);
    }
}
