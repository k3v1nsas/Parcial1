/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;

/**
 *
 * @author daniel
 */
public class State {
    
    private String edo;
    private Integer poblacion;
    city c1 = new city();
    city c2  = new city();
    
    public State(){
        edo = "";
        poblacion =0;
        c1.nombre = "";
        c1.prob = 0;
        c2.nombre = "";
        c2.prob = 0;
    }
    public void setedo(String edo){
        this.edo = edo;
    }
    
    public void setpoblacion(Integer poblacion){
        this.poblacion=poblacion;
    }
    
    public String getedo(){
        return this.edo;
    }
    
    public int getpoblacion(){
        return this.poblacion;
    }
    
    public void setc1(String nom, Integer p){
        this.c1.setnom(nom);
        this.c1.setPob(p);
    }
    
    public void setc2(String nom, Integer p){
        this.c2.setnom(nom);
        this.c2.setPob(p);
    }
    
    public String getc1(){
        return c1.getnom();
    }
    
    public String getc2(){
        return c2.getnom();
    }
    
    public Integer getpc1(){
        return c1.getpob();
    }
    
    public Integer getpc2(){
        return c2.getpob();
    }
    private class city{
        private String nombre;
        private int prob;
        
        public void setnom( String nom){
            this.nombre = nom;
        }
        
        public void setPob(Integer pob){
            this.prob= pob;
        }
        
        public String getnom(){
            return this.nombre;
        } 
        
        public int getpob(){
            return this.prob;
        }
    }
}
