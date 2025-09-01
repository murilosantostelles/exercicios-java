package Exercicio23.test;

import Exercicio23.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Newton" , 50.0, 100, 10.0);

        System.out.println("Salário Bruto: R$"+professor01.calcularSalarioBruto());
        System.out.println("Salário Líquido: R$"+professor01.calcularSalarioLiquido());
    }
}
