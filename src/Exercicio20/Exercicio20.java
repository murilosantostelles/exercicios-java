package Exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor para ter sua tabuada exibida: ");
        int valor = leitor.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(valor+" x "+i+" = "+valor*i);
        }
    }
}
