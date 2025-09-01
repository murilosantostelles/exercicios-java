package Exercicio24.test;

import Exercicio24.domain.Carro;
import Exercicio24.domain.Viagem;

public class ViagemTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro(14.5);
        Viagem viagem01 = new Viagem(carro01, 5 , 95.5);

        System.out.println(viagem01.calcularQuantidadeDeLitrosgastos());
    }
}
