package com.NSpro.springJwt.repository;

import com.NSpro.springJwt.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Integer> {
        Book findByTitle(String title);
        Optional<Book> findById(Integer id);

}
