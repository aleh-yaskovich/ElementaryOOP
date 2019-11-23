package by.htp.task9.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import by.htp.task9.entity.Book;

public class ViewBooks {
	
	public void viewBooks (List<Book> books) {
		for (int i = 0; i < books.size(); i++) {
			System.out.println("Книга ID: "+books.get(i).getId());
			System.out.println("Автор: "+books.get(i).getAuthor());
			System.out.println("Издательство: "+books.get(i).getPublishing()+", Дата издания: "+books.get(i).getPublicationDate());
			System.out.println("Количество страниц: "+books.get(i).getNumberOfPages());
			System.out.println("Цена: "+books.get(i).getPrice());
			System.out.println("Переплет: "+books.get(i).getBindingType()+"\n");
		}
	}
	
	public void viewBooksSearch (List<Book> arr) {
		if (arr.size() > 0) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println("Книга ID: "+arr.get(i).getId());
				System.out.println("Автор: "+arr.get(i).getAuthor());
				System.out.println("Издательство: "+arr.get(i).getPublishing()+", Дата издания: "+arr.get(i).getPublicationDate());
				System.out.println("Количество страниц: "+arr.get(i).getNumberOfPages());
				System.out.println("Цена: "+arr.get(i).getPrice());
				System.out.println("Переплет: "+arr.get(i).getBindingType()+"\n");
			}
		} else {
			System.out.println("Книг нет!");
		}
	}
	
	public String enterAuthor() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя автора книги: ");
        String author = sc.next();
        return author;
	}
	
	public String enterPublishing() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите название издательства: ");
        String publishing = sc.next();
        return publishing;
	}
	
	public int enterPublicationDate(List<Book> books, int min) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите дату публикации от "+min+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите дату публикации от "+min+": ");
        }
        int publicationDate = sc.nextInt();
        while (publicationDate < min) {
        	System.out.print("Введите дату публикации от "+min+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите дату публикации от "+min+": ");
            }
            publicationDate = sc.nextInt();
        }
        return publicationDate;
	}
	
}
