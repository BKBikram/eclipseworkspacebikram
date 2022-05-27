package com.SpringBootPerson.entities;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person_Table")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	@Column(name="Person_Name" ,nullable=false)
	private String PersonName;
	@Column(name="Person_age")
	private int page;
	private String email;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, int page, String email) {
		super();
		this.personId = personId;
		PersonName = personName;
		this.page = page;
		this.email = email;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
