package Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Primeira nota: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        System.out.println("Primeira pontuação: "+nota1);
        System.out.println("Segunda pontuação: "+nota2);
        System.out.println("Terceira pontuação: "+nota3);
        System.out.println("Média: "+media);
    }
}
