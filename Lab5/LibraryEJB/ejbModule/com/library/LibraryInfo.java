package com.library;

import javax.ejb.Remote;

@Remote
public interface LibraryInfo {
	public String printBookList();
}
