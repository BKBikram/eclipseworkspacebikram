package com.SpringBootBook;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bid;
	private String bname;
	private double bprice;
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	public Book( String bname, double bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
