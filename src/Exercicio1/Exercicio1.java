package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor A:");
        int valorA = leitor.nextInt();
        System.out.println("Digite o valor B:");
        int valorB = leitor.nextInt();
        System.out.println("Digite o valor C:");
        int valorC = leitor.nextInt();

        int somaAB = valorA + valorB;

        System.out.println(valorA+" + "+valorB+" = "+somaAB);
        if(somaAB < valorC){
            System.out.println("A soma entre A e B é menor que o valor C");
            System.out.println(somaAB + " < " + valorC);
        }else {
            System.out.println("Soma (A+B) >= "+ valorC);
        }
    }
}
