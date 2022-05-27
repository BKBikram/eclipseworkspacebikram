package com.practice8.repository;

import java.util.List; 

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practice8.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>,JpaSpecificationExecutor<Employee>{
	
	List<Employee> findByAgeLessThanEqual(Long age);
	
	//List<Employee> findAll(String firstname,String lastname);
	
	@Query("select e from Employee e where e.firstName=:fn")
	List<Employee> findByfirstName(@Param("fn")String firstName);
	
	@Query("select e from Employee as e where e.lastName=:ln")
	List<Employee> findBylastName(@Param("ln")String lastName);
	
	@Query("select e from Employee as e where e.age between :a1 and :a2")
	List<Employee> findByAgeBetween(@Param("a1")Long age,@Param("a2")Long age1);
	
	@Query(value="select * from employees where age in(age1,age2) ",nativeQuery=true)
	List<Employee> findAgeIn(@Param("age")Long age,@Param("age2")Long age2);
	
	//@Query("select e from Employee as e where e.")
	@Transactional 
	@Modifying
	@Query("delete Employee as e where e.firstName=:fn")
	void deleteByfirstName(@Param("fn")String firstName);
	
	@Query(value="select * from employees ORDER BY firstname  ASC",nativeQuery=true)
	List<Employee> findByAllInAscendingOrder();
	
	
}
