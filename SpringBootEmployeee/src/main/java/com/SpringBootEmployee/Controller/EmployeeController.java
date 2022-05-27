package com.SpringBootEmployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootEmployee.Repo.EmployeeRepo;
import com.SpringBootEmployee.entities.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	
	
	@GetMapping({"/showEmployees","/list"})
	public ModelAndView showEmployees() {
		ModelAndView mav=new ModelAndView("showEmployees");
		List<Employee> list=repo.findAll();
		mav.addObject("employee",list);
         System.out.println(mav);
		return mav;
		
	}
	@GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm() {
		ModelAndView mav=new ModelAndView("add-employee-form");
		Employee em=new Employee();
		mav.addObject("employee",em);
		return mav;
    }
	@PostMapping("/addEmployee")
	public Employee saveEmpl(@RequestBody Employee employee)
	{
		repo.save(employee);
		return employee;
	}
	@ResponseBody
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeee(@PathVariable ("id") int empid) {
		repo.deleteById(empid);
		return "Successfully Deleted";
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		repo.save(employee);
		return "redirect:/list";
	}
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam int empid) {
		ModelAndView mav=new ModelAndView("add-employee-form");
		Employee employee=repo.findById(empid).get();
		mav.addObject("employee",employee);
		return mav;
	}
	//@ResponseBody
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam int empid) {
		repo.deleteById(empid);
		return "redirect:/list";
	}
	
}
