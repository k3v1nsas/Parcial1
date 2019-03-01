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
public class PartTime extends Student  {

	public PartTime(String name, Boolean s) {
		super(name, false);
		
		
	}

	
        @Override
	public Integer costTuition() {
		
		return 200;
	}
}
