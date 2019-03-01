/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_04;
import java.util.*;
/**
 *
 * @author daniel
 */
public class TestCertificateOfDeposit {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos =  new Scanner (System.in);
        // TODO code application logic here
       CertificateOfDeposit dep = new CertificateOfDeposit();
      
       System.out.println("numero de certificado:");
       String num = datos.nextLine();
       dep.setNumero(num);
       System.out.println("Apellido del titular: ");
       String ape = datos.nextLine();
       dep.setapellido(ape);
       System.out.println("saldo de la cuenta: ");
       double saldo = datos.nextDouble();
       dep.setsaldo(saldo);
       
       System.out.println("fecha: \ndia:");
       int dia = datos.nextInt();
       System.out.println("mes: ");
       int mes  = datos.nextInt();
       System.out.println("anio: ");
       int anio = datos.nextInt();
       
       dep.setfecha(anio, (mes-1), dia);
       
       
       
       System.out.println("los datos quedan de la sig manera:");
       System.out.println("numero: "+dep.getNumero());
       System.out.println("apellido: "+ dep.getApellido());
       System.out.println("saldo: "+ dep.getSaldo());
       System.out.println("fecha de apertura: "+dep.getFecha());
       dep.aumentar();
       System.out.println("fecha de vencimiento: "+dep.getFecha());
       
    }
    
}
