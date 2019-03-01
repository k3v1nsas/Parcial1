/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_03;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class GasPrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Integer pricePerBarrel;
        pricePerBarrel = datos.nextInt();
        rango(pricePerBarrel);
        // TODO code application logic here
    }
    
    public static void rango(Integer a){
        System.out.println("la bomba debe estar entre $"+(a*3.5)/100+ " y $"+(a*4.0)/100);
    }
}
