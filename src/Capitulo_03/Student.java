/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_03;

/**
 *
 * @author Sergio
 */
public class Student {
    private Integer numcontrol;
    private Integer horasgan;
    private Integer puntos;
    
    
    public void setNumcontrol (Integer num){
        this.numcontrol = num;
    }
    
    public void setHorasgan (Integer horas){
        this.horasgan = horas;
    }
    
    public void setPuntos (Integer puntos){
        this.puntos = puntos;
    }
    
    public double promedio (){
        double promedio = this.puntos/this.horasgan;
        return promedio;
    }
    
    public Integer getNumcontrol (){
        return this.numcontrol;
    }
    
    public int getHorasgan(){
        return this.horasgan;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
}
