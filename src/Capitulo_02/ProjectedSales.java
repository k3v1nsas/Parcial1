/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_02;
/**
 *
 * @author Sergio
 */
public class ProjectedSales {
    public static void main(String[] args) {
        //Variables con los valores propuestos
        double incr = 0.10;
        int norte = 4000;
        int sur = 5500;
        double proyecNorte;
        double proyecSur;
	
        //Calculo de las proyecciones
        proyecNorte = norte + (norte * incr);
        proyecSur = sur + (sur * incr);
	//Muestra de resultados    
        System.out.println("La cifra de ventas proyectadas para el norte es " + proyecNorte);
        System.out.println("La cifra de ventas proyectadas para el sur es " + proyecSur);
    }    
}
