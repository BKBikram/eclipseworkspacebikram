package com.user.service;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import com.user.dto.UserDto;
import com.user.entity.User;
import com.user.exception.ResourceNotFoundException;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepository repo;
	@Autowired
    MessageSource messageSource;
	@Override
	public UserDto getById(long id) {
		try {
			Optional<User> user = repo.findById(id);
			UserDto dto = new UserDto();
			User entity = user.get();
			dto.setId(entity.getId());
			dto.setFirstName(entity.getFirstName());
			dto.setLastName(entity.getLastName());
			dto.setEmail(entity.getEmail());
			dto.setAge(entity.getAge());
			logger.info("displayed the perticular id details successfully");
			return dto;
			
		} catch (Exception e) {
			logger.error("some error");
			throw new ResourceNotFoundException("given id of user is not found");
			
		}

	}

	@Override
	public List<UserDto> getAllUsers() {
		List<UserDto> responseDto = new ArrayList<UserDto>();
		try {
			List<User> users = repo.findAll();
			for (User user : users) {
				UserDto dto = new UserDto();
				dto.setId(user.getId());
				dto.setFirstName(user.getFirstName());
				dto.setLastName(user.getLastName());
				dto.setEmail(user.getEmail());
				dto.setAge(user.getAge());
				responseDto.add(dto);
			}
		} catch (Exception e) {

		}
		return responseDto;
	}

	@Override
	public String addNewUser(@Valid UserDto userdto) {
		try {
			User user = new User();
			user.setFirstName(userdto.getFirstName());
			user.setLastName(userdto.getLastName());
			user.setEmail(userdto.getEmail());
			user.setAge(userdto.getAge());
			repo.save(user);
			return messageSource.getMessage("msg001", new Object[] {user.getId()},LocaleContextHolder.getLocale());
		}

		catch (Exception e) {
			throw new ResourceNotFoundException("Some error occured while adding new user");
		}
	}

	@Override
	public String updateUserById(Long id, @Valid UserDto dto) {
		try {
			Optional<User> user = repo.findById(id);
			if (user.isPresent()) {
				User updateduser = user.get();
				updateduser.setFirstName(dto.getFirstName());
				updateduser.setLastName(dto.getLastName());
				updateduser.setEmail(dto.getEmail());
				updateduser.setAge(dto.getAge());
				repo.save(updateduser);
				
				return messageSource.getMessage("msg002",new Object[] {id},LocaleContextHolder.getLocale());
			}
			return messageSource.getMessage("msg003", null,LocaleContextHolder.getLocale());
		} catch (Exception e) {
			return "internal server issue";
		}

	}

	@Override
	public String deleteUserById(Long id) {
		try {
			Optional<User> user = repo.findById(id);
			if (user.isPresent()) {
				repo.deleteById(id);
				return messageSource.getMessage("msg004", new Object[] {id},LocaleContextHolder.getLocale());
			}
			return messageSource.getMessage("msg005", null,LocaleContextHolder.getLocale());
		} catch (Exception e) {
			return "some error occured ";
		}

	}

	@Override
	public List<UserDto> findUserByLastName(String lastname) {

		List<UserDto> userdto = new ArrayList<UserDto>();
		try {
			List<User> entity = repo.findByLastName(lastname);
			for (User list : entity) {
				UserDto dto = new UserDto();
				dto.setId(list.getId());
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setAge(list.getAge());
				userdto.add(dto);
			}
			return userdto;
		} catch (Exception e) {
			throw new ResourceNotFoundException("some error occured");
		}
	}

	@Override
	public List<UserDto> findByUserAge(Long age) {
		List<UserDto> responselist = new ArrayList<UserDto>();
		try {
			List<User> user = repo.findByAge(age);
			for (User list : user) {
				UserDto dto = new UserDto();
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setId(list.getId());
				dto.setAge(list.getAge());
				responselist.add(dto);
			}
			return responselist;
		} catch (Exception e) {
			throw new ResourceNotFoundException("some error occured while fethching the details");

		}
	}

	@Override
	public List<UserDto> findByFirstNameAndLastName(String firstname, String lastname) {
		List<UserDto> responselist = new ArrayList<UserDto>();
		try {
			List<User> user = repo.findByFirstNameAndLastName(firstname, lastname);
			for (User list : user) {
				UserDto dto = new UserDto();
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setId(list.getId());
				dto.setAge(list.getAge());
				responselist.add(dto);
			}
		} catch (Exception e) {

		}

		return responselist;
	}

	@Override
	public List<UserDto> findUserByAgeLessThan(Long age) {
		List<UserDto> responseList = new ArrayList<UserDto>();
		try {
			List<User> user = repo.findByAgeLessThanEqual(age);
			for (User list : user) {
				UserDto dto = new UserDto();
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setId(list.getId());
				dto.setAge(list.getAge());
				responseList.add(dto);
			}
		} catch (Exception e) {

		}
		return responseList;
	}

	@Override
	public List<UserDto> findUseByAgeGreaterThanEqual(Long age) {
		List<UserDto> responseList = new ArrayList<UserDto>();
		try {
			List<User> user = repo.findByAgeGreaterThanEqual(age);
			for (User list : user) {
				UserDto dto = new UserDto();
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setId(list.getId());
				dto.setAge(list.getAge());
				responseList.add(dto);
			}
		} catch (Exception e) {

		}
		return responseList;
	}

	@Override
	public List<UserDto> findUserByAge(Long age) {
		List<UserDto> responselist = new ArrayList<UserDto>();
		try {
			List<User> user = repo.findUserByAge(age);
			for (User list : user) {
				UserDto dto = new UserDto();
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setId(list.getId());
				dto.setAge(list.getAge());
				responselist.add(dto);
			}
		} catch (Exception e) {

		}
		return responselist;
	}

	@Override
	public List<UserDto> findUserByAgeOrFirstname(Long age, String firstname) {
		List<UserDto> responselist = new ArrayList<UserDto>();
		try {
			List<User> user = repo.findUserByAgeOrFirstName(age, firstname);
			for (User list : user) {
				UserDto dto = new UserDto();
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setId(list.getId());
				dto.setAge(list.getAge());
				responselist.add(dto);
			}
		} catch (Exception e) {

		}
		return responselist;
	}

	@Override
	public List<UserDto> findAll() {
		List<User> users = repo.findAllUsers();
		List<UserDto> responseList = new ArrayList<UserDto>();
		for (User list : users) {
			UserDto dto = new UserDto();
			dto.setFirstName(list.getFirstName());
			dto.setLastName(list.getLastName());
			dto.setEmail(list.getEmail());
			dto.setId(list.getId());
			dto.setAge(list.getAge());
			responseList.add(dto);
		}
		return responseList;
	}

	@Override
	public List<UserDto> findUserOrderBy() {
		List<User> user = repo.findUserOrderBy();
		List<UserDto> responseList = new ArrayList<UserDto>();
		for (User list : user) {
			UserDto dto = new UserDto();
			dto.setFirstName(list.getFirstName());
			dto.setLastName(list.getLastName());
			dto.setEmail(list.getEmail());
			dto.setId(list.getId());
			dto.setAge(list.getAge());
			responseList.add(dto);
		}
		return responseList;
	}

	@Override
	public List<UserDto> findByFirstname(String firstname) {

		List<UserDto> responseList = new ArrayList<UserDto>();
		try {
			List<User> user = repo.findUserByFirstName(firstname);
			for (User list : user) {
				UserDto dto = new UserDto();
				dto.setFirstName(list.getFirstName());
				dto.setLastName(list.getLastName());
				dto.setEmail(list.getEmail());
				dto.setId(list.getId());
				dto.setAge(list.getAge());
				responseList.add(dto);
			}
		} catch (Exception e) {

		}
		return responseList;
	}

}
