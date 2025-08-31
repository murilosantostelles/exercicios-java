package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = leitor.nextInt();

        int antecessor = valor - 1;
        int sucessor = valor + 1;

        System.out.println("Antecessor de "+valor+ ": "+ antecessor);
        System.out.println("Sucessor de "+valor+ ": "+ sucessor);
    }

}
