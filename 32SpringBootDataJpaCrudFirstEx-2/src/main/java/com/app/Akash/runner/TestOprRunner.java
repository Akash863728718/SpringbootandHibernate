package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.repo.EmployeeRepository;
@Component
public class TestOprRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepository repo;

	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
	}
}
