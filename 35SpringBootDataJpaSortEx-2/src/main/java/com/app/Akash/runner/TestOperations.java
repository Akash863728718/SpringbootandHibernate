package com.app.Akash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Book;
import com.app.Akash.repo.BookRepository;

@Component
public class TestOperations implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	public void run(String... args) throws Exception {
		// Book b1;

		repo.saveAll(Arrays.asList(
				new Book(10, "Core Java", "SAM", 200.0),
				new Book(11, "Adv Java", "SYED", 300.0),
				new Book(12, "Spring", "SAM", 400.0),

				new Book(13, "HTML CSS", "AJAY", 100.0), 
				new Book(14, "Bootstrap", "AJAY", 200.0),
				new Book(15, "ReactJS", "AJAY", 300.0), 
				new Book(16, "NodeJS", "SAM", 400.0),
				new Book(17, "NPM Modules", "SAM", 100.0)

		));
		
 repo.findAll().forEach(System.out::println);
 
 //=============================================//
//** 1. SINGLE COLUMN SORTING - ASC **//
 //=============================================//
 //order by bcost ASC;
 Sort s1 = Sort.by(Direction.ASC,"bookCost");
 //Select * from booktab+ order by bcost ASC;
 Iterable<Book>it1 = repo.findAll(s1);
 it1.forEach(System.out::println);
	}

}
