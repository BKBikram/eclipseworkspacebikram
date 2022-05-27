package com.practice8.repository.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.data.jpa.domain.Specification;

import com.practice8.entity.Employee;

public class EmployeeSpecification {
	public static Specification<Employee> getEmployee(String searchParam){
		return new Specification<Employee>() {

			@Override
			public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				Predicate finalPredicate=null;
				JSONParser parser=new JSONParser();
				try {
					JSONObject obj=(JSONObject) parser.parse(searchParam);
					//Note specification field name should be match with postman field
					String field1=(String) obj.get("field1");
					String field2=(String) obj.get("field2");
					String field3=(String) obj.get("field3");
					String field4=(String) obj.get("field4");
					String empId1=(String) obj.get("empId1");
					String empId2=(String) obj.get("empId2");
					String field5=(String) obj.get("field5");
					if(!field1.isEmpty()) {
						Predicate field1Predicate=criteriaBuilder.like(root.get("firstName"), field1 +"%");
						finalPredicate=criteriaBuilder.and(field1Predicate);
					}
					if(!field1.isEmpty()) {
						Predicate field5Predicate=criteriaBuilder.equal(root.get("firstName"), field1);
						if(finalPredicate!=null) {
							finalPredicate=criteriaBuilder.and(finalPredicate,field5Predicate);
						}else {
							finalPredicate=criteriaBuilder.and(field5Predicate);
						}
				}
					if(!field2.isEmpty()) {
						Predicate field2Predicate=criteriaBuilder.equal(root.get("lastName"), field2);
						if(finalPredicate!=null) {
							finalPredicate=criteriaBuilder.and(finalPredicate,field2Predicate);
						}else {
							finalPredicate=criteriaBuilder.and(field2Predicate);
						}
				}
					if(!field3.isEmpty()) {
						Predicate field3Predicate=criteriaBuilder.equal(root.get("email"), field3);
						if(finalPredicate!=null) {
							finalPredicate=criteriaBuilder.and(finalPredicate,field3Predicate);
						}else {
							finalPredicate=criteriaBuilder.and(field3Predicate);
						}
					}
					if(!empId1.isEmpty() && !empId2.isEmpty()) {
						Predicate field4Predicate=criteriaBuilder.between(root.get("id"),Long.valueOf(empId1),Long.valueOf(empId2));
						if(finalPredicate!=null) {
							finalPredicate=criteriaBuilder.and(finalPredicate,field4Predicate);
						}
						else {
							finalPredicate=criteriaBuilder.and(field4Predicate);
						}
					}
				}catch (Exception e) {
					//only for logger
					}
				return finalPredicate;
			}
		};
		
		
	}

}
