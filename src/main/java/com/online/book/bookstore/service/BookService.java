package com.online.book.bookstore.service;

import com.online.book.bookstore.model.Book;
import com.online.book.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }


    public List<Book> getBooks(){
        return bookRepository.findAll();
    }


}
