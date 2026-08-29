
package com.mycompany.a03e03;

public class Carro {
    //atributos
    private String modelo, cor;
    private int ano, km;
    private double preco;
    
    //metodos
    
    public Carro() { //contrutor-padrao - nao parametrizado
        
    }
    
    //construtor totalmente parametrizado
    public Carro (String modelo, String cor, int ano, int km, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.preco = preco;
        
    }
    
    //construtor parcialmente parametrizado
    public Carro (String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
