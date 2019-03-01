/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Sergio
 */
public class CertificateOfDeposit {
    private String ncerti;
    private String apellido;
    private double saldo;
    private Integer dia, mes, año;
    private GregorianCalendar fecha = new GregorianCalendar();
    
    public CertificateOfDeposit(){
        ncerti = "";
        apellido ="";
        saldo =0;
        fecha = this.fecha;
    }
    public void aumentar(){
        String res = null;
        fecha.add(GregorianCalendar.MONTH, 12);
    }
    
    public void setfecha(Integer a, Integer m, Integer d){
        fecha.set(a, m, d);
    }
    
    public Date getFecha(){
        return fecha.getTime();
    }
    
    public void setNumero(String num){
        this.ncerti = num;
    }
    
    public void setapellido (String ap){
        this.apellido = ap;
    }
    
    public void setsaldo (double sal){
        this.saldo = sal;
    }
    
    public String getNumero(){
        return this.ncerti;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
