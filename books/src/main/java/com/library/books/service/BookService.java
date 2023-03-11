package com.library.books.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.books.data.Book;

@Service
public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {

        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "English"));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, "English"));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, "English"));
        books.add(new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998, "English"));
        books.add(new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999, "English"));

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public List<Book> getBooksByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();

        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                foundBooks.add(b);
            }
        }
        return foundBooks;
    }
    public Boolean deleteBook(String title) {
       
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                books.remove(b);
                return true;
            }
        }
        return false;
    }
    
}
