package com.wolken.wolkenapp.library;
import  com.wolken.wolkenapp.library.Library;
import java.util.Scanner;


import com.wolken.wolkenapp.DTO.BooksDTO;

public class LibraryUtil {
	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner scanner= new Scanner(System.in);
		int size =scanner.nextInt();
		Library library= new  Library(size);
		for (int i=0;i<size;i++) {
			BooksDTO booksDTO=new BooksDTO();
			
			System.out.println("enter the bookID");
			booksDTO.setBookId(scanner.nextInt());
			System.out.println("enter the bookName ");
			booksDTO.setBookName(scanner.next());
			System.out.println("enter the author");
			 booksDTO.setAuthor(scanner.next());
			System.out.println("enter the type");
			booksDTO.setType(scanner.next());
			System.out.println("enter the edition");
			booksDTO.setEdition(scanner.next());
			System.out.println("enter the publisher");
			booksDTO.setPublisher(scanner.next());
			System.out.println("enter the price");
			booksDTO.setPrice(scanner.nextInt());
			library.addBooks(booksDTO);
		}
		library.getDetails();
		BooksDTO booksDTO=library.getBookByAuthor("RK");
		System.out.println(booksDTO);
		library.updatePricebyName("abc", 1000);
		library.deleteBookByBookId(1234);
		
	}

}
