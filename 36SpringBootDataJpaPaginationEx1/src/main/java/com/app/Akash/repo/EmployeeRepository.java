package com.app.Akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Akash.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
