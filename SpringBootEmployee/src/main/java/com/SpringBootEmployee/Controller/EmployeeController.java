package com.SpringBootEmployee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootEmployee.Entities.Employee;
import com.SpringBootEmployee.Repository.EmployeeRepo;

import java.util.*;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	@GetMapping("/showEmployees")
	public ModelAndView showEmployees() {
		ModelAndView mav=new ModelAndView("list-employees");
		List<Employee> list=repo.findAll();
		mav.addObject("employees",list);
		return mav;
		}
}
