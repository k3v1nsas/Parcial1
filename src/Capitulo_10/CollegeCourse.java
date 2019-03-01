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
public class CollegeCourse {
    private Departament departament;
	private Integer courseNumber;
	private Integer credits;
	private Double cost;
	
	
	public CollegeCourse( Departament depto, Integer num, Integer c ) {
		
		departament = depto;
		courseNumber = num;
		credits = c;
		setCost( (double) c); 
		
	}
	

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public Integer getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double credit) {
		
		cost = (double) (120 * credit);
		
	}
	
	
	
	public void display() {
		
		
		System.out.println( " Departament Name : \t " + departament );
		System.out.println( " Course Number : \t " + courseNumber );
		System.out.println( " Credits's Number : \t " + credits );
		System.out.println( " Course Cost : \t \t $ " + cost );
		
		
	}
	   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int dep;
		
		System.out.println( " Escoja un Departamento : \n " );
		System.out.println( " 1. LENGUAGE, 2.LITERATURE, 3. SCIENCES, 4. SOCIAL_SCIENCES, "
				+ " 5. MATH, 6. PHYSICAL_EDUCATION, 7. BIO, 8. CHM,  9. CIS, 10. PHY " );
		dep = sc.nextInt();
		
		switch( dep ) {
		
		case 1 :
			
			CollegeCourse curso1 = new CollegeCourse(Departament.LENGUAGE, 101, 1);
			curso1.display();
			
			break;
			
		case 2: 
			
			CollegeCourse curso2 = new CollegeCourse(Departament.LITERATURE, 202, 2);
			curso2.display();
			
			break;
			
		case 3 :
			
			CollegeCourse curso3 = new CollegeCourse(Departament.SCIENCES, 303, 3);
			curso3.display();
			
			break;
			
		case 4 :
			
			CollegeCourse curso4 = new CollegeCourse(Departament.SOCIAL_SCIENCES, 404, 4);
			curso4.display();
			
			break;
			
		case 5 :
			
			CollegeCourse curso5 = new CollegeCourse(Departament.MATH, 505, 5);
			curso5.display();
			
			break;
			
		case 6 :
			
			CollegeCourse curso6 = new CollegeCourse(Departament.PHYSICAL_EDUCATION, 101, 1);
			curso6.display();
			
			break;
			
		case 7 :
			
			LabCourse bio = new LabCourse(Departament.BIO, 606, 6);
			bio.display();
			
			break;
			
		case 8 : 
			
			LabCourse chm = new LabCourse(Departament.CHM, 707, 7);
			chm.display();
			
			break;
			
		case 9 :
			
			LabCourse cis = new LabCourse(Departament.CIS, 808, 8);
			cis.display();
			
			break;
			
		case 10 : 
			
			LabCourse phy = new LabCourse(Departament.PHY, 909, 9);
			phy.display();
			
			break;
			
			
			default : System.out.println( " Ingreso una Opcion Invalida!. \n Ingrese una Opcion Correcta " );
		
		
		}
    }
}
