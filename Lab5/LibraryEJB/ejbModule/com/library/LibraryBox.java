package com.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;

/**
 * Session Bean implementation class LibraryBox
 */
@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class LibraryBox {
	private Map<String, String> books;
    /**
     * Default constructor. 
     */
    public LibraryBox() {
    }
    
    @PostConstruct
    public void setupLibrary() {
    	books = new HashMap<>();
    	books.put("AA", "Dostepna");
    	books.put("BB", "Dostepna");
    	books.put("CC", "Dostepna");
    	books.put("DD", "Dostepna");
    	books.put("EE", "Dostepna");
    	System.out.println("Utworzono biblioteke");
    }
    

    public Map<String, String> getBooks(){
    	return books;
    }
    public String getBookStatus(String book) {
    	return books.get(book);
    }

	public List<String> getAbleBooks() {
		List<String> listOfBooks = new ArrayList<>();
		for(Map.Entry<String, String> entry : books.entrySet() ) {
			 if(entry.getValue().equals("Dostepna")) {
				 listOfBooks.add(entry.getKey());
			 }
		}
		return listOfBooks;
	}
	

	public void borrowBook(String book) {
		books.put(book, "Wypozyczona");
	}
	
	public void returnBook(String book) {
		books.put(book, "Dostepna");
	}

	public void setBooks(Map<String, String> books) {
		this.books = books;
	}

}
