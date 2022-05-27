package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository; 

import com.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	 List<User> findByLastName(String lastName);
	 List<User> findByAge(Long age);
	 List<User> findByFirstNameAndLastName(String firstName,String lastName);
	
	 List<User> findByAgeLessThanEqual(Long age);
	 List<User> findByAgeGreaterThanEqual(Long age);
	
	 
	 //using query
	 @Query("select u from User u where u.age=:a")
	 List<User> findUserByAge(@Param("a")Long age);
	 
	 @Query("select u from User u where u.age=:a or u.firstName=:f")
	 List<User> findUserByAgeOrFirstName(@Param("a")Long age,@Param("f")String firstName);
	 
	 @Query(value="select * from Users" ,nativeQuery =true)
	 List<User> findAllUsers();
	 
	 @Query(value="select * from users where firstname=:fn" ,nativeQuery=true)
     List<User> findUserByFirstName(@Param("fn")String firstName);
	 
	 @Query(value="SELECT * from Users ORDER BY firstname ASC" ,nativeQuery=true)
	 List<User> findUserOrderBy();
	 
	 
}
