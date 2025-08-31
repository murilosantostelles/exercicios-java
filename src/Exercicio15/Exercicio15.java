package Exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int anoAtual = 2025;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Em qual ano você nasceu? ");
        int anoNascimento = leitor.nextInt();

        int anosVividos = anoAtual - anoNascimento;
        int meses = anosVividos * 30;
        int dias = anosVividos * 365;

        System.out.println("Anos vividos: "+ anosVividos);
        System.out.println("Meses vividos: "+meses);
        System.out.println("Dias vividos: "+dias);
    }
}
