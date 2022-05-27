package com.sequenceexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sequenceexample.entity.example;

@Repository
public interface ExampleRepository extends JpaRepository<example, Long>{

}
