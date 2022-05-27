package com.practice8.controller;

import javax.validation.Valid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice8.dto.EmployeeDto;
import com.practice8.dto.ServiceResponse;
import com.practice8.exception.EmployeeCreateException;
import com.practice8.exception.EmployeeNotFoundException;
import com.practice8.exception.EmployeeUpdateException;
import com.practice8.service.EmployeeService;

@RestController
@RequestMapping("/practice8")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<ServiceResponse> addNewEmployee(@Valid@RequestBody EmployeeDto dto) throws EmployeeCreateException{
		return new ResponseEntity<ServiceResponse>(service.addNewEmployee(dto),new HttpHeaders(),HttpStatus.OK);
	}
	@GetMapping("/getEmployees")
	public ResponseEntity<JSONArray> getAllEmployees(@RequestBody String searchParam) throws EmployeeNotFoundException{
		return new ResponseEntity<JSONArray>(service.getAllEmployees(searchParam),new HttpHeaders(),HttpStatus.OK);
	}
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<JSONObject> getEmployee(@PathVariable("id")Long id) throws EmployeeNotFoundException{
		return new ResponseEntity<JSONObject>(service.getEmployee(id),new HttpHeaders(),HttpStatus.OK);
	}
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<ServiceResponse> updateEmployee(@PathVariable("id")Long id,@Valid@RequestBody EmployeeDto dto) throws EmployeeUpdateException{
		return new ResponseEntity<ServiceResponse>(service.updateEmployee(id,dto),new HttpHeaders(),HttpStatus.OK);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<ServiceResponse> deleteEmployee(@PathVariable("id")Long id) throws EmployeeNotFoundException{
		return new ResponseEntity<ServiceResponse>(service.deleteEmployee(id),new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/findByAgeBetween/{age1}/{age2}")
	public ResponseEntity<JSONArray> findByAgeBetween(@PathVariable("age1")Long age,@PathVariable("age2")Long age1) throws EmployeeNotFoundException{
		return new ResponseEntity<JSONArray>(service.findByAgeBetween(age,age1),new HttpHeaders(),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteByfirstName/{firstName}")
	public ResponseEntity<ServiceResponse> deleteByfirstName(@PathVariable("firstName")String firstName) throws EmployeeNotFoundException{
		return new ResponseEntity<ServiceResponse>(service.deleteByfirstName(firstName),new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/getIn")
	public ResponseEntity<JSONArray> findAllINAscen() throws EmployeeNotFoundException{
		return new ResponseEntity<JSONArray>(service.findAllINAscen(),new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/getAgeIn/{age}/{age1}")
	public ResponseEntity<JSONArray> findAllAgeIn(@PathVariable("age")Long age,@PathVariable("age1")Long age1) throws EmployeeNotFoundException{
		return new ResponseEntity<JSONArray>(service.findAllAgeIn(age,age1),new HttpHeaders(),HttpStatus.OK);
	}
	
	

}
