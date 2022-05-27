package com.student.dto;

import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.student.util.Constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	private Long id;
	@NotBlank
	@Size(min=3,max=15,message="size must be greater than 3")
	private String firstName;
	@NotEmpty
	 
	private String lastName;
	@Min(value=10)
	@Max(value=60)
	private Long age;
	@Email
	//@Pattern(regexp = "[a-zA-Z0-9_\\-\\.]+[@][a-zA-Z0-9]+[.][a-z]{2,5}")
	@Pattern(regexp=Constants.VALID.PATTERN_EMAIL,message= "{Pattern.studentDto.email}")
	private String email;
	@Pattern(regexp=Constants.VALID.PATTERN_CELL_NO3,message="{Pattern.studentDto.phoneNo}") 
	private String phoneNo;
	@Past(message="dob should be yyyy-mm-dd format")
	private Date dob;
	@DecimalMin(value = "0.0")
	@Digits(fraction = 2, integer = 4)
	private Double bookPrice;


}
