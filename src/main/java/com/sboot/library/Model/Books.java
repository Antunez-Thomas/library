package com.sboot.library.Model;

import java.time.LocalDate;

public class Books {
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
}
