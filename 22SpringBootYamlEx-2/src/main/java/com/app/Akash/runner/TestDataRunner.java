package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.bean.ProductInfo;
@Component
public class TestDataRunner implements CommandLineRunner{

@Autowired
	private ProductInfo pob;
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	
	System.out.println(pob);
}
}
