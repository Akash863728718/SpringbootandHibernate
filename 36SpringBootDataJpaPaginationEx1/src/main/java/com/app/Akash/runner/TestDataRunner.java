package com.app.Akash.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Employee;
import com.app.Akash.repo.EmployeeRepository;
@Component
public class TestDataRunner implements CommandLineRunner{
@Autowired
private EmployeeRepository repo;
@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	repo.saveAll(Arrays.asList(new Employee(101, "AKASH", 200.0),
			new Employee(102, "BIKASH", 300.0),
			new Employee(103, "CHIKU", 400.0),
			new Employee(104, "DEVID", 500.0),
			new Employee(105, "ELISA", 200.0),
			new Employee(106, "FENCH", 300.0),
			new Employee(107, "GIMA", 400.0),
			new Employee(108, "HARISH", 500.0),
			new Employee(109, "YELEMA", 200.0),
			new Employee(110, "UVRAJ", 300.0)));
	//==============================================
	//page num,page size are inputs
	
	  Pageable pageable = PageRequest.of(1, 3); Page<Employee> page =
	  repo.findAll(pageable);
	  
	  List<Employee> list = page.getContent(); list.forEach(System.out::println);
	  System.out.println("FIRST ? " + page.isFirst()); System.out.println("LAST ? "
	  + page.isLast()); System.out.println("NEXT ? " + page.hasNext());
	  System.out.println("PREVIOUS ? " + page.hasPrevious());
	  System.out.println("TOTAL PAGES ? " + page.getTotalPages());
	  System.out.println("CURRENT PAGE ? " + page.getNumber());
	  System.out.println("SIZE ? " + page.getSize());
	  System.out.println("TOTAL ROWS ? " + page.getTotalElements());
	 
	
	}
}
