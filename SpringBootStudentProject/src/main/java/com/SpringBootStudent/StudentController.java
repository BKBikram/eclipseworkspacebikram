package com.SpringBootStudent;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class StudentController {
	StudentRepo sp;
	@Autowired

	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student(1,"Bikram",24,"Bhadrak");

	}
	@GetMapping("/allstudents")
	public List<Student> getAllStudent() {
		List<Student> students=new ArrayList<>();
		students.add(new Student(1,"Bikram",24,"Bhadrak"));
		students.add(new Student(2,"Biplab",25,"Kendrapara"));
		students.add(new Student(3,"Chitta",22,"Jagatsinghpur"));
		return students;
	}
//	@GetMapping("/student/{sid}")
//	public Student getStudentById(@PathVariable("sid") int sid) 
//	{   
//		
//	}

}
