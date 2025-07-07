package com.bscoutinho.bookstore.repository;

import com.bscoutinho.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
