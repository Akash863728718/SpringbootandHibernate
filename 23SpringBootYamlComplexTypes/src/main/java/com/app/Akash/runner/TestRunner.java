package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.bean.BookInfo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private BookInfo bo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
       System.out.println(bo); 
       System.out.println(bo.getAuthors().getClass().getName());
       System.out.println(bo.getVersions().getClass().getName());
	}

}
