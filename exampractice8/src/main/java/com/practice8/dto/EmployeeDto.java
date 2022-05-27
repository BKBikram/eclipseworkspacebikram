package com.practice8.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.practice8.util.Constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	
	private Long id;
	@NotBlank
	private String firstName;
	@NotNull
	private String lastName;
	@Pattern(regexp = Constants.VALID.EMAIL_PATTERN)
	private String email;
	@Min(value = 18)
	@Max(value = 60)
	private Long age;

}
