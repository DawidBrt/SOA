package com.client;

import javax.ejb.Remote;

@Remote
public interface BookBooker {
	public String borrowBook(String book);
	public String returnBook(String book);
}
