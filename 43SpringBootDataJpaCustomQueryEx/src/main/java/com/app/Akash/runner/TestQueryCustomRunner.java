package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.repo.BookRepository;
@Component
public class TestQueryCustomRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

       repo.getDataA("Bootstrap", 200.0).forEach(System.out::println);
	}

}
