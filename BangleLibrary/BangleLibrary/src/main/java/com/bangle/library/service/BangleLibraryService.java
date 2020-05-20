package com.bangle.library.service;

import java.util.ArrayList;
import java.util.Map;

public interface BangleLibraryService {
	
	public Map<Object, String> getBookList(Object o); 
	public boolean insertBookList(Object o); 
	public boolean updateBook(Object o); 
	public boolean deleteBook(Object o); 
	
	

}
