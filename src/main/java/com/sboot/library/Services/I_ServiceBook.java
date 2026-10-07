package com.sboot.library.Services;

import com.sboot.library.Model.Books;

import java.util.List;
import java.util.Optional;

public interface I_ServiceBook {
    List<Books>findAllBooks();
    Optional<Books> findById(long id);
    Books save(Books books);
    void deleteById(long id);
    String findBookByTitle(String title);
}

