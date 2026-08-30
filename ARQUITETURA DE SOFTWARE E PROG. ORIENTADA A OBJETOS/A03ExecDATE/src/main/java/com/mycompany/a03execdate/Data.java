
package com.mycompany.a03execdate;


public class Data {
    //atributos
    
    private int dia, mes, ano;
    
    public Data( int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data (String mes, int dia, int ano){
        this.dia = dia;
        this.ano = ano;
        
        if(mes.equalsIgnoreCase("Janeiro")){
            this.mes = 1;
        } else if (mes.equalsIgnoreCase("Fevereiro")){
            this.mes = 2;
        } else if (mes.equalsIgnoreCase("Marco")){
            this.mes = 3;
        } else if (mes.equalsIgnoreCase("Abril")){
            this.mes = 4;
        } else if (mes.equalsIgnoreCase("Maio")){
            this.mes = 5;
        } else if (mes.equalsIgnoreCase("Junho")){
            this.mes = 6;
        } else if (mes.equalsIgnoreCase("Julho")){
            this.mes = 7;
        } else if (mes.equalsIgnoreCase("Agosto")){
            this.mes = 8;
        } else if (mes.equalsIgnoreCase("Setembro")){
            this.mes = 9;
        } else if (mes.equalsIgnoreCase("Outubro")){
            this.mes = 10;
        } else if (mes.equalsIgnoreCase("Novembro")){
            this.mes = 11;
        } else if (mes.equalsIgnoreCase("Dezembro")){
            this.mes = 12;
        }
    }
    
    public Data (int diaDoAno, int ano){
        this.ano = ano;
        this.mes = 1;
        
        int saldoDias = diaDoAno; //variavel para ir gastando
        
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        while (saldoDias > diasPorMes[this.mes]){
            saldoDias = saldoDias - diasPorMes[this.mes];
            this.mes = this.mes + 1;
        }
        
         this.dia = saldoDias;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void imprimirFormato1(){
        System.out.printf(this.dia + "/" + this.mes + "/" + this.ano);
    }
    
    public void imprimirFormato2(){
        String[] meses = {"", "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", 
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", 
            "Dezembro"};
        
        System.out.println(meses[this.mes] + " " + this.dia + ", " + this.ano); 
    }
    
    public void imprimirFormato3(){
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDias = 0;
        int mesAtual = 1;
        
        while (mesAtual < this.mes){
            totalDias = totalDias + diasPorMes[mesAtual];
            mesAtual = mesAtual + 1;
            
        }
        
        totalDias += this.dia;
        
        System.out.println(totalDias + ", " + this.ano);
        
    }
    
}
