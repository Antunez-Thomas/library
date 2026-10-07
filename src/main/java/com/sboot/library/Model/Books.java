package com.sboot.library.Model;

import java.time.LocalDate;

public class Books implements Cloneable{
    private long idBook;
    private String author;
    private String title;
    private LocalDate releaseDate;

    public Books(long idBook, String author, String title, LocalDate releaseDate){
        this.idBook = idBook;
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public long getIdBook() {
        return idBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public Books clone() {
        try {
            return (Books) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    @Override
    public String toString() {
        return "Books: {" +
                " Id = " + idBook +
                ", title = " + title + '\'' +
                ", author = " + author + '\'' +
                '}';
    }

    public void setId(int idBook) {
        this.idBook = idBook;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void remove(Books existing) {

    }
}
