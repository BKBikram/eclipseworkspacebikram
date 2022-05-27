package com.SpringBootBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBookApplication {
	

	public static void main(String[] args) {
		ConfigurableApplicationContext  con=SpringApplication.run(SpringBootBookApplication.class, args);
		BookService bookservice=con.getBean(BookService.class);
		//Book book=new Book(13,"Compiler Design",380);
		Book book=new Book("Sanskrit",100);
		
		bookservice.addBook(book);
		
		
	}

}
