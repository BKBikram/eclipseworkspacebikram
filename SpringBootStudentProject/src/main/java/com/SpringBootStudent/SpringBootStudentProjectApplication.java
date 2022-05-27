package com.SpringBootStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class SpringBootStudentProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(SpringBootStudentProjectApplication.class, args);
	Student st=context.getBean(Student.class);
	
	
	}

}
