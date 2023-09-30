package com.app.Akash.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Akash.Bean.MyDbConnection;
import com.app.Akash.config.AppConfig;

public class Test {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
	MyDbConnection db = ac.getBean("dbObj",MyDbConnection.class);
	System.out.println(db);
	
}
}
