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
public abstract class PhoneCall {
    private String phoneNumber;
	private Double callPrice;
	String aux = null;
	
	
	public PhoneCall( String num ) {
		setPhoneNumber(num);
		callPrice = 0.00;
		aux = phoneNumber;
	}
	

	
	

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	

	public abstract String getPhoneNumber();
	
	public abstract Double getPriceCall();
	
	public abstract String getCallInformation();

    
}
