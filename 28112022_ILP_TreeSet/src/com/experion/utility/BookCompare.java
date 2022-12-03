package com.experion.utility;

import java.util.Comparator;
import java.util.TreeSet;

import com.experion.entity.Book;

public class BookCompare implements Comparator <Book>{

	public static void main(String[] args) {
		Book b1 = new Book("How Cats Works");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");
		BookCompare bCompare = new BookCompare();
		TreeSet<Book> tree = new TreeSet<Book>(bCompare);
		tree.add(new Book("How Cats work"));
		tree.add(new Book("Finding Emo"));
		tree.add(new Book("Remix your Body"));
		System.out.println(tree);
	}
	public int compare(Book one, Book two) {
		return(one.title.compareTo(two.title));
	}

}
	
	
