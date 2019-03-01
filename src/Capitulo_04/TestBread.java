/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
/**
 *
 * @author Sergio
 */
public class TestBread {

    public static void main(String[] args) {
        Bread bread1 = new Bread();
        Bread bread2 = new Bread("centeno", 10);
        Bread bread3 = new Bread("integral", 20);
        
        System.out.println(Bread.MOTTO);
       
        System.out.println("Tipo pan: "+bread1.getBread());
        System.out.println("Calorias: "+bread1.getCals());
        System.out.println("Tipo pan: "+bread2.getBread());
        System.out.println("Calorias: "+bread2.getCals());
        System.out.println("Tipo pan: "+bread3.getBread());
        System.out.println("Calorias: "+bread3.getCals());
        
    }
    
}
