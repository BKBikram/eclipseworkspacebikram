package com.employee.binding;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.employee.binding.Employees;

public class Test {

	public static void main(String[] args) throws JAXBException {
		//MARSHALLING -> Converting Java Object to XML
		Employees emp=new Employees();
		emp.setEmpId(1);
		emp.setEmpName("Anil");
		emp.setEmail("anil@gmail.com");
		emp.setSalary(5000);
		
		//First Create JAXBContext Object, to create JAXBContext Object we can use newInstance() from JAXBContext class
		//the newInstance() is static so that we can call through class name
		JAXBContext context=JAXBContext.newInstance(Employees.class);
		
		//Then Create Marshaller Object from JAXBContext
		Marshaller marshaller=context.createMarshaller();
		//call marshall() function from Marshaller Object
		//Below one will be printed on console
		marshaller.marshal(emp, System.out);// this one will be printed on console
		File file=new File("emp.xml");
		marshaller.marshal(emp,file);
		System.out.println("done");
		
		
		//get the xml in the form of string by using stringwriter
		StringWriter writer=new StringWriter();
		marshaller.marshal(emp, writer);
		String xml=writer.toString();
		System.out.println(xml);

	}

}
