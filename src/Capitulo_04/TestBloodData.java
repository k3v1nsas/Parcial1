/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;

import java.util.Scanner;
/**
 *
 * @author Sergio
 */

public class TestBloodData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        BloodData ex1 = new BloodData();
	BloodData ex2 = new BloodData();
        BloodData ex3 = new BloodData("B", "+");

		
        System.out.print("Ingresa el tipo de sangre: ");
	ex1.setTipoSan(sc.next());
        System.out.print("Ingresa el factor RH: ");
	ex1.setRh(sc.next());
        System.out.println();
				
	// muestra de resultados
        System.out.println("Examen 1\nTipo Sangre: " + ex1.getTipoSan());
	System.out.println("Rh: " + ex1.getRh());
	System.out.println();
		
	System.out.println("Examen 2\nTipo Sangre: " + ex2.getTipoSan());
	System.out.println("Rh: " + ex2.getRh());
	System.out.println();
		
	System.out.println("Examen 3\nTipo Sangre: " + ex3.getTipoSan());
	System.out.println("Rh: " + ex3.getRh());
    }
    
}
