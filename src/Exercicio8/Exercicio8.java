package Exercicio8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite à seguir 3 valores inteiros: ");
        int valor = leitor.nextInt();
        int valorB = leitor.nextInt();
        int valorC = leitor.nextInt();

        numeros.add(valor);
        numeros.add(valorB);
        numeros.add(valorC);

        Collections.sort(numeros);
        System.out.println(numeros);

        //optei por usar funções, para aprender sobre estas no java.
    }
}
