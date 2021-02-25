package com.example.mongodb.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.Books;


public interface BooksRepository extends MongoRepository<Books, Integer> {

}
