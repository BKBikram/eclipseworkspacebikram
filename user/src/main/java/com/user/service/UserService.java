package com.user.service;

import java.util.List;

import javax.validation.Valid;

import com.user.dto.UserDto;


public interface UserService {

	UserDto getById(long id);

	List<UserDto> getAllUsers();

	String addNewUser(UserDto userdto);

	String updateUserById(Long id, @Valid UserDto dto);

	String deleteUserById(Long id);

	List<UserDto> findUserByLastName(String lastName);

	List<UserDto> findByUserAge(Long age);

	List<UserDto> findByFirstNameAndLastName(String firstName, String lastName);

	List<UserDto> findUserByAgeLessThan(Long age);

	List<UserDto> findUseByAgeGreaterThanEqual(Long age);

	List<UserDto> findUserByAge(Long age);

	List<UserDto> findUserByAgeOrFirstname(Long age, String firstName);

	List<UserDto> findAll();

	List<UserDto> findUserOrderBy();

	List<UserDto> findByFirstname(String firstName);

	

}
