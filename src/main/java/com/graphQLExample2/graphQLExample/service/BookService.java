package com.graphQLExample2.graphQLExample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.graphQLExample2.graphQLExample.model.Book;
import com.graphQLExample2.graphQLExample.repository.BookRepository;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class BookService {

	private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GraphQLQuery(name = "books") // READ ALL
    public List<Book> getFoods() {
        return bookRepository.findAll();
    }

    @GraphQLQuery(name = "book") // READ BY ID
    public Optional<Book> getFoodById(@GraphQLArgument(name = "id") int id) {
        return bookRepository.findById(id);
    }

    @GraphQLMutation(name = "saveBook") // CREATE
    public Book saveFood(@GraphQLArgument(name = "book") Book book) {
        return bookRepository.save(book);
    }

    @GraphQLMutation(name = "deleteBook") // DELETE
    public void deleteFood(@GraphQLArgument(name = "id") int id) {
    	bookRepository.deleteById(id);
    }
	
}
