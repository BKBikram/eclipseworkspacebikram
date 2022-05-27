package com.employee.service;

import java.util.List;


import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dto.EmployeeDto;
import com.employee.dto.ServiceResponse;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private static final Logger logger=LogManager.getLogger(EmployeeServiceImpl.class);
	@Autowired
	private EmployeeRepository repo;

	@Override
	public ServiceResponse addNewEmployee(@Valid EmployeeDto dto) {
		Employee employee=new Employee();
		try {
			employee.setFirstName(dto.getFirstName());
			employee.setLastName(dto.getLastName());
			employee.setEmail(dto.getEmail());
			employee.setAge(dto.getAge());
			employee.setEmployeeId(dto.getEmployeeId());
			employee.setPhoneNo(dto.getPhoneNo());
			repo.save(employee);
			if(employee!=null) {
				return new ServiceResponse("SUCCESS","Employee added successfully",null);
			}
			else {
				return new ServiceResponse("FAILED", "Employee added failed", null);
			}
		}catch(Exception e) {
			
			logger.error(e.getMessage(),e);
			return new ServiceResponse("FAILED","Employee added failed exception", null);
		}
	}

	@Override
	public JSONArray getAllEmployees() {
		JSONArray jsonArray=new JSONArray();
		JSONObject jsonObject=null;
		try {
			List<Employee> employee=repo.findAll();
			for(Employee emp:employee) {
				jsonObject=new JSONObject();
				jsonObject.put("id", emp.getEmployeeId());
				jsonObject.put("firstName", emp.getFirstName());
				jsonObject.put("lastName", emp.getLastName());
				jsonObject.put("age", emp.getAge());
				jsonObject.put("email", emp.getEmail());
				jsonObject.put("phoneNo", emp.getPhoneNo());
				jsonArray.add(jsonObject);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jsonArray;
	}

	@Override
	public JSONObject getEmployeeById(Long employeeId) {
		JSONObject obj=new JSONObject();
		try {
			Optional<Employee> employee=repo.findById(employeeId);
			if(employee.isPresent()) {
				Employee emp=employee.get();
				obj.put("employeeId", emp.getEmployeeId());
				obj.put("firstName", emp.getFirstName());
				obj.put("lastName", emp.getLastName());
				obj.put("email", emp.getEmail());
				obj.put("age", emp.getAge());
				obj.put("phoneNo", emp.getPhoneNo());
			}
			else {
			}		
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage(),e);
		}
		return obj;
	}

	@Override
	public ServiceResponse updateEmployeeById(Long employeeId, @Valid EmployeeDto dto) {
		try {
			Optional<Employee> employee=repo.findById(employeeId);
			if(employee.isPresent()) {
				Employee emp=employee.get();
				emp.setFirstName(dto.getFirstName());
				emp.setLastName(dto.getLastName());
				emp.setAge(dto.getAge());
				emp.setEmail(dto.getEmail());
				emp.setPhoneNo(dto.getPhoneNo());
				repo.save(emp);
				return new ServiceResponse("SUCCESS","updation successfull",null);			
			}
			else {
				return new ServiceResponse("FAILED", "updation failed", null);
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			return new ServiceResponse("FAILED","updation failed exception", getAllEmployees());
		}
	
	}

	

	

	
	
}
