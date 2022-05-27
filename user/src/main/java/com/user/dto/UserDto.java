package com.user.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private static final String regexp = null;

	private Long id;
	
	@NotBlank
	@Size(min=2,message="size must be greater than 2")
	private String firstName;
	@NotEmpty
	private String lastName;
	@Email
	@Pattern(regexp = "[a-zA-Z0-9_\\-\\.]+[@][a-z]+[.][a-z]{2,5}")
	private String email;
	@Min(value = 10)
	@Max(value=60)
	private Long age;
	
	

}
