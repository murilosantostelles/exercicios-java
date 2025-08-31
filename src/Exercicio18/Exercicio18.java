package Exercicio18;

public class Exercicio18 {
    public static void main(String[] args) {
        double alturaFrancisco = 150;
        double alturaSara = 110;

        double crescimentoFrancisco = 2;
        double crescimentoSara = 3;
        int contadorAnual = 0;

        while (alturaFrancisco >= alturaSara){
            alturaFrancisco += crescimentoFrancisco;
            alturaSara += crescimentoSara;
            contadorAnual += 1;
        }
        System.out.println("Sara seria maior que Francisco em "+contadorAnual+" anos.");
    }
}
