package com.SpringBootPerson;

import java.util.Arrays;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringBootPerson.entities.Person;

@SpringBootApplication
public class SpringBootPersonApplication implements CommandLineRunner{
	  @Autowired
      private PersonService personservice;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//createperson();
		//createpersons();
		//getPersonByIds();
		//deletePerson();
		updatePersonEmailById();
	}
	private void updatePersonEmailById() {
		// TODO Auto-generated method stub
		personservice.UpdateEmail(6,"satya123@gmail.com");
		
	}

	private void deletePerson() {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setPersonId(5);
		personservice.deletePerson(person);
		
	}

	private void getPersonByIds() {
		List<Integer> ids=new ArrayList<>();
		ids.add(2);
		ids.add(3);
		Iterable<Person> personlist=personservice.getPersonByIds(ids);
		personlist.forEach(System.out::println);
		
		
	}

	private void createperson() {
		Person p1=new Person("Satya",18,"satya@gmail.com");
		Person db=personservice.createPerson(p1);
	}
	private void createpersons() {	
		List<Person> personlist=Arrays.asList(new Person("Biplab",23,"biplab@gmail.com"),
				new Person("Chitta",24,"chita@gmail.com"),new Person("Pranab",25,"pranab@gmail.com"),
				new Person("Satya",18,"satya@gmail.com"));
		Iterable<Person> cre=personservice.createPersons(personlist);		
	}

}
