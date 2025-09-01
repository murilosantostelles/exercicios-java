package Exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor A: ");
        int valorA = leitor.nextInt();
        System.out.println("Valor B: ");
        int valorB = leitor.nextInt();

        if(valorA >= valorB){
            int quocienteDivisaoInteira = valorA / valorB;
            int restoDivisaoInteira = valorB % valorA;
            System.out.println("Quociente: "+ quocienteDivisaoInteira);
            System.out.println("Resto: "+ restoDivisaoInteira);
        } else if (valorB > valorA) {
            int quocienteDivisaoInteira = valorB / valorA;
            int restoDivisaoInteira = valorB % valorA;
            System.out.println("Quaociente: "+quocienteDivisaoInteira);
            System.out.println("Resto: "+restoDivisaoInteira);
        }
    }
}
