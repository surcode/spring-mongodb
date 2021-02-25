package com.example.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString

@Document(collection = "Books")
public class Books {

	@Id
	@Getter
	@Setter
	private int id;
	@Getter
	@Setter
	private String bookName;
	@Getter
	@Setter
	private String author;
}
