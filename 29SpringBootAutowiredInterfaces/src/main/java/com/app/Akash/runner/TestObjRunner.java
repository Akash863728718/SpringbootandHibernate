package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.service.EmployeeService;
@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private EmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(service);
	}

}
