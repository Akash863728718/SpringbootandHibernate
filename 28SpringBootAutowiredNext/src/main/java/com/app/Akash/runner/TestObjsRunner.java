package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.bean.Product;

@Component
public class TestObjsRunner implements CommandLineRunner {

	@Autowired
	private Product pob;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
System.out.println(pob);
	}

}
