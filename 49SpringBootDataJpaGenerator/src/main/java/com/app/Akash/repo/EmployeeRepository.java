package com.app.Akash.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Akash.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value ="SELECT E.ENAME,E.ESAL FROM EMPTAB E" , nativeQuery =true)
	List<Object[]> getData();
	
}
