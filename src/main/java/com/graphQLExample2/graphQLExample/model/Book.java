package com.graphQLExample2.graphQLExample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
public class Book {

	@Id 
    @GraphQLQuery(name = "id", description = "A Book's id")
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

	@GraphQLQuery(name = "name", description = "A Book's name")
	
	private String name;
}
