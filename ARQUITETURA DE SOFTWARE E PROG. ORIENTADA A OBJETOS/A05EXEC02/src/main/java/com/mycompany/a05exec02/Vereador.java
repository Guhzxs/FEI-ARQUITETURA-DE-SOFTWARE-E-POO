/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a05exec02;

/**
 *
 * @author unifgustasouza
 */
public class Vereador extends Politico{
    String municipio;

    public Vereador() {
    }

    public Vereador( String nome, String partido, String municipio, String estado) {
        super(nome, partido, estado, "Vereador");
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Vereador{" + "municipio=" + municipio + '}';
    }
    
    @Override
     public void apresentacao (){
        System.out.println("---- APRESENTACAO VEREADOR ----");
        System.out.println("Nome.........: " + getNome());
        System.out.println("Partido......: " + getPartido());
        System.out.println("Estado.......: " + getEstado());
        System.out.println("Funcao.......:" + getFuncao());
        System.out.println("Municipio...: " + municipio);
    }
    
}
