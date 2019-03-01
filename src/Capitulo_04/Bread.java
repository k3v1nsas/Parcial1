/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
/**
 *
 * @author Sergio
 */
public class Bread {
    public final static String MOTTO = "The staff of life";
    
    private String tipoPan;
    private double cals;
    public Bread(){
        tipoPan = "Blanco";
        cals = 50;
    }
    public Bread(String newTipo, double newCals){
        this.tipoPan = newTipo;
        this.cals = newCals;
    }

    public String getBread(){
        return tipoPan;
    }
    public double getCals(){
        return cals;
    } 
}
