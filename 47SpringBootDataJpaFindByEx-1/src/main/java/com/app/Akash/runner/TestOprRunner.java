package com.app.Akash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Employee;
import com.app.Akash.repo.EmployeeRepository;
@Component
public class TestOprRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		repo.saveAll(Arrays.asList(
				new Employee(10,"AA",200.0,"DEV"),
				new Employee(11,"AB",301.0,"DEF"),
				new Employee(12,null,402.0,"DEE"),
				new Employee(13,"AD",503.0,"DED")
				));	
		
		 //repo.findByEmpSalLessThan(400.0).forEach(System.out::println);
		                          //OR
	     //repo.findByEmpNameIsNotNull().forEach(System.out::println);
		                          //OR
	     //repo.findByEmpDept("DEV").forEach(System.out::println);
		                         //OR
		 //repo.findByEmpDeptIs("DEV").forEach(System.out::println);
		                         //OR
		 //repo.findByEmpDeptEquals("DEV").forEach(System.out::println);
		                        //OR
		//repo.findByEmpNameLike("A%").forEach(System.out::println);
                                //OR	
        //repo.findByEmpNameLike("A%").forEach(System.out::println);
		repo.findByEmpIdNotOrEmpNameIsNotNull(10).forEach(System.out::println);
	}
	

}
