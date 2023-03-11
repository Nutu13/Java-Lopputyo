package com.library.books.data;

public class Book {
  
    private String title;
    private String author;
    private Integer year;
    private String language;

    public Book(String title, String author, Integer year, String language) {
       
        this.title = title;
        this.author = author;
        this.year = year;
        this.language = language;

    }

   
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
