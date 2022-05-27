package com.student.service;

import javax.validation.Valid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.context.NoSuchMessageException;

import java.util.List;

import com.student.dto.ServiceResponse;
import com.student.dto.StudentDto;
import com.student.exception.RecordNotFoundException;

public interface StudentService {

	ServiceResponse addStudent(@Valid StudentDto dto);

	JSONArray getAllStudents() throws NoSuchMessageException, RecordNotFoundException;

	JSONObject getStudentById(Long id);

	String updateStudentById(Long id, @Valid StudentDto dto);

	ServiceResponse deleteStudentById(Long id);

}
