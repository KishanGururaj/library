package com.wolken.wolkenapp.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wolken.wolkenapp.DTO.BooksDTO;

public class BooksDAOImpl implements BooksDAO {
	List<BooksDTO> collection =new ArrayList<BooksDTO>();
	

	@Override
	public void  save(BooksDTO booksDTO) {
		// TODO Auto-generated method stub
		collection.add(booksDTO);
		
	}

	@Override
	public void  getAllBooks() {
		// TODO Auto-generated method stub
		Iterator itr= collection.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println((BooksDTO) obj); 
		}
	}

}
