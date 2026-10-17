
package com.mycompany.a07exemp01;
/**
 *
 * @author unifgustasouza
 */
public class Main {
    public static void main (String[] args){
        //Integer [] itens = new Integer [10];
        Integer [] itens = null;
        
        //for(int i = 0; i < itens.length; i++){
            //System.out.println(itens[i]);
        //}
        
        try{
            for(int i = 0; i <= itens.length; i++){
            //System.out.println(itens[i]);
            itens[i] = i;
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Deu excecao!");
        }
        
        
        
        System.out.println("O programa terminou com sucesso.");
    }
}
