package com.app.Akash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(90)
public class JdbcRunner implements CommandLineRunner{
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	System.out.println("FROM JDBC RUNNER");
}
}
