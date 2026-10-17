/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Divisao;
import model.Multiplicacao;
import model.OperacaoMatematica;
import view.Calculadora;

/**
 *
 * @author unifgustasouza
 */
public class Controle {
    
    private Calculadora janela;
    private OperacaoMatematica calc;
    private String n1, n2;
    
    public Controle (Calculadora view){
        this.janela = view;
    }
    
    public void zero (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "0");
    }
    
    public void um (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "1");
    }
    
    public void dois (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "2");
    }
    
    public void tres (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "3");
    }
    
    public void quatro (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "4");
    }
    
    public void cinco (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "5");
    }
    
    public void seis (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "6");
    }
    
    public void sete (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "7");
    }
    
    public void oito (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "8");
    }
    
    public void nove (){
        String texto = janela.getTxt_display().getText();
        janela.getTxt_display().setText(texto + "9");
    }
    
    public void multiplicacao(){
        n1 = janela.getTxt_display().getText();
        calc = new Multiplicacao ();
        janela.getTxt_display().setText("");
    }
    
    public void divisao () {
        n1 = janela.getTxt_display().getText();
        calc = new Divisao ();
        janela.getTxt_display().setText("");
    }
    
    
}
