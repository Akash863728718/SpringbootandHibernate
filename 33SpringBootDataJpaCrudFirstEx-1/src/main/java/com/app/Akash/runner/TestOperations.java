package com.app.Akash.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Book;
import com.app.Akash.exception.BookNotFoundException;
import com.app.Akash.repo.BookRepository;
@Component
public class TestOperations implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
        System.out.println(repo.getClass().getName());
		Book b1 = new Book(10,"Core Java","SAM",200.0);
		repo.save(b1);
		
		repo.save(new Book(11,"Adv Java","SYED",300.0));
		repo.save(new Book(12,"Spring","AKASH",500.0));//INSERT
		repo.save(new Book(12,"Spring 6.x","Bikash",600.0));//UPDATE
        
		repo.saveAll(
				Arrays.asList(
						new Book(13, "HTML CSS", "ni", 900.0),
						new Book(14,"BOOTSTRAP","GANESH",800.0),
						new Book(15,"REACT JS","SHIV",9800.0)
						)
				);
		
		Iterable<Book> data = repo.findAll();
		//data.forEach(b-> System.out.println());
		data.forEach(b->System.out.println(b));
System.out.println(repo.count());
		
		System.out.println(repo.existsById(13));
		//======================================
		/*Optional<Book>opt = repo.findById(140);
		if(opt.ispresent()) {
			Book b3 = out.get();
			System.out.println(b3);
		}else {
			throw new BookNotFoundException("BOOK NOT EXIST WITH ID");
		}*/
		
		
		Book b4 = repo.findById(14)
		.orElseThrow(
		()-> new BookNotFoundException("BOOK NOT EXIST WITH ID"));
		System.out.println(b4);
		//============================
		repo.deleteById(15);
		//repo.deleteAll();
	}

}
