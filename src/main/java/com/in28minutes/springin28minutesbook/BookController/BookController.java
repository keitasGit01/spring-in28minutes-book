package com.in28minutes.springin28minutesbook.BookController;


import com.in28minutes.springin28minutesbook.BookModel.Books;
import com.in28minutes.springin28minutesbook.BookRepository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Books> getAllBook(){

        return bookRepository.findAll();
    }

    @GetMapping("/books/{id}")
    public Books getBook(@PathVariable long id){
        Optional<Books> getBookById = bookRepository.findById(id);
        if (!getBookById.isPresent()){
            throw new RuntimeException("This " + id + " doesnt exists");
        }else {
            return getBookById.get();
        }

    }

    @PostMapping("/books")
    public Books saveBook(@RequestBody Books books){
        Books save = bookRepository.save(books);
        return save;
    }


    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable long id){
        bookRepository.deleteById(id);
    }

}
