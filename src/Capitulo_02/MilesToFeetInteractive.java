/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_02;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class MilesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        float pies=5280;
        float dato;
        float milla;
        System.out.println("ingrese el numero de millas");
        milla = datos.nextFloat();
        dato=milla*pies;
        System.out.println("la distancia a la casa de mi tío es de " +milla + "millas o " +dato+ "pies");
        
    }
    
}
