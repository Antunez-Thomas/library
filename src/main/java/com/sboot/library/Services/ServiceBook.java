package com.sboot.library.Services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBook {

    public String searchBook(String title) {
        if ("El quijote".equalsIgnoreCase(title)) {
            return "Book Found on the library";
        } else {
            return "Title book not found";
        }
    }


}
