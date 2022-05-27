package com.student.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="STUDENTS")
public class Students {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="stud_seq")
	@SequenceGenerator(name="stud_seq",sequenceName = "student_sequence",initialValue = 1,allocationSize = 1)
	@Column(name="STUDENT_ID")
	private Long id;
	@Column(name="FIRST_NAME")
	
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="STUDENT_AGE")
	private Long age;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONENO")
	private String phoneNo;
	@Column(name="DOB")
	private Date dob;
	@Column(name="BOOKPRICE")
	private Double bookPrice;
	

}
