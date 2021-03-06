package com.SpringBootEmployee.entities;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Employee")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	private String ename;
	@Email(message="Enter valid email")
	private String email;
	private int eage;
//	
//	public int getEmpid() {
//		return empid;
//	}
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public int getEage() {
//		return eage;
//	}
//	public void setEage(int eage) {
//		this.eage = eage;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", ename=" + ename + ", email=" + email + ", eage=" + eage + "]";
//	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Employee(int empid, String ename, String email, int eage) {
//		super();
//		this.empid = empid;
//		this.ename = ename;
//		this.email = email;
//		this.eage = eage;
//	}
	
	
	

}
