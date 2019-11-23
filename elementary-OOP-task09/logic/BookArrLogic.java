package by.htp.task9.logic;


import java.util.ArrayList;
import java.util.List;
import by.htp.task9.entity.Book;

public class BookArrLogic {
	
	public List<Book> searchAuthor(List<Book> books, String author) {
		List<Book> searchAuthor = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getAuthor().equals(author)) {
				searchAuthor.add(books.get(i));
			}
		}
		return searchAuthor;
	}
	
	public List<Book> searchPublishing(List<Book> books, String publishing) {
		List<Book> searchPublishing = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPublishing().equals(publishing)) {
				searchPublishing.add(books.get(i));
			}
		}
		return searchPublishing;
	}
	
	public int minDate(List<Book> books) {
		int minDate = books.get(0).getPublicationDate();
		for (int i = 0; i < books.size(); i++) {
			if (minDate > books.get(i).getPublicationDate()) {
				minDate = books.get(i).getPublicationDate();
			}
		}
		return minDate;
	}
	
	public List<Book> searchPublicationDate(List<Book> books, int publicationDate) {
		List<Book> searchPublicationDate = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPublicationDate() >= publicationDate) {
				searchPublicationDate.add(books.get(i));
			}
		}
		return searchPublicationDate;
	}
	
}
