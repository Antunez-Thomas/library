package com.sboot.library.RepositoryBooks;

import com.sboot.library.Model.Books;
import java.util.List;
import java.util.Optional;

public interface I_RepositoryBooks {
    List<Books> findAll();
    Optional<Books> findById(long id);
    void saveBook(Books book);
    void deleteById(long id);
}
