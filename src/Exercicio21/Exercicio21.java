package Exercicio21;

import java.util.Random;

public class Exercicio21 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int numeroAleatorio = gerador.nextInt(0,100);

        System.out.println(numeroAleatorio);
    }
}
