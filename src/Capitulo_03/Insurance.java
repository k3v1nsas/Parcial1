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
public class Insurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner (System.in);
        Integer anioactual;
        Integer anionacimiento;
        anioactual=datos.nextInt();
        anionacimiento = datos.nextInt();
        System.out.println("el cliente pagara $"+ pago(anioactual, anionacimiento));
        
    }
    
    public static int pago (Integer a, Integer b){
        int dec = (a-b)/10;
        return (dec+15)*20;
    }
}
