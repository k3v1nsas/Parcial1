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
public class Student extends Person {
    private String studyField;
	private Double averagePoint;
	
	
	public String getStudyField() {
		return studyField;
	}
	
	public void setStudyField(String studyField) {
		this.studyField = studyField;
	}
	
	public Double getAveragePoint() {
		return averagePoint;
	}
	
	public void setAveragePoint(Double averagePoint) {
		this.averagePoint = averagePoint;
	}
	
	
	
	
	@Override
	public void inicializar() {

		System.out.println( " Ingrese el Nombre de su Alumno : \n " );
		setName(d.nextLine());
		System.out.println( " Ingrese el Apellido del Alumno : \n " );
		setLastName(d.nextLine());
		System.out.println( " Ingrese la Direccion del Alumno : \n " );
		setAdress(d.nextLine());
		System.out.println( " Ingrese el Codigo Zip del Alumno : \n " );
		setZipCode(d.nextInt());
		System.out.println( " Ingrese el Numero Telefonico del Alumno : \n " );
		setPhoneNumber(d.nextInt());
		System.out.println( " Ingrese el Campo de Estudio del Alumno : \n " );
		studyField = d.nextLine();
		System.out.println( " Ingrese el Promedio de Calificacion del Alumno : \n " );
		averagePoint = d.nextDouble();
		
	}
	
	@Override
	public String toString() {

		return " Name : " + getName() + " " + " Last Name : " + getLastName() + " " + " Adress : " + " " +
				getAdress() + " " + " Zip Code : " + " " + getZipCode() + " " + " "
						+ "Phone Number : " + " " + getPhoneNumber() + " Field of Study : " +
				studyField + " " + " Grade Point Average  : " + averagePoint + " \n " ;
		
		
		
	}
}
