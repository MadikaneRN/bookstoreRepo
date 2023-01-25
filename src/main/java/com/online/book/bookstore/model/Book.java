package com.online.book.bookstore.model;


import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //book title
    @Column(name="title")
    private String title;

    @Column(name ="isbn")
    private String isbn;

    @Column(name="quantity")
    private int quantity;

}
