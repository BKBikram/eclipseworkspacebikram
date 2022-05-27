package com.employee.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	
	private Long employeeId;
	@NotBlank(message="firstName should not be blank")
	private String firstName;
	@NotEmpty(message="lastName should not be Empty")
	private String lastName;
	@Min(value = 18)
	@Max(value = 60)
	private Long age;
	@Email
	@Pattern(regexp = "[a-zA-Z0-9_\\.\\-]+[@][a-zA-Z][.][a-z]",message="email should be in proper format")
	private String email;
	@Pattern(regexp = "[0-9]{10}")
	private Long phoneNo;

}
