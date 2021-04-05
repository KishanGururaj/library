package com.wolken.wolkenapp.DAO;

import com.wolken.wolkenapp.DTO.BooksDTO;

public interface  BooksDAO {
	
	public void save(BooksDTO booksDTO);
	public void  getAllBooks();

}
