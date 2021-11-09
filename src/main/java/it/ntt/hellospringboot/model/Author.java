package it.ntt.hellospringboot.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    private String name ; 
    private String surname;

    @OneToMany(mappedBy = "author")
    private Set<Book> bookSet = new HashSet<>();

   
    public Author(){};
    public Author (String name, String surname){
        this.name = name;
        this.surname = surname;

    }
   
    public Long getId(){
        return this.id;
    }

    public Set<Book> getBookSet(){
        return this.bookSet;
    }
    public void setId(Long id){
        this.id = id;
    }

    public void setBookSet(Set<Book> bookSet){
        this.bookSet = bookSet;

    }

    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
}
