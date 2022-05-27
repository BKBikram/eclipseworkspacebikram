package com.SpringBootBook;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class BookService {
	@Autowired
	private BookRepo bookrepo;
	public BookService(BookRepo bookrepo) {
		super();
		this.bookrepo = bookrepo;
	}

	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookrepo.save(book);
	}

	public Optional<Book> getBookById(int bid) {
		// TODO Auto-generated method stub
		return bookrepo.findById(bid);
	}

	public Iterable<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

	public void deleteBook(int bid) {
		bookrepo.deleteById(bid);
		
	}

	public Book updateBook(int bid, String newbname) {
		Optional<Book> book=bookrepo.findById(bid);
		Book bo=book.get();
		bo.setBname(newbname);
		bookrepo.save(bo);
		return bo;
	}
	

	
	

}
