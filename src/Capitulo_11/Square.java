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
public class Square extends GeometricFigure{
    public Square(Double alto, Double ancho, Figure t) {
		super(alto, ancho, t);
		
	}


	
	public Double calculateArea() {
		
		return getWeight() * getHeight();
		
	}
    
}
