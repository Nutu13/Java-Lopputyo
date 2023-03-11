package com.library.books.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.books.data.Book;
import com.library.books.service.BookService;

import java.util.List;

@RestController
public class BookRestController {

    BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/book")
    public String addBook(@RequestBody Book book) {
        try {
            bookService.addBook(book);
            return "Book added";
        } catch (Exception e) {
            return "Book not added";
        }
    }

    @GetMapping("/books/{title}")
    public List<Book> getBookByTitle(@PathVariable String title) {
        try {
            return bookService.getBooksByTitle(title);
        } catch (Exception e) {
            return null;
        }

    }

    @DeleteMapping("/delBook")
    public String deleteBook(@RequestBody Book book) {
        try {
            bookService.deleteBook(book.getTitle());
            return "Book deleted";
        } catch (Exception e) {
            return "Book not deleted";
        }

    }
}
