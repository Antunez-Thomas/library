package com.sboot.library.RepositoryBooks;

import com.sboot.library.Model.Books;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositoryBooks {
    private final List<Books> books = new ArrayList<>();

    public RepositoryBooks(){
        books.add(new Books(1L,"Miguel de Cervantes", "El Quijote", LocalDate.of(1605, 1, 16)));
        books.add(new Books(2L, "Gabriel García Márquez", "Cien Años de Soledad", LocalDate.of(1967, 5, 30)));
        books.add(new Books(3L, "J.K. Rowling", "Harry Potter y la Piedra Filosofal", LocalDate.of(1997, 6, 26)));
        books.add(new Books(4L, "George Orwell", "1984", LocalDate.of(1949, 6, 8)));
        books.add(new Books(5L, "F. Scott Fitzgerald", "El Gran Gatsby", LocalDate.of(1925, 4, 10)));
    }

    public List<Books>findAll(){
        return books;
    }

    public Optional<Books>findId(long idBooks){
        return books.stream()
                .filter(books1 -> books1.getIdBook()==idBooks)
                .findFirst();

    }
}
