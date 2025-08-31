package Exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Nome do aluno: ");
        String nome = leitor.next();

        System.out.println("Primeira nota: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = leitor.nextDouble();
        System.out.println("Quarta nota: ");
        double nota4 = leitor.nextDouble();

        int qdtNotas = 4;

        double media = (nota1+nota2+nota3+nota4)/qdtNotas;

        System.out.println("Aluno: "+nome);
        System.out.println("Primeira pontuação: "+nota1);
        System.out.println("Segunda pontuação: "+nota2);
        System.out.println("Terceira pontuação: "+nota3);
        System.out.println("Média: "+media);
        if (media>=7){
            System.out.println("APROVADO.");
        }else{
            System.out.println("REPROVADO.");
        }
    }
}
