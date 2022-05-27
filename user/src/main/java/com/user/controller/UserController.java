package com.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserDto;
import com.user.service.UserService;

@RestController
@RequestMapping("/userdatabase")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@GetMapping("user/{userid}")
	public UserDto getById(@PathVariable("userid") long id) {
		return userservice.getById(id);
	}
	
	@GetMapping("/allusers")
	public List<UserDto> getAllUsers() {
		return userservice.getAllUsers();
	}
	
	@PostMapping("/adduser")
	public String addNewUser(@Valid @RequestBody UserDto userdto) {
		
		return userservice.addNewUser(userdto);
	}
	@PutMapping("/user/{userid}")
	public String updateUserById(@PathVariable("userid")Long id,@Valid@RequestBody UserDto dto)
	{
		return userservice.updateUserById(id,dto);
		
	}
	@DeleteMapping("/user/{userid}")
	public String deleteUserById(@PathVariable("userid")Long id) {
		return userservice.deleteUserById(id);
		
	}
	
	@GetMapping("/user/lastname/{lastname}")
	public List<UserDto> findUserByLastName(@PathVariable("lastname")String lastName) {
		return userservice.findUserByLastName(lastName);
	}
	
	@GetMapping("/userage/{userAge}")
	public List<UserDto> findByUserAge(@PathVariable("userAge")Long age) {
		return userservice.findByUserAge(age);
	}
	
	@GetMapping("userby/{firstName}/{lastName}")
	public List<UserDto> findByFirstNameAndLastName(@PathVariable("firstName")String firstName,
			@PathVariable("lastName")String lastName){
		return userservice.findByFirstNameAndLastName(firstName,lastName);
	}
	
	@GetMapping("agelessthan/{userAge}")
	public List<UserDto> findUserByAgeLessThan(@PathVariable("userAge")Long age){
		return userservice.findUserByAgeLessThan(age);
	}
	
	@GetMapping("/agegreaterthan/{userAge}")
	public List<UserDto> findUserByAgeGreaterThanEqual(@PathVariable("userAge")Long age){
		return userservice.findUseByAgeGreaterThanEqual(age);
	}
	//Using Query
	@GetMapping("/userbyage/{userAge}")
	public List<UserDto> findUserByAge(@PathVariable("userAge")Long age) {
		return userservice.findUserByAge(age);
	}
	@GetMapping("/ageOrFirstname/{age}/{Firstname}")
	public List<UserDto> findUserByAgeOrFirstname(@PathVariable("age")Long age,
			@PathVariable("Firstname")String firstName){
		return userservice.findUserByAgeOrFirstname(age,firstName);
	}

	//Using native Query
	@GetMapping("/findall")
	public List<UserDto> findAll(){
		return userservice.findAll();
	}
	
	@GetMapping("/findAllUserInAscendingOrder")
	public List<UserDto> findUserOrderBy(){
		return userservice.findUserOrderBy();
		
	}
	
	@GetMapping("/findByFirstname/{firstname}")
	public List<UserDto> findByFirstname(@PathVariable("firstname")String firstName){
		return userservice.findByFirstname(firstName);
	}

}
