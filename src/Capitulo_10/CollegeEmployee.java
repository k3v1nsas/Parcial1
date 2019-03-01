/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_10;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class CollegeEmployee extends Person {
    private Integer ssn;
	private Double anualSalary;
	private String departamentName;
	
	
	@Override
	public void inicializar() {

		System.out.println( " Ingrese el Nombre de su Empleado : \n " );
		setName(d.nextLine());
		System.out.println( " Ingrese el Apellido de el Empleado : \n " );
		setLastName(d.nextLine());
		System.out.println( " Ingrese la Direccion de el Empleado  : \n " );
		setAdress(d.nextLine());
		System.out.println( " Ingrese el Codigo Zip de el Empleado : \n " );
		setZipCode(d.nextInt());
		System.out.println( " Ingrese el Numero Telefonico de el Empleado  : \n " );
		setPhoneNumber(d.nextInt());
		System.out.println( " Ingrese el Numero de Seguro Social de el Empleado : \n " );
		ssn = d.nextInt();
		System.out.println( " Ingrese el Salario Anual del Empleado : \n " );
		anualSalary = d.nextDouble();
		System.out.println( " Ingrese el Nombre del Departamento del Empleado : \n " );
		departamentName = d.nextLine();
		
		
	}
	
	
	@Override
	public String toString() {
		
		return " Name : " + getName() + " " + " Last Name : " + getLastName() + " " + " Adress : " + " " +
				getAdress() + " " + " Zip Code : " + " " + getZipCode() + " " + 
				" Phone Number : " + " " + getPhoneNumber() + " " + " NSS : " + " " +
				ssn + " " + " Annual Salary : " + " " + anualSalary + " " + 
				" Departament Name : " + departamentName + " \n " ;
		
	}
	
	   public static void main(String[] args) {
        CollegeEmployee[] empleados = new CollegeEmployee[4];
		Faculty[] facultad = new Faculty[3];
		Student[] students = new Student[7];
		Scanner d = new Scanner(System.in);

		System.out.println( " Que Tipo de Persona Ingresara? \n C, F, S. \n");
		String c = d.next();
		
		switch ( c ) {
		
		case "C":
			
			for (int i = 0; i < empleados.length; i++) {
				
				empleados[i].inicializar();
				
			}
			
			for (int i = 0; i < empleados.length; i++) {
				
				empleados[i].toString();
				
			}
			
			break;
			
		case "F" :
			
			for (int i = 0; i < facultad.length; i++) {
				
				facultad[i].inicializar();
				
			}
			
			for (int i = 0; i < facultad.length; i++) {
				
				facultad[i].toString();
				
			}
			
			break;
			
		case "S" :
			
			for (int i = 0; i < students.length; i++) {
				
				students.toString();
				
			}
			
			for (int i = 0; i < students.length; i++) {
				
				System.out.println( students[i].toString() );
				
			}
			
			break;
			
			
			default : System.out.println( " Ingreso una Opcion Incorrecta. \n Verifique!. \n Ingrese una Opcion Valida!. \n "  );
			
			
		
		
		}
    }
    
}
