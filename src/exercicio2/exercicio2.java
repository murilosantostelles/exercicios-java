package exercicio2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int numero = leitor.nextInt();

        if(numero%2 == 0){
            System.out.println("O valor "+ numero+" é PAR" );
        }else{
            System.out.println("O valor "+ numero+" é ÍMPAR" );
        }

        if(numero>0){
            System.out.println("O valor "+numero+" é POSITIVO.");
        }else{
            System.out.println("O valor "+numero+" é NEGATIVO.");
        }
    }
}
