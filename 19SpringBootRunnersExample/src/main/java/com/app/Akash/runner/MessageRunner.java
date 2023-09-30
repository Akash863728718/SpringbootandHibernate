package com.app.Akash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(51)
public class MessageRunner implements CommandLineRunner{

public void run(String...args)throws Exception{
	System.out.println("FROM MESSAGE RUNNER");
}
}
