package it.ntt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import it.ntt.hellospringboot.repository.AuthorRepository;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;
    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository= authorRepository;
    }
    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("author_list", authorRepository.findAll());
        return "authors";

    }
}
