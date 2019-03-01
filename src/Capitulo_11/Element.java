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
public abstract class Element {
    private String symbol;
	private Integer atomicNumber;
	private Double atomicWeight;
	
	
	public Element( String s, Integer num, Double m ) {
		
		symbol = s;
		atomicNumber = num;
		atomicWeight = m;
		
	}


	public String getSymbol() {
		return symbol;
	}


	public Integer getAtomicNumber() {
		return atomicNumber;
	}


	public Double getAtomicWeight() {
		return atomicWeight;
	}
	
	
	
	
	public abstract void describeElement();
	
	
}
