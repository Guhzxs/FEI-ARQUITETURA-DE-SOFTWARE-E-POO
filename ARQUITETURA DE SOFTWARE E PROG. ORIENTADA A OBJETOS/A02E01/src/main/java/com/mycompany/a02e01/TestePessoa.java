
package com.mycompany.a02e01;

import java.util.Scanner;

public class TestePessoa {
    //atributos
    
    //metodos
    public static void main(String[] args) {
        //declarar variaveis locais
        String nomeLocal, cpfLocal;
        int idadeLocal;
        
        //declarar um "recurso do tipo teclado"
        Scanner teclado = new Scanner(System.in);
        
        //------- INICIO P1 -------
        //criar um objeto da classe pessoa
        Pessoa p1 = new Pessoa();
        
        
        //atribuir valores para os atributos de p1
        System.out.println("Digite o nome de P1: ");
        nomeLocal = teclado.nextLine();
        p1.setNome(nomeLocal);
        
        System.out.println("Digite o CPF de P1: ");
        cpfLocal = teclado.nextLine();
        p1.setCpf(cpfLocal);
        
        System.out.println("Digite a idade de P1: ");
        idadeLocal = teclado.nextInt();
        p1.setIdade(idadeLocal);
        
        //obter valores do atributos de p1
        System.out.println("------- DADOS DE P1 -------");
        System.out.println("Nome......: " + p1.getNome());
        System.out.println("CPF......: " + p1.getCpf());
        System.out.println("Idade......: " + p1.getIdade());
        System.out.println("---------------------------");
        
        //LIMPEZA DO BUFFER DO TECLADO
        teclado.nextLine();
        
        // ------------------------
        
        //------- INICIO P2 -------
        String nomeLocal2, cpfLocal2;
        int idadeLocal2;
        //criar um objeto da classe pessoa
        Pessoa p2 = new Pessoa();
        
        
        //atribuir valores para os atributos de p2
        System.out.println("Digite o nome de P2: ");
        nomeLocal2 = teclado.nextLine();
        p2.setNome(nomeLocal2);
        
        System.out.println("Digite o CPF de P2: ");
        cpfLocal2 = teclado.nextLine();
        p2.setCpf(cpfLocal2);
        
        System.out.println("Digite a idade de P2: ");
        idadeLocal2 = teclado.nextInt();
        p2.setIdade(idadeLocal2);
        
        //obter valores do atributos de p1
        System.out.println("------- DADOS DE P2 -------");
        System.out.println("Nome......: " + p2.getNome());
        System.out.println("CPF......: " + p2.getCpf());
        System.out.println("Idade......: " + p2.getIdade());
        System.out.println("---------------------------");
        
        //LIMPEZA DO BUFFER DO TECLADO
        teclado.nextLine();
        
        // ------------------------
        
        //------- INICIO P3 -------
        
        String nomeLocal3, cpfLocal3;
        int idadeLocal3;
        //criar um objeto da classe pessoa
        Pessoa p3 = new Pessoa();
        
        
        //atribuir valores para os atributos de p3
        System.out.println("Digite o nome de P3: ");
        nomeLocal3 = teclado.nextLine();
        p3.setNome(nomeLocal3);
        
        System.out.println("Digite o CPF de P3: ");
        cpfLocal3 = teclado.nextLine();
        p3.setCpf(cpfLocal3);
        
        System.out.println("Digite a idade de P3: ");
        idadeLocal = teclado.nextInt();
        p3.setIdade(idadeLocal);
        
        //obter valores do atributos de p3
        System.out.println("------- DADOS DE P3 -------");
        System.out.println("Nome......: " + p3.getNome());
        System.out.println("CPF......: " + p3.getCpf());
        System.out.println("Idade......: " + p3.getIdade());
        System.out.println("---------------------------");
        
        //LIMPEZA DO BUFFER DO TECLADO
        teclado.nextLine();
        
        // ------------------------
    }
}
