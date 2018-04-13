/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.*; 
import java.net.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2109734
 */
public class Client extends Thread{
    
    public static void main(String[] args) throws Exception {
        for (int i=0; i<20; i++){
            Thread hilo = new Thread();
            hilo.start();
        }
    }
    
    @Override
    public void run(){
        result("hello");
        result("");
        result("db");
    }
    
    public void result(String option){
        try {
            URL google = new URL("https://parcial2-arem.herokuapp.com/"+option);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
                String inputLine = null;
                while ((inputLine = reader.readLine()) != null) {
                    System.out.println(inputLine);
                }
            } catch (IOException x) { 
                System.err.println(x);
            }
        } catch (MalformedURLException ex) { 
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null,ex); 
        } 
    }
}
