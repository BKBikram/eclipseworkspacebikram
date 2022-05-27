package com.student.controller;

import javax.validation.Valid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.ServiceResponse;
import com.student.dto.StudentDto;
import com.student.exception.RecordNotFoundException;
import com.student.service.StudentService;

@RequestMapping("/student")
@RestController
@CrossOrigin
public class StudentController {
	@Autowired
     private StudentService studentService;
	
	@PostMapping("/addStudent")
	public ResponseEntity<ServiceResponse> addStudent(@Valid@RequestBody StudentDto dto) {
		return new ResponseEntity<ServiceResponse> (studentService.addStudent(dto),new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<JSONArray> getAllStudents() throws NoSuchMessageException, RecordNotFoundException{
		return new ResponseEntity<>(studentService.getAllStudents(),new HttpHeaders(),
				HttpStatus.OK);
	}
	
	
	@GetMapping("/getStudent/{id}")
	public ResponseEntity<JSONObject> getStudentById(@PathVariable("id")Long id) {
		return new ResponseEntity<> (studentService.getStudentById(id),new HttpHeaders(),HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent/{id}")
	public String updateStudentById(@PathVariable("id")Long id,@Valid@RequestBody StudentDto dto) {
		return studentService.updateStudentById(id,dto);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<ServiceResponse> deleteStudentById(@PathVariable("id")Long id) {
	return new ResponseEntity<>(studentService.deleteStudentById(id),new HttpHeaders(),HttpStatus.OK);
	}
	

}
