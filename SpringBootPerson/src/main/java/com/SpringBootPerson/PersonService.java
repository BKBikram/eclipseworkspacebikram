package com.SpringBootPerson;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootPerson.Repo.PersonRepo;
import com.SpringBootPerson.entities.Person;
@Service
public class PersonService {
	@Autowired
	private PersonRepo personrepo;
	

	public Person createPerson(Person p1) {
		// TODO Auto-generated method stub
		return personrepo.save(p1);
	}


	public Iterable<Person> createPersons(List<Person> personlist) {
		 Iterable<Person> pl=personrepo.saveAll(personlist);
		return pl;
	}


	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return personrepo.findAllById(ids);
	}


	public void deletePerson(Person person) {
		// TODO Auto-generated method stub
		personrepo.delete(person);
		
	}
	public void UpdateEmail(int id, String newemail) {
		// TODO Auto-generated method stub
		Optional<Person> person=personrepo.findById(id);
		Person p=person.get();
		p.setEmail(newemail);
		personrepo.save(p);
		
		
	}

}
