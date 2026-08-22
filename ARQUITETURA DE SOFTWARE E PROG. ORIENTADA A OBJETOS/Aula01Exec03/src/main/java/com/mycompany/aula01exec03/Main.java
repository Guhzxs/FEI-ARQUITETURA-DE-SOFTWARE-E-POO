
package com.mycompany.aula01exec03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int q1, q2, q3, q4, q5, q6;
        float D, R;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de moedas de U$1,00: ");
        q1 = teclado.nextInt();
        
        System.out.println("Digite a quantidade de moedas de U$0,50: ");
        q2 = teclado.nextInt();
        
        System.out.println("Digite a quantidade de moedas de U$0,25: ");
        q3 = teclado.nextInt();
        
        System.out.println("Digite a quantidade de moedas de U$0,10: ");
        q4 = teclado.nextInt();
        
        System.out.println("Digite a quantidade de moedas de U$0,05: ");
        q5 = teclado.nextInt();
        
        System.out.println("Digite a quantidadem de moedas de U$0,01: ");
        q6 = teclado.nextInt();
        
        D = (float) 5.21;
        
        R = (float) ((q1 + 0.5 * q2 + 0.25 * q3 + 0.1 * q4 + 0.05 * q5 + 0.01 * q6) * D);
        
        System.out.println("O valor total em R$ é: " + R);
      
        
    }
}
