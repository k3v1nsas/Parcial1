/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author Sergio
 */
public class Fraccion{
    private Integer Numerador;
    private Integer Denominador;
    public Fraccion(Integer n,Integer m){
    this.Numerador = n;
    this.Denominador = m;
    }
    @Override
    public String toString(){
    return String.format("%d/%d", getNumerador(), getDenominador());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraccion) {
            Fraccion tmp =(Fraccion) obj;
            return this.getNumerador()*tmp.Denominador == this.getDenominador()*tmp.Numerador;
        }else{
            return false;
        }
            
    }
    public void simplificar(){
    //simplicar Tarea
    }
    public Double toDecimal(){
    return (double)this.getNumerador()/this.getDenominador();
    }
    public void agregar(Fraccion Fraccion){
    this.setNumerador((this.getNumerador()*Fraccion.getDenominador())+(this.getDenominador()*Fraccion.getNumerador()));
    this.setDenominador(this.getDenominador()*Fraccion.getDenominador());
    }
   // public static Fraccion sumar(Fraccion Fa,Fraccion Fb){
        
    //}
    /**
     * @return the Numerador
     */
    public Integer getNumerador() {
        return Numerador;
    }

    /**
     * @param Numerador the Numerador to set
     */
    public void setNumerador(Integer Numerador) {
        this.Numerador = Numerador;
    }

    /**
     * @return the Denominador
     */
    public Integer getDenominador() {
        return Denominador;
    }

    /**
     * @param Denominador the Denominador to set
     */
    public void setDenominador(Integer Denominador) {
        this.Denominador = Denominador;
    }
    public boolean CompareTo(){
    return false;
    }
}
