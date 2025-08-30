package exercicio3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor inteiro A: ");
        int valorA = leitor.nextInt();

        System.out.println("Digite um valor inteiro B: ");
        int valorB = leitor.nextInt();

        if (valorA == valorB){
            int soma = valorA + valorB;
            System.out.println("Soma = "+soma);
        }else {
            System.out.println("Os valores A ("+valorA+") e B ("+valorB+") são DIFERENTES.");
        }
    }
}
