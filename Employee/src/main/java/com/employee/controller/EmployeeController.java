package com.employee.controller;

import javax.validation.Valid;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDto;
import com.employee.dto.ServiceResponse;
import com.employee.service.EmployeeService;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<ServiceResponse> addNewEmployee(@Valid@RequestBody EmployeeDto dto) {
		return new ResponseEntity<ServiceResponse>(employeeService.addNewEmployee(dto),new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<JSONArray> getAllEmployees(){
		return new ResponseEntity<> (employeeService.getAllEmployees(),new HttpHeaders(),HttpStatus.OK);
	}
	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<JSONObject> getEmployeeById(@PathVariable("id")Long employeeId) {
		return new ResponseEntity<>(employeeService.getEmployeeById(employeeId),new HttpHeaders(),HttpStatus.OK);
	}
	@PutMapping("/updateById/{id}")
	public ResponseEntity<ServiceResponse> updateEmployeeById(@PathVariable("id")Long employeeId,@Valid EmployeeDto dto){
		return new ResponseEntity<> (employeeService.updateEmployeeById(employeeId,dto),new HttpHeaders(),HttpStatus.OK);
	}
}
