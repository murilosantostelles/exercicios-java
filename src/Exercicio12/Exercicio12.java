package Exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Preço do Produto: ");
        double valorProduto = leitor.nextDouble();


        System.out.println("(1) - À Vista em Dinheiro ou Pix - 15% de Desconto");
        System.out.println("(2) - À Vista no Cartão de Crédito - 10% de Desconto");
        System.out.println("(3) - Parcelado no Cartão em duas vezes - Preço normal do Produto, sem juros");
        System.out.println("(4) - Parcelado no Cartão em três vezes ou mais - Preço normal do Produto + Juros de 10%");
        System.out.println("FORMA DE PAGAMENTO: ");

        int opcao = leitor.nextInt();

        if (opcao == 1){
            double preco = valorProduto - (valorProduto * 0.15);
            System.out.println("Preço final: R$"+preco);
        } else if (opcao == 2) {
            double preco = valorProduto - (valorProduto * 0.1);
            System.out.println("Preço final: R$"+preco);
        } else if (opcao == 3) {
            System.out.println("Preço final: R$"+valorProduto);
        } else if (opcao == 4) {
            double preco = valorProduto + (valorProduto * 0.1);
            System.out.println("Preço final: R$"+preco);
        }
    }
}
