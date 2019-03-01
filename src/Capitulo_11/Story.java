/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo_11;

/**
 *
 * @author Sergio
 */
public abstract class Story {
    
    private String title;
	private String authorName;
	private Integer pagesNumber;
	private String message;
	
	
	public Story( String ti, String nom, Integer pages) {
		
		title = ti;
		authorName = nom;
		pagesNumber = pages;
		
		
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public Integer getPagesNumber() {
		return pagesNumber;
	}
	
	public abstract void setPagesNumber(Integer pagesNumber);
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
