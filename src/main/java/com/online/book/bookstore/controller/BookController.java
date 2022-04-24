package com.online.book.bookstore.controller;


import com.online.book.bookstore.model.Book;
import com.online.book.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        Book savedBook = bookService.saveBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);

    }


    @RequestMapping(value = "/books", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Book> getAllBooks() {
        return this.bookService.getBooks();
    }



    @GetMapping("/health")
    public ResponseEntity<?> health() {
        return new ResponseEntity<>("HEALTH CHECK OK",HttpStatus.OK);
    }




}
