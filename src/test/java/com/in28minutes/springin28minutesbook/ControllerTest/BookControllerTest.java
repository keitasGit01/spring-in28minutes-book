package com.in28minutes.springin28minutesbook.ControllerTest;


import com.in28minutes.springin28minutesbook.BookController.BookController;
import com.in28minutes.springin28minutesbook.BookModel.Books;
import com.in28minutes.springin28minutesbook.BookRepository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookControllerTest {

    @InjectMocks
    private BookController controller;


    @Mock
    private BookRepository repository;



    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);

    }


    @Test
    public void saveBooksTest(){
        Books books = new Books(1, "keita", "Reading book", 2002);
        Mockito.when(repository.save(books)).thenReturn(books);
        assertEquals(books, controller.saveBook(books));
    }
}
