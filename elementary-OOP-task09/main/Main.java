package by.htp.task9.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task9.entity.Book;
import by.htp.task9.entity.BookArr;
import by.htp.task9.logic.BookArrLogic;
import by.htp.task9.view.ViewBooks;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book(1, "Author1", "Publishing1", 2019, 148, 2.99, "hard");
		Book book2 = new Book(2, "Author2", "Publishing2", 2016, 95, 0.99, "soft");
		Book book3 = new Book(3, "Author3", "Publishing1", 2017, 256, 5.49, "hard");
		Book book4 = new Book(4, "Author4", "Publishing3", 2019, 33, 2.19, "hard");
		Book book5 = new Book(5, "Author1", "Publishing1", 2018, 121, 1.79, "hard");
		
		BookArr books = new BookArr();
		books.getBooks().add(book1);
		books.getBooks().add(book2);
		books.getBooks().add(book3);
		books.getBooks().add(book4);
		books.getBooks().add(book5);
		
		ViewBooks viewBooks = new ViewBooks();
		viewBooks.viewBooks(books.getBooks());
		
		// Поиск по автору
		BookArrLogic logic = new BookArrLogic();
		String author = viewBooks.enterAuthor();
		List<Book> searchAuthor = logic.searchAuthor(books.getBooks(), author);
		viewBooks.viewBooksSearch(searchAuthor);
		
		// Поиск по издательству
		String publishing = viewBooks.enterPublishing();
		List<Book> searchPublishing = logic.searchPublishing(books.getBooks(), publishing);
		viewBooks.viewBooksSearch(searchPublishing);
		
		// Поиск по дате публикации
		int minDate = logic.minDate(books.getBooks());
		int publicationDate = viewBooks.enterPublicationDate(books.getBooks(), minDate);
		List<Book> searchPublicationDate = logic.searchPublicationDate(books.getBooks(), publicationDate);
		viewBooks.viewBooksSearch(searchPublicationDate);

	}

}
