package com.wolken.wolkenapp;

import com.wolken.wolkenapp.DAO.BooksDAO;
import com.wolken.wolkenapp.DAO.BooksDAOImpl;
import com.wolken.wolkenapp.DTO.BooksDTO;

public class BooksDAOUtil {
	public static void main(String[] args) {
		BooksDTO books=new BooksDTO("sajgh "," askfg",65,"MHDF ",987," SAJDH","SQJHD");
		BooksDAO booksDAO= new BooksDAOImpl();
		booksDAO.save(books);
		booksDAO.getAllBooks();
		
	}

}
