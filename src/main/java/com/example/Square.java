/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author 2109734
 */
public class Square {
    
    private int valor;
    private int cuadrado;
    
    public Square(int valor){
        this.valor = valor;
        this.cuadrado = (int)Math.pow(valor,2);
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getCuadrado(){
        return cuadrado;
    }
    
    public void setCuadrado(int cuadrado){
        this.cuadrado = cuadrado;
    }
    
}
