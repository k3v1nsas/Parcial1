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
public class OutgoingPhoneCall extends PhoneCall{
    private Double callMinutes;
	
	
	public OutgoingPhoneCall(String num, Double mins ) {
		super(num);
		callMinutes = mins;
	}


	
	public String getPhoneNumber() {
		
		return aux;
	}
	
	


	
	public Double getPriceCall() {
		
		return callMinutes * 0.04;
	}


	
	public String getCallInformation() {
		
		return " \n " + " Number : \t " + this.getPhoneNumber() + " \n " + " Rate : \t " + " 0.04" + 
				" \n " + " Number of Minutes : \t " + callMinutes + " \n " + " Price of the Call : \t $ " + this.getPriceCall();
	}
	
}
