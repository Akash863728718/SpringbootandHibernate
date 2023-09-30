package com.app.Akash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Book;
import com.app.Akash.repo.BookRepository;

@Component
public class TestOperations implements CommandLineRunner {

	@Autowired
	private BookRepository repos;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		repos.saveAll(
				Arrays.asList(
							new Book(10, "Core Java", "SAM", 200.0),
							new Book(11, "Adv Java", "SYED", 300.0),
							new Book(12, "Spring", "SAM", 400.0),

							new Book(13, "HTML CSS", "AJAY", 100.0), 
							new Book(14, "Bootstrap", "AJAY", 200.0),
							new Book(15, "ReactJS", "AJAY", 300.0),
							new Book(16, "NodeJS", "SAM", 400.0),
							new Book(17, "NPM Modules", "SAM", 100.0)
				)
		);
		
		
	}

}
