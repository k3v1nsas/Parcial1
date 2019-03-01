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
public class Interest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double f= ingresoanual(inicial());
        System.out.println("al año usted tendra una inversion de $"+ f);
    }
    
    public static int inicial(){
        Scanner datos = new Scanner (System.in);
        Integer a;
        a = datos.nextInt();
        return a;
    }
    
    public static double ingresoanual(Integer inicial){
        return inicial*1.05;
    }
    
}
