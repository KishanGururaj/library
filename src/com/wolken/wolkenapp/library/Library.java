package com.wolken.wolkenapp.library;

import com.wolken.wolkenapp.DTO.BooksDTO;

public class Library {
	int index;
	public BooksDTO[] booksDTO;

	public Library(int size) {
		booksDTO = new BooksDTO[size];

	}

	public void addBooks(BooksDTO booksDTO) {
		if (booksDTO != null) {
			System.out.println("books added to library");
			this.booksDTO[index++] = booksDTO;

		} else {
			System.out.println("books can't be added ");
		}
	}

	public void getDetails() {
		for (int i = 0; i < booksDTO.length; i++) {
			System.out.println(booksDTO[i].getBookId() + " " + booksDTO[i].getBookName() + " " + booksDTO[i].getAuthor()
					+ " " + booksDTO[i].getEdition() + " " + booksDTO[i].getPrice() + " " + booksDTO[i].getType() + " "
					+ booksDTO[i].getPublisher());
		}

	}

	public BooksDTO getBookByAuthor(String author) {
		BooksDTO booksDTO = null;
		for (int i = 0; i < this.booksDTO.length; i++) {
			if (this.booksDTO[i].getAuthor().equals(author)) {
				booksDTO = this.booksDTO[i];

			}
		}
		return booksDTO;

	}

	public void updatePricebyName(String name, int price) {
		for (int i = 0; i < this.booksDTO.length; i++) {
			if (this.booksDTO[i]!=null) {
			if (booksDTO[i].getBookName().equalsIgnoreCase(name)) {
				this.booksDTO[i].setPrice(price);
			}
			}
			else {
				System.out.println("No books found");
			}
		}
		
	}

	public void deleteBookByBookId(int id) {

		for (int i = 0; i < this.booksDTO.length; i++) {
			if (booksDTO[i] != null) {
				if (booksDTO[i].getBookId() == id) {
					booksDTO[i] = null;
				}
			} else {
				System.out.println("no books found");
			}
			return;

		}
	}
}
