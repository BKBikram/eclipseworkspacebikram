package com.employee.service;

import javax.validation.Valid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.employee.dto.EmployeeDto;
import com.employee.dto.ServiceResponse;

public interface EmployeeService {


	JSONArray getAllEmployees();

	ServiceResponse addNewEmployee(@Valid EmployeeDto dto);

	JSONObject getEmployeeById(Long employeeId);

	ServiceResponse updateEmployeeById(Long employeeId,@Valid EmployeeDto dto);

}
