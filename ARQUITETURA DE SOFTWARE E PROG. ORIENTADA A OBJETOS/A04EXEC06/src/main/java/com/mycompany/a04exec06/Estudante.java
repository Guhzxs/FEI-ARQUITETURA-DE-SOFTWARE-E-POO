
package com.mycompany.a04exec06;


public class Estudante {
     private String nome, sobrenome;
     private int identificador; 
     private static int proximoId = 0;
     
     public Estudante(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificador = ++proximoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Estudante.proximoId = proximoId;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", identificador=" + identificador + '}';
    }
     
     
}
