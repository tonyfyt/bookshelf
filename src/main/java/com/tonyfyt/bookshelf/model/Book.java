package com.tonyfyt.bookshelf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")

public class Book {
    private int id;
    private String authorln;
    private String authorfn;
    private String title;
    private int year;
    
    @Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorln() {
		return authorln;
	}
	public void setAuthorln(String authorln) {
		this.authorln = authorln;
	}
	public String getAuthorfn() {
		return authorfn;
	}
	public void setAuthorfn(String authorfn) {
		this.authorfn = authorfn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
 
    
 
}
