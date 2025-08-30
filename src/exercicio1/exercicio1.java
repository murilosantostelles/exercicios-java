package exercicio1;

public class exercicio1 {
    public static void main(String[] args) {
        int valorA = 5;
        int valorB = 20;
        int valorC = 30;

        int somaAB = valorA + valorB;

        System.out.println(valorA+" + "+valorB+" = "+somaAB);
        if(somaAB < valorC){
            System.out.println("A soma entre A e B é menor que o valor C");
            System.out.println(somaAB + " < " + valorC);
        }else {
            System.out.println("Soma AB >= "+ valorC);
        }
    }
}
