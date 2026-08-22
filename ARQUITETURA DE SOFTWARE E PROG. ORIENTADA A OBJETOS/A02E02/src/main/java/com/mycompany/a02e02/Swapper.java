
package com.mycompany.a02e02;


public class Swapper {
    //atributos
    private float x, y;
    
    //métodos
    
    //get (obeter os valores dos atributos)
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    //set (atribuir valores para os atributos)
    
    public void setX (float x){
        this.x = x;
    }
    
    public void setY (float y){
        this.y = y;
    }
    
    public void swap (){
        float aux;
        aux = x;
        x = y;
        y = aux;
    }
}
