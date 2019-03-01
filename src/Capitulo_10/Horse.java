/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_10;

/**
 *
 * @author Sergio
 */
public class Horse {
    private String nombre;
    private Raza color;
    private Integer añoNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getColor() {
        return color;
    }

    public void setColor(Raza color) {
        this.color = color;
    }

    public Integer getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    
    
    public static void main(String[] args) {
        Horse caballo = new Horse();
		caballo.setAñoNacimiento(2010);
		caballo.setColor(Raza.CATALAN);
		caballo.setNombre("Aquilani");
		
		RaceHorse deCarreras = new RaceHorse();
		deCarreras.setAñoNacimiento(2002);
		deCarreras.setColor(Raza.ARA_APALOOSA);
		deCarreras.setNombre("LUCIFER!");
		
		System.out.println( " Caballo Normal : \n " );
		
		System.out.println( " El Nombre del Caballo es : \t " + caballo.getNombre() );
		System.out.println( " La Raza del Caballo es : \t " + caballo.getColor() );
		System.out.println( " El Año de Nacimiento del Caballo es : \t " + caballo.getAñoNacimiento() );
		
		System.out.println( " \n Caballo de Carreras : \n " );
		
		System.out.println( " El Nombre del Caballo de Carreras es : \t " + deCarreras.getNombre() );
		System.out.println( " La Raza del Caballo de Carreras es : \t " + deCarreras.getColor() );
		System.out.println( " El Año de Nacimiento del Caballo de Carreras es : \t " + deCarreras.getAñoNacimiento()  );
    }
    
}
