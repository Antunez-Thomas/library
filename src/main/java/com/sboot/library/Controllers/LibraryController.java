package com.sboot.library.Controllers;

import com.sboot.library.Model.Books;
import com.sboot.library.RepositoryBooks.RepositoryBooks;
import com.sboot.library.Services.ServiceBook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class LibraryController {
    private final ServiceBook bookService;
    private final RepositoryBooks repositoryBooks;

    public LibraryController(ServiceBook bookService, RepositoryBooks repositoryBooks){
        this.bookService = bookService;
        this.repositoryBooks = repositoryBooks;
    }

    @GetMapping("/{title}")
    public String foundBook(@PathVariable String title) {
        return bookService.searchBook(title);
    }

    @GetMapping("/library")
    public List<Books> allbooks(){
        return  repositoryBooks.findAll();
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Books> findID(@PathVariable long id){
        return repositoryBooks.findId()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
