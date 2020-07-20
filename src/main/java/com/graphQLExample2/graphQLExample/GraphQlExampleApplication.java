package com.graphQLExample2.graphQLExample;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.graphQLExample2.graphQLExample.model.Book;
import com.graphQLExample2.graphQLExample.service.BookService;

@SpringBootApplication
public class GraphQlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlExampleApplication.class, args);
	}

	@Bean
	ApplicationRunner init(BookService bookService) {
	    return args -> {
	        Stream.of("Hidden Work", "Great Potential", "Wings of fire", "My Struggle for an Education").forEach(name -> {
	            Book Book = new Book();
	            Book.setName(name);
	            bookService.saveFood(Book);
	        });
	        bookService.getFoods().forEach(System.out::println);
	    };
	}
}
