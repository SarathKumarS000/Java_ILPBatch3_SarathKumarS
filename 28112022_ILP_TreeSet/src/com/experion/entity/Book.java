package com.experion.entity;

public class Book{
	public String title;

	public String getTitle() {
		return title;
	}
//
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book(String title) {
		super();
		this.title = title;
	}
	
}
	

