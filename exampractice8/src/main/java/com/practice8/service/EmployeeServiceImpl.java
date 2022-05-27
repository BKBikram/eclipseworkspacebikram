package com.practice8.service;

import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.practice8.dto.EmployeeDto;
import com.practice8.dto.ServiceResponse;
import com.practice8.entity.Employee;
import com.practice8.exception.EmployeeCreateException;
import com.practice8.exception.EmployeeNotFoundException;
import com.practice8.exception.EmployeeUpdateException;
import com.practice8.repository.EmployeeRepository;
import com.practice8.repository.specification.EmployeeSpecification;
import com.practice8.util.Constants;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private static final Logger logger=LogManager.getLogger(EmployeeServiceImpl.class);
	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private MessageSource messageSource;

	@Override
	public ServiceResponse addNewEmployee(@Valid EmployeeDto dto) throws EmployeeCreateException {
		Employee employee=new Employee();
		try {
			employee.setFirstName(dto.getFirstName());
			employee.setLastName(dto.getLastName());
			employee.setEmail(dto.getEmail());
			employee.setAge(dto.getAge());
			repo.save(employee);
			return new ServiceResponse(messageSource.getMessage("msg002",new Object[] {dto.getId()},LocaleContextHolder.getLocale()),Constants.MESSAGE_STATUS.SUCCESS,null);
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeCreateException(e.getMessage(), e.getCause());
		}
		
	}

	@Override
	public JSONArray getAllEmployees(String name) throws EmployeeNotFoundException {
		JSONArray json=new JSONArray();
		JSONObject obj=null;
		try {
		   List<Employee> employees=repo.findAll(EmployeeSpecification.getEmployee(name));
		   if(!employees.isEmpty()) {
			   for(Employee emp:employees) {
				   obj=new JSONObject();
				   obj.put("id", emp.getId());
				   obj.put("firstName", emp.getFirstName());
				   obj.put("lastName", emp.getLastName());
				   obj.put("email", emp.getEmail());
				   obj.put("age", emp.getAge());
				   json.add(obj);
			   }
			   return json;
		   }
		   else {
			   throw new EmployeeNotFoundException(messageSource.getMessage("msg004",null,LocaleContextHolder.getLocale()));
		   }
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		
	}

	@Override
	public JSONObject getEmployee(Long id) throws EmployeeNotFoundException {
		JSONObject obj=new JSONObject();
		try {
			Optional<Employee> employee=repo.findById(id);
			if(employee.isPresent()) {
				Employee emp=employee.get();
				obj.put("id", emp.getId());
				   obj.put("firstName", emp.getFirstName());
				   obj.put("lastName", emp.getLastName());
				   obj.put("email", emp.getEmail());
				   obj.put("age", emp.getAge());
				   return obj;
			}
			else {
				throw new EmployeeNotFoundException(messageSource.getMessage("msg003",new Object[] {id},LocaleContextHolder.getLocale()));
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		
	}

	@Override
	public ServiceResponse updateEmployee(Long id, @Valid EmployeeDto dto) throws EmployeeUpdateException {
		try {
			Optional<Employee> employee=repo.findById(id);
			if(employee.isPresent()) {
				Employee emp=employee.get();
				emp.setFirstName(dto.getFirstName());
				emp.setLastName(dto.getLastName());
				emp.setEmail(dto.getEmail());
				emp.setAge(dto.getAge());
				return new ServiceResponse(messageSource.getMessage("msg005",new Object[] {id},LocaleContextHolder.getLocale()),Constants.MESSAGE_STATUS.SUCCESS, null);
			}
			else {
				return new ServiceResponse(messageSource.getMessage("msg006",null,LocaleContextHolder.getLocale()),Constants.MESSAGE_STATUS.FAILED, null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeUpdateException(e.getMessage());
		}
	}

	@Override
	public ServiceResponse deleteEmployee(Long id) throws EmployeeNotFoundException {
		try {
			Optional<Employee> employee=repo.findById(id);
			if(employee.isPresent()) {
				repo.deleteById(id);
				return new ServiceResponse(messageSource.getMessage("msg007",new Object[] {id},LocaleContextHolder.getLocale()),Constants.MESSAGE_STATUS.SUCCESS, null);
			}
			else {
				return new ServiceResponse(messageSource.getMessage("msg008",new Object[] {id},LocaleContextHolder.getLocale()),Constants.MESSAGE_STATUS.NOTEXIST, null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
	}

	@Override
	public JSONArray findByAgeBetween(Long age, Long age1) throws EmployeeNotFoundException {
		JSONArray json=new JSONArray();
		JSONObject obj=null;
		try {
			List<Employee> employees=repo.findByAgeBetween(age, age1);
			if(!employees.isEmpty()) {
				for(Employee emp:employees) {
					obj=new JSONObject();
					obj.put("id", emp.getId());
					   obj.put("firstName", emp.getFirstName());
					   obj.put("lastName", emp.getLastName());
					   obj.put("email", emp.getEmail());
					   obj.put("age", emp.getAge());
					   json.add(obj);
					   }
				return json;
			}
			else {
				throw new EmployeeNotFoundException("Not found");
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		
	}

	@Override
	public ServiceResponse deleteByfirstName(String firstName) throws EmployeeNotFoundException {
		try {
			List<Employee> employee=repo.findByfirstName(firstName);
			if(!employee.isEmpty()) {
				for(Employee emp:employee) {
					repo.deleteByfirstName(firstName);
				}
				return new ServiceResponse(firstName,"deleted", null);
			}
			else {
				throw new EmployeeNotFoundException("not found");
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage(),e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		
	}

	@Override
	public JSONArray findAllINAscen() throws EmployeeNotFoundException {
		JSONArray json=new JSONArray();
		JSONObject obj=null;
		try {
			List<Employee> employees=repo.findByAllInAscendingOrder();
			if(!employees.isEmpty()) {
				for(Employee emp:employees) {
					obj=new JSONObject();
					obj.put("id", emp.getId());
					   obj.put("firstName", emp.getFirstName());
					   obj.put("lastName", emp.getLastName());
					   obj.put("email", emp.getEmail());
					   obj.put("age", emp.getAge());
					   json.add(obj);
					   }
				return json;
			}
			else {
				throw new EmployeeNotFoundException("Not found");
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		
		
	}

	@Override
	public JSONArray findAllAgeIn(Long age, Long age1) throws EmployeeNotFoundException {
		JSONArray json=new JSONArray();
		JSONObject obj=null;
		try {
			List<Employee> employees=repo.findAgeIn(age, age1);
			if(!employees.isEmpty()) {
				for(Employee emp:employees) {
					obj=new JSONObject();
					obj.put("id", emp.getId());
					   obj.put("firstName", emp.getFirstName());
					   obj.put("lastName", emp.getLastName());
					   obj.put("email", emp.getEmail());
					   obj.put("age", emp.getAge());
					   json.add(obj);
					   }
				return json;
			}
			else {
				throw new EmployeeNotFoundException("Not found");
			}
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new EmployeeNotFoundException(e.getMessage());
		}
		
		
	}

	

}
