/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06exec02;

/**
 *
 * @author unifgustasouza
 */
abstract public class Formas {
    private String tipo;
    
    public Formas(){
        
    }

    public Formas(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double perimetro ();
    
    public abstract void print();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
