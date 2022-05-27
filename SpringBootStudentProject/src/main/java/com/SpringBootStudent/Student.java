package com.SpringBootStudent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Newstudent")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int sid;
	private String sname;
	private int sage;
	private String scity;
	
	public Student(int sid,String sname, int sage, String scity) {
		super();
		this.sid=sid;
		this.sname = sname;
		this.sage = sage;
		this.scity = scity;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

}
