package com.app.Akash.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Product;
import com.app.Akash.repo.ProductRepository;
@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository prepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Product p1 = new Product(101, "PEN", new Date(),new Date(),new Date());
	    prepo.save(p1);
	    
	         //OR
	  //core Java code
	  		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	  		String dte = sdf.format(new Date());
	  		System.out.println(dte);
	  		
	}

}
