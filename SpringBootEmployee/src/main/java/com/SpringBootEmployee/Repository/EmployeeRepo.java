package com.SpringBootEmployee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootEmployee.Entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
