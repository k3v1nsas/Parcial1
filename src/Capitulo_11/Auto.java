/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_11;

/**
 *
 * @author Sergio
 */
public abstract class Auto {
    private Maker marca;
	private Double price;
	
	
	public Auto( Maker m, Double p) {
		
		marca = m;
		price = p;
		
		
	}
	
	
	
	
	
	public Maker getMarca() {
		return marca;
	}
	
	public void setMarca(Maker marca) {
		this.marca = marca;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public abstract void setPrice(Double price);
	
	
	
	
	
}
