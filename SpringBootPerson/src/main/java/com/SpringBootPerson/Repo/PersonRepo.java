package com.SpringBootPerson.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootPerson.entities.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
