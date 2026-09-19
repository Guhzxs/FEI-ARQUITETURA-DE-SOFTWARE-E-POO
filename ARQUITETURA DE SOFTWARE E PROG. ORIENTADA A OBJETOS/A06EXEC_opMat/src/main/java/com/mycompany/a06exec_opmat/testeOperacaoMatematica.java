
package com.mycompany.a06exec_opmat;

import java.util.Scanner;

/**
 *
 * @author unifgustasouza
 */
public class testeOperacaoMatematica {
    public static void main(String[] args) {
        OperacaoMatematica operacao;
    
        Scanner teclado = new Scanner (System.in);
        String op = teclado.nextLine();

        if (op.equals("soma")){
            operacao = new Soma();
        }
        else if (op.equals("subtracao")){
            operacao = new Subtracao();
        }
        else if (op.equals("multiplicacao")){
            operacao = new Multiplicacao();
        }
        else {
            operacao = new Divisao ();
        }
        
        System.out.println("Resultado: " + operacao.calcular(5, 4));
    }       
}
