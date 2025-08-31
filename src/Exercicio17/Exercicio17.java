package Exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahreinheit: ");
        double temperaturaFahrenheit = leitor.nextDouble();

        double temperaturaCelsius = (5 * (temperaturaFahrenheit - 32) / 9);

        System.out.println("Temperatura em Fahreinheit: "+temperaturaFahrenheit);
        System.out.println("Temperatura em Celsius: "+temperaturaCelsius);
    }
}
