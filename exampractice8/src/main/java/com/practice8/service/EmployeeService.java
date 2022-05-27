package com.practice8.service;

import javax.validation.Valid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.practice8.dto.EmployeeDto;
import com.practice8.dto.ServiceResponse;
import com.practice8.exception.EmployeeCreateException;
import com.practice8.exception.EmployeeNotFoundException;
import com.practice8.exception.EmployeeUpdateException;

public interface EmployeeService {

	ServiceResponse addNewEmployee(@Valid EmployeeDto dto) throws EmployeeCreateException;

	JSONArray getAllEmployees(String name) throws EmployeeNotFoundException;

	JSONObject getEmployee(Long id) throws EmployeeNotFoundException;

	ServiceResponse updateEmployee(Long id, @Valid EmployeeDto dto) throws EmployeeUpdateException;

	ServiceResponse deleteEmployee(Long id) throws EmployeeNotFoundException;

	JSONArray findByAgeBetween(Long age, Long age1) throws EmployeeNotFoundException;

	ServiceResponse deleteByfirstName(String firstName) throws EmployeeNotFoundException;

	JSONArray findAllINAscen() throws EmployeeNotFoundException;

	JSONArray findAllAgeIn(Long age, Long age1) throws EmployeeNotFoundException;

	//ServiceResponse deleteByfirstName(String firstName) throws EmployeeNotFoundException;

}
