package com.SpringBootBook;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Book, Integer> {
	
      
	
}
