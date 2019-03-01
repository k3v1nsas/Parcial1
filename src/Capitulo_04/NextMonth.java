/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
import java.util.GregorianCalendar;
/**
 *
 * @author Sergio
 */
public class NextMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar inicio = new GregorianCalendar();
        GregorianCalendar fin = new GregorianCalendar();
        fin.add(GregorianCalendar.MONTH, 1);
        int dia = fin.get(GregorianCalendar.DAY_OF_MONTH);
        fin.add(GregorianCalendar.DATE, -dia);
       
        long dif = fin.getTimeInMillis() - inicio.getTimeInMillis();
        dif = dif/(1000*60*60*24);
        
        System.out.println(dif);
                
    }
    
}
