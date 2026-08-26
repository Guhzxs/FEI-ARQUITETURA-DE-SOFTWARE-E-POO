
package com.mycompany.a03e01;


public class TesteFunc {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Fulano", "Aparecido", "Masc", 7000, 25, 101);
        
        System.out.printf("F1: %s %s, sexo = %s, salario = %.2f, idade = %d, num %d\n",
                f1.getNome(), f1.getSobrenome(), f1.getSexo(), f1.getSalMensal(),
                f1.getIdade(), f1.getNumero());
        
        System.out.printf("F2: %s %s, sexo = %s, salario = %.2f, idade = %d, num %d\n",
                f2.getNome(), f2.getSobrenome(), f2.getSexo(), f2.getSalMensal(),
                f2.getIdade(), f2.getNumero());
    }
}
