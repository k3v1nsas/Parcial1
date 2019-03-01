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
public abstract class GeometricFigure {
    private Double height;
	private Double width;
	private Figure type;
	
	
	public GeometricFigure( Double alto, Double ancho, Figure t ) {
		
		height = alto;
		width = ancho;
		type = t;
		
	}
	
	
	
	
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double getWeight() {
		return width;
	}
	
	public void setWeight(Double weight) {
		this.width = weight;
	}
	
	public Figure getType() {
		return type;
	}
	
	public void setType(Figure type) {
		this.type = type;
	}
	
	
	
	
	public abstract Double calculateArea();
	
	
	
	
}
