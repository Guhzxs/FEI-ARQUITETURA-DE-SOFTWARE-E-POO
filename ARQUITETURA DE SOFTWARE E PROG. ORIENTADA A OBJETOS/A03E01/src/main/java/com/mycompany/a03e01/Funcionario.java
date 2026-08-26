
package com.mycompany.a03e01;

public class Funcionario {
    private String nome, sobrenome, sexo;
    private double salMensal;
    private int idade, numero;
    
    public Funcionario (){
        
    }
    
    public Funcionario(String nome, String sobrenome, 
            String sexo, double salMensal, int idade, int numero){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.setIdade(idade);
        this.setsalMensal(salMensal);
        this.setNumero(numero);
        
    }
    
    public void setsalMensal(double salMensal){
        this.salMensal = (salMensal > 0) ? salMensal : 0;; //protegendo o salário
    }
    
    public void setIdade(int idade){
        this.idade = (idade > 0 && idade < 150) ? idade : 0;
    }
    
    public void setNumero(int numero){
        this.numero = (numero > 0) ? numero : 0;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public double getSalMensal (){
        return salMensal;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getNumero(){
        return numero;
    }
}
