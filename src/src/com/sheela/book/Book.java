package com.sheela.book;

import java.sql.Date;
import java.time.LocalDate;

public class Book {
	private int id;
	private String name;
	private int price;
	private LocalDate published_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
		public LocalDate getPublished_date() {
		return published_date;
	}
	public void setPublished_date(LocalDate published_date) {
		this.published_date = published_date;
	}
		@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", published_date=" + published_date + "]";
	}
		
		
		
	 
		
	

}
