package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Valor A: (true) (false)");
        boolean valorA = leitor.nextBoolean();

        System.out.println("Digite o Valor B: (true) (false)");
        boolean valorB = leitor.nextBoolean();

        if(valorA == valorB){
            if (valorA == true){
                System.out.println("Os dois são verdadeiros.");
            }else{
                System.out.println("Os dois são falsos.");
            }
        }else{
            if(valorA == true){
                System.out.println("Valor A = true e Valor B = false");
            }else{
                System.out.println("Valor A = false e Valor B = true");
            }
        }
    }
}
