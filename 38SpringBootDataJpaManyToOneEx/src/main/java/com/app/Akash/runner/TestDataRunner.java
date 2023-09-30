package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Department;
import com.app.Akash.entity.Employee;
import com.app.Akash.repo.DepartmentRepository;
import com.app.Akash.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner{

	@Autowired
	private EmployeeRepository erepo;
	@Autowired
	private DepartmentRepository drepo;
	@Override
	public void run(String... args) throws Exception {
		Department d1 = new Department(101, "XYZ", "DEV");

		drepo.save(d1);
		
	
		Employee e1 = new Employee(10, "SAM", 200.0, d1);
		Employee e2 = new Employee(11, "SYED", 300.0, d1);
		Employee e3 = new Employee(12, "AJAY", 400.0, d1);

		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);

	}
}


