package Exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18){
            System.out.println(nome+", você é maior de idade.");
        }else {
            System.out.println(nome+", você é menor de idade.");
        }
    }
}
