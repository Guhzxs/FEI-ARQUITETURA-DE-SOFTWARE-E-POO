
package com.mycompany.a06exec02;

import java.util.Scanner;

/**
 *
 * @author unifgustasouza
 */
public class testeFormas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        double comprimentoL, larguraL, raioL;
        String tipoL;
        Formas f;
        
        System.out.println("Qual forma vocÊ deseja criar? ");
        tipoL = teclado.nextLine();
        
        if(tipoL.equalsIgnoreCase("Circulo")){
            System.out.println("Informe o raio: ");
            raioL = teclado.nextDouble();
            f = new Circulo(raioL, "Circulo");
        } else {
            System.out.println("Informe a largura: ");
            larguraL = teclado.nextDouble();
            System.out.println("Informe o comprimento: ");
            comprimentoL = teclado.nextDouble();
            f = new Retangulo(comprimentoL, larguraL, "Retangulo");
        }
        f.print();
    }
    
    
           
}
