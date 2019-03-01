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
public class Circle {
    private double radio;
	private double a;
	private double d;

	public void setRadio(double r){
            this.radio = r;
	}

	public double getRadio(){
            return radio;
	}

	public double getDiametro(){
            return radio * 2;
	}

	public double Area(){
            return ((radio*radio)*Math.PI);
	}
}
