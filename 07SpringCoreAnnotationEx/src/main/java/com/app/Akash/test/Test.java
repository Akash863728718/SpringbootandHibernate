package com.app.Akash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Akash.bean.DatabaseCon;
import com.app.Akash.config.AppConfig;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
	DatabaseCon db = ac.getBean("dbobj",DatabaseCon.class);
	System.out.println(db);
}
}
   