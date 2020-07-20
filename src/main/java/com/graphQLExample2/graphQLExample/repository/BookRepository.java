package com.graphQLExample2.graphQLExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphQLExample2.graphQLExample.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
