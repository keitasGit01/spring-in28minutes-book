package com.in28minutes.springin28minutesbook.BookRepository;

import com.in28minutes.springin28minutesbook.BookModel.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Long> {
}
