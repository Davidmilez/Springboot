package com.example.SpringBootApp.controllers;


import com.example.SpringBootApp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping
    public String findall(Model model){
        model.addAttribute("books", bookService.getAllBooks() );
        return "all";
    }
}
