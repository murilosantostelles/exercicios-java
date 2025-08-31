package Exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os 3 lados do triangulo para descobrir o tipo: ");
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        if(a < b + c && b < a + c && c < a +b){
            if(a == b && b == c){
                System.out.println("Triângulo Equilátero.");
            } else if (a != b && a != c && b != c) {
                System.out.println("Triângulo Escaleno.");
            } else {
                System.out.println("Triângulo Isósceles.");
            }
        }else{
            System.out.println("Não é um triângulo");
        }
    }
}
