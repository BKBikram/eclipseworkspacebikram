package com.exampractice;

class Employee12{
	private String name;
	private String eaddress;
	private int eid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getEid() {
		return eid;
	}
	
	@Override
	public String toString() {
		return "name=" + this.name + ", eaddress=" + this.eaddress + ", eid=" + this.eid + "]";
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	
	
}
public class Encapsulationpr {

	public static void main(String[] args) {
		Employee12 ob=new Employee12();
		ob.setName("Biplab");
		ob.setEid(0);
		ob.setEaddress("kendrapara");
		System.out.println(ob.getEid());
		

	}

}
