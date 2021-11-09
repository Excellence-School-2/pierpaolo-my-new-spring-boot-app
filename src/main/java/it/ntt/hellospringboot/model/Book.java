package it.ntt.hellospringboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(){};
    
    public Book (String title, String isbn){
        this.title = title;
        this.isbn = isbn;

    }
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Author getAuthor(){
        return this.author;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getIsbn(){
        return this.isbn;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
}