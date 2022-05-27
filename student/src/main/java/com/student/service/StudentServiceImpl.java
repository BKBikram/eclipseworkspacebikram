package com.student.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.student.dto.ServiceResponse;
import com.student.dto.StudentDto;
import com.student.entity.Students;
import com.student.exception.RecordNotFoundException;
import com.student.exception.ResourceNotFoundException;
import com.student.repository.StudentRepository;
import com.student.util.Constants;

@Service
public class StudentServiceImpl implements StudentService {
	private static final Logger logger = LogManager.getLogger(StudentServiceImpl.class);
	@Autowired
	private StudentRepository repo;
	@Autowired
	MessageSource messageSource;

	@Override
	public ServiceResponse addStudent(@Valid StudentDto dto) {
		Students student = new Students();
		try {
			student.setFirstName(dto.getFirstName());
			student.setLastName(dto.getLastName());
			student.setEmail(dto.getEmail());
			student.setAge(dto.getAge());
			student.setPhoneNo(dto.getPhoneNo());
			student.setDob(dto.getDob());
			student.setBookPrice(dto.getBookPrice());
			repo.save(student);
			if (student != null) {
				// return messageSource.getMessage("msg001",new Object[]
				// {dto.getId()},LocaleContextHolder.getLocale());
				return new ServiceResponse("{msg006}", "New Student Added Successfully", null);
			} else {
				return new ServiceResponse(Constants.MESSAGE_STATUS.FAILED, "Student added failed", null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ServiceResponse(Constants.MESSAGE_STATUS.FAILED, "Student added failed exception", null);
		}

	}

	@Override
	public JSONArray getAllStudents() throws NoSuchMessageException, RecordNotFoundException {
		JSONArray arrObj = new JSONArray();
		JSONObject obj = null;
		try {
			List<Students> students = repo.findAll();
			if (!students.isEmpty()) {
				for (Students stud : students) {
					obj = new JSONObject();
					obj.put("id", stud.getId());
					obj.put("firstName", stud.getFirstName());
					obj.put("lastName", stud.getLastName());
					obj.put("email", stud.getEmail());
					obj.put("age", stud.getAge());
					obj.put("phoneNo", stud.getPhoneNo());
					obj.put("dob", stud.getDob());
					obj.put("bookPrice", stud.getBookPrice());
					arrObj.add(obj);
				}
				return arrObj;
			}
			throw new RecordNotFoundException(messageSource.getMessage("students.notfound.message005", null,
					LocaleContextHolder.getLocale()));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RecordNotFoundException(messageSource.getMessage("students.notfound.message005", null,
					LocaleContextHolder.getLocale()));
		}
		
	}

	@Override
	public JSONObject getStudentById(Long id) {
		JSONObject obj =null;
		try {
			Optional<Students> student = repo.findById(id);
			// Students stud=student.get();
			if (student.isPresent()) {
				Students stud = student.get();
				obj = new JSONObject();
				obj.put("id", stud.getId());
				obj.put("firstName", stud.getFirstName());
				obj.put("lastName", stud.getLastName());
				obj.put("email", stud.getEmail());
				obj.put("age", stud.getAge());
				obj.put("phoneNo", stud.getPhoneNo());
				obj.put("dob", stud.getDob());
				obj.put("bookPrice", stud.getBookPrice());
				return obj;
				
			} else {
				throw new RecordNotFoundException(
						messageSource.getMessage("student.notfound.message006", null, LocaleContextHolder.getLocale()));
				
				
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return obj;
		

	}

	@Override
	public String updateStudentById(Long id, @Valid StudentDto dto) {
		try {
			Students student = repo.findById(id).get();
			if (student == null) {
				throw new ResourceNotFoundException("Student of given id is not found");
			}
			student.setFirstName(dto.getFirstName());
			student.setLastName(dto.getLastName());
			student.setEmail(dto.getEmail());
			student.setAge(dto.getAge());
			student.setPhoneNo(dto.getPhoneNo());
			student.setDob(dto.getDob());
			student.setBookPrice(dto.getBookPrice());
			repo.save(student);
			return messageSource.getMessage("msg002", new Object[] { dto.getId() }, LocaleContextHolder.getLocale());

		} catch (Exception e) {
			throw new ResourceNotFoundException("Student of given id is not found");

		}
	}

	@Override
	public ServiceResponse deleteStudentById(Long id) {
		try {
			Optional<Students> student = repo.findById(id);
			if (student.isPresent()) {
				repo.deleteById(id);
				// return messageSource.getMessage("msg003",new Object[]
				// {id},LocaleContextHolder.getLocale());
				return new ServiceResponse(Constants.MESSAGE_STATUS.SUCCESS, "Student Deleted Successfully", null);
			}
			// return messageSource.getMessage("msg004",new Object[]
			// {id},LocaleContextHolder.getLocale());
			else {
				return new ServiceResponse(Constants.MESSAGE_STATUS.FAILED, "StudentDeletion Failed", null);
			}

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ServiceResponse(Constants.MESSAGE_STATUS.FAILED, "Student Delete Failed Exception", null);
		}

	}

}
