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
public class BloodData {
    private String san;
    private String rh;

    
    BloodData() {
        san = "O";
	rh = "+";
    }
	
    BloodData(String tipoSan, String factRH) {
        this.san = tipoSan;
	this.rh = factRH;
    }
	
    public String getTipoSan() {
        return san;
    }
	
    public void setTipoSan(String tipo) {
        this.san = tipo;
    }
	
    public String getRh() {
	return this.rh;
    }
	
    public void setRh(String factor) {
	this.rh = factor;
    }
}
