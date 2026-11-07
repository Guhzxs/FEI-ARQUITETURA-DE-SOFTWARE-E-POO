/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a10exec01;

public class Pair <F, S> {
    private F valor1;
    private S valor2;
    
    public Pair (F valor1, S valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public F getValor1(){
        return valor1;
    }
    
    public void setValor1 (F valor1){
        this.valor1 = valor1;
    }

    public S getValor2() {
        return valor2;
    }

    public void setValor2(S valor2) {
        this.valor2 = valor2;
    }
}
