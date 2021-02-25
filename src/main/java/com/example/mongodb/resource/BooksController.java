package com.example.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.Books;
import com.example.mongodb.respository.BooksRepository;
import com.sun.el.stream.Optional;

@RestController
public class BooksController {

	@Autowired
	private BooksRepository repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Books book)
	{
	repository.save(book);
	return "Added book with id:"+book.getId();
	}
	
	@GetMapping("/findAllBooks")
	public List<Books> getBooks()
	{
		return repository.findAll();
	}
	@GetMapping("/findBook/{id}")
	public java.util.Optional<Books> getBook(@PathVariable int id)
	{
		return repository.findById(id);
	}
	@DeleteMapping("/deleteBook/{id}")
 public String deleteBook(@PathVariable int id)
 {
	 repository.deleteById(id);
	 return "book deleted with id:"+id;
 }
}
