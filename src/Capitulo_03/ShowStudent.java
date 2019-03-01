/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_03;

/**
 *
 * @author Sergio
 */
public class ShowStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student();
        s.setNumcontrol(2345);
        s.setHorasgan(3);
        s.setPuntos(7);
        
        System.out.println("promedio: " + s.promedio());
        System.out.println("numero de control: "+ s.getNumcontrol());
        System.out.println("horas acreditadas: "+ s.getHorasgan());
        System.out.println("puntos: "+ s.getPuntos());
    }
    
}
