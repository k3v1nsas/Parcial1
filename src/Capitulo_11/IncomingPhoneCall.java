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
public class IncomingPhoneCall extends PhoneCall{
    public IncomingPhoneCall(String num) {
		super(num);
		
	}
	
	
	
	public String getPhoneNumber() {
		
		return aux;
	}

	
	public Double getPriceCall() {
		
		return 0.02;
	}

	
	public String getCallInformation() {
		
		return " \n " + " Number : \t " + this.getPhoneNumber() + " \n " + " Rate : \t " + getPriceCall() + 
				" \n " + " Price of the Call : \t " + getPriceCall();
	}
    
}
