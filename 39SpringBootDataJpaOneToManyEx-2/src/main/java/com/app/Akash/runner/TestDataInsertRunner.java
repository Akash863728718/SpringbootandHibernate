package com.app.Akash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Order;
import com.app.Akash.entity.Product;
import com.app.Akash.repo.OrderRepository;
import com.app.Akash.repo.ProductRepository;


@Component
public class TestDataInsertRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository prepo;
	
	@Autowired
	private OrderRepository orepo;
	
	
	public void run(String... args) throws Exception {
		Product p1 = new Product(1501, "TAX", 20.0);
		Product p2 = new Product(1502, "BAT", 40.0);
		Product p3 = new Product(1503, "BOX", 30.0);
		
		
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		
		Order ord = new Order(2301, "ONLINE", 5.0, Arrays.asList(p1,p2,p3));
		orepo.save(ord);
	}

}
