package com.sboot.library.Services;

import com.sboot.library.Model.Books;
import com.sboot.library.RepositoryBooks.I_RepositoryBooks;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceBook implements I_ServiceBook {
    private final I_RepositoryBooks i_repo;

    public  ServiceBook(I_RepositoryBooks i_repo) {
        this.i_repo = i_repo;
    }

    @Override
    public List<Books>findAllBooks(){
        return i_repo.findAll();
    }
    @Override
    public Optional<Books> findById(long id) {
        return i_repo.findById(id);
    }
    @Override
    public Books save(Books books) {
        i_repo.saveBook(books);
        return books;
    }
    @Override
    public void deleteById(long id) {
        i_repo.deleteById(id);
    }
    @Override
    public String findBookByTitle(String title) {
        boolean find = i_repo.findAll().stream()
                .anyMatch(book -> book.getTitle()
                        != null && book.getTitle().equalsIgnoreCase(title));
        return find ? "Libro Encontrado" : "libro no encontrado";
    }
}
