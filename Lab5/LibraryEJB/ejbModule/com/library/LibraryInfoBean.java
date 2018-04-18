package com.library;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class LibraryInfoBean
 */
@Stateless
@LocalBean
public class LibraryInfoBean implements LibraryInfo {

    /**
     * Default constructor. 
     */
	
	@EJB LibraryBox library;
	
    public LibraryInfoBean() {
        // TODO Auto-generated constructor stub
    }
    
    
    public String printBookList() {
    	List<String> books = library.getAbleBooks();
    	return books.toString();
    }

}
