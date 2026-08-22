
package com.mycompany.a02e01;


public class Pessoa {
    //atributos 
    private String nome, cpf;
    private int idade;
    
    
    //métodos
    
    //get (obeter os valores dos atributos)
    public String getNome() {
            return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    //set (atribuir valores para os atributos)
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    
    public void setIdade (int idade){
        if (idade < 0 || idade > 150){
            idade = 0;
        }
        this.idade = idade;
    }
}
