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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos =  new Scanner (System.in);
        Integer horasn;
        Integer horase;
        double pagoporhora;
        horasn=datos.nextInt();
        horase=datos.nextInt();
        pagoporhora=datos.nextDouble();
        System.out.println("se le pagará " + (horasn*pagoporhora)+horasextras(pagoporhora, horase));
    }
    
    public static double horasextras (double pago, Integer horasex){
        return pago*horasex*1.5;
    }
}
