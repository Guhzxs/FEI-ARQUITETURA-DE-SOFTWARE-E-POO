
package com.mycompany.aula01exec02;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        //DECLARAÇÃO DE VARIÁVEIS
        int qtdHrs;
        float salBruto, valorHora;
        
        //CRIAÇÃO DE UM RECURSO DO TIPO TECLADO 
        Scanner teclado = new Scanner(System.in);
        
        //RECEBENDO OS DADOS DO USUÁRIO
        System.out.println("Digite o valor hora: ");
        valorHora = teclado.nextFloat();
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        qtdHrs = teclado.nextInt();
        
        //CALCULANDO O SALARIO BRUTO
        salBruto = qtdHrs * valorHora;
        
        //EXIBINDO O SALÁRIO CALCULADO
        System.out.println("Salario = " + salBruto);
    }
}
