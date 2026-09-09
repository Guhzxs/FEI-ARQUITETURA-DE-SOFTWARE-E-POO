/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a04exec08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifgustasouza
 */
public class TestePessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> agenda = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Seja bem vindo(a) a sua agenda!");
            System.out.println("[n] - Cria uma nova pessoa na agenda");
            System.out.println("[d] - Deletar uma pessoa da agenda");
            System.out.println("[p] - Imprimir toda a agenda");
            System.out.println("[q] - Sair do programa");
            
            System.out.println("Digite a sua opcao: ");
            String opcao = input.next();
            
            
            if(opcao.equalsIgnoreCase("n")){
                System.out.println("Entre com o nome: ");
                String nome = input.next();
                System.out.println("Digite o telefone: ");
                String telefone = input.next();
                agenda.add(new Pessoa(nome, telefone));
            }
            if (opcao.equalsIgnoreCase("p")){
                for(Pessoa pess : agenda){
                    System.out.printf("%d ", pess.getId());
                    System.out.println(pess);
                }
                
            }
            
            if(opcao.equalsIgnoreCase("d")){
                System.out.println("Entre com o nome: ");
                String nome = input.next();
                for(Pessoa pess: agenda){
                    if(pess.getNome().equalsIgnoreCase(nome)){
                        agenda.remove(pess);
                        break;
                    }
                        
                }
            }
            
            if(opcao.equalsIgnoreCase("q")) 
                break;
        }
    }
}
