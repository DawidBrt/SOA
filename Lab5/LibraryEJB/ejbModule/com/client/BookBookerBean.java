package com.client;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;

import com.library.LibraryBox;

/**
 * Session Bean implementation class BookBookerBean
 */
@Stateful
@LocalBean
public class BookBookerBean implements BookBooker {

	String yourBook;
    @EJB LibraryBox library;
    
    @PostConstruct
    public void createClient() {
    	this.yourBook="-1";
    	System.out.println(yourBook);
    }

	@Override
	public String borrowBook(String book) {
		if(yourBook.equals("-1")) {
			if(library.getBookStatus(book).equals("Dostepna")) {
				library.borrowBook(book);
				this.yourBook = book;
				return "Ksiazka wypozyczona";
			}
			else {
				return "Ksiazka jest niedostna w tej chwili";
			}
		}
		else {
			return "Zwroc poprzednia ksiazke";
		}
	}
	
	public String returnBook(String book) {
		if(library.getBookStatus(book).equals("Wypozyczona")) {
			library.returnBook(book);
			return "Ksiazka zwrocona";
		}
		else {
			return "Nie wypozyczales tej ksiazki";
		}
	}

}
