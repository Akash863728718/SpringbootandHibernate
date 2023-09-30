package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Employee;
import com.app.Akash.repo.EmployeeRepository;
@Component
public class TestQueryRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
Employee e =new Employee();
e.setEmpDept("Akash");
e.setEmpName("Ganesh");
e.setEmpSal(600.0);
repo.save(e);
		
	}

}
