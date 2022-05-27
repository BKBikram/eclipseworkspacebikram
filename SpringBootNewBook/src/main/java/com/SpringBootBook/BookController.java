package com.SpringBootBook;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return bookservice.addBook(book);
	}
	@GetMapping("/book/{bookid}")
	public Optional<Book> getById(@PathVariable("bookid") int bid) {
		return bookservice.getBookById(bid);
	}
	@GetMapping("/allbooks")
	public Iterable<Book> getAllBooks(){
		return bookservice.getAllBooks();
	}
	@DeleteMapping("/book/{bookid}")
	public void deleteBook(@PathVariable("bookid") int bid) {
		bookservice.deleteBook(bid);
	}
	@PutMapping("/updatebook/{bookid}/{bookname}")
	public Book updateBook(@PathVariable("bookid")int bid,@PathVariable("bookname")String newbname) {
		return bookservice.updateBook(bid,newbname);
	}
	
	
	
	
//	@GetMapping("/book")
//	public Book getBook()
//	{
//		return new Book(2,"Java",375);
//	}
//	
//	@GetMapping("/books")
//	public List<Book> getAllBooks(){
//		List<Book> lb=new ArrayList<>();
//		lb.add(new Book(3,"python",250));
//		lb.add(new Book(4,"c++",410));
//		lb.add(new Book(5,"c",150));
//		
//		return lb;
//	}
//	public BookController(BookService bookservice)
//	{
//		this.bookservice=bookservice;
//	}
	

}
