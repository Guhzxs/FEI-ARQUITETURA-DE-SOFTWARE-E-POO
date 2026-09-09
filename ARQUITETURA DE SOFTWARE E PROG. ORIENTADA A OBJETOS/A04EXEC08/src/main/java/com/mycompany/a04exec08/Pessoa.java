
package com.mycompany.a04exec08;


public class Pessoa {
    private String nome, telefone;
    private int id;
    private static int proximoId = 0;
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.id = ++proximoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Pessoa.proximoId = proximoId;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", id=" + id + '}';
    }
    
    
}


