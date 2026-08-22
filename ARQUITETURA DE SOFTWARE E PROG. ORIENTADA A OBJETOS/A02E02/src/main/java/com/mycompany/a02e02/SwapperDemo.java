
package com.mycompany.a02e02;

import java.util.Scanner;


public class SwapperDemo {
    //atributos
    
    //métodos
    public static void main(String[] args) {
        float xLocal, yLocal;
        
        Scanner teclado = new Scanner(System.in);
        
        Swapper troca = new Swapper();
        
        //atribuir valores para os atributos de p1
        
        System.out.println("Digite o valor de X: ");
        xLocal = teclado.nextFloat();
        troca.setX(xLocal);
        
        System.out.println("Digite o valor de Y: ");
        yLocal = teclado.nextFloat();
        troca.setY(yLocal);
        
        troca.swap();
        
        System.out.println("X :" + troca.getX());
        System.out.println("Y: " + troca.getY());
    }
}
