package com.app.Akash.runner;

import java.util.List;

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

		repo.save(new Employee(101,"A",200.0,"DEV"));
		List<Object[]> arr = repo.getData();
		arr.stream().map(e->e[0]+""+e[1]).forEach(System.out::println);  
		
	}

}
