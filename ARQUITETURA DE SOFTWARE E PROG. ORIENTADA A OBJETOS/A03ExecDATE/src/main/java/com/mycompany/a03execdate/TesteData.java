
package com.mycompany.a03execdate;

import java.util.Scanner;


public class TesteData {
    public static void main(String[] args) {
         int formato, 
                diaGregLocal, 
                mesGregLocal, 
                anoGregLocal, 
                diaJulLocal, 
                anoJulLocal, 
                diaExtLocal, 
                anoExtLocal;
         String mesExtLocal;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("FORMATOS: \n [1] - (DD/MM/AAAA)\n "
                + "[2] - (Mes DD, AAAA)\n" + "[3] - (DDD, AAAA)\n" );
        System.out.println("Qual formato vocÊ deseja exibir: ");
        formato = teclado.nextInt();
        
        
        
        if (formato == 1){
            System.out.println("Digite o dia: ");
            diaGregLocal = teclado.nextInt();
            System.out.println("Digite o mês (NÚMERICO): ");
            mesGregLocal = teclado.nextInt();
            System.out.println("Digite o ano: ");
            anoGregLocal = teclado.nextInt();
            
            Data grega = new Data(diaGregLocal, mesGregLocal, anoGregLocal);
            
            grega.imprimirFormato1();
            System.out.println("\n");
            grega.imprimirFormato2();
            grega.imprimirFormato3();
        } else if(formato == 2){
            System.out.println("Digite o dia: ");
            diaExtLocal = teclado.nextInt();
            teclado.nextLine(); //limpando o buffer
            System.out.println("Digite o mês: ");
            mesExtLocal = teclado.nextLine();
            System.out.println("Digite o ano: ");
            anoExtLocal = teclado.nextInt();
            
            Data ext = new Data (mesExtLocal, diaExtLocal, anoExtLocal);
            ext.imprimirFormato2();
            System.out.println("\n");
            ext.imprimirFormato1();
            System.out.println("\n");
            ext.imprimirFormato3();
        } else if(formato == 3){
            System.out.println("Digite o dia: ");
            diaJulLocal = teclado.nextInt();
            System.out.println("Digite o ano: ");
            anoJulLocal = teclado.nextInt();
            
            Data jul = new Data (diaJulLocal, anoJulLocal);
            jul.imprimirFormato3();
            jul.imprimirFormato2();
            jul.imprimirFormato1();
        }

    }
    
}
