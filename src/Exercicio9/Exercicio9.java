package Exercicio9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu PESO (ex.: 65,5): ");
        double peso = leitor.nextDouble();

        System.out.println("Insira sua ALTURA (ex.: 1,70): ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura); // função para calcular potência

        System.out.println("Seu IMC é: "+imc);

        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else if (imc >= 40) {
            System.out.println("Obesidade grau III (mórbida)");
        }


    }
}
