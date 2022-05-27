package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EMPLOYEES")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Emp_seq")
	@SequenceGenerator(name="Emp_seq",sequenceName = "Employee_seq",initialValue = 1,allocationSize =1 )
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="AGE")
	private Long age;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONENO")
	private Long phoneNo;

}
