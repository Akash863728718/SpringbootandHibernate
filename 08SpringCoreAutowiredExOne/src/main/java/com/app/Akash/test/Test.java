package com.app.Akash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Akash.bean.EmployeeService;
import com.app.Akash.config.AppConfig;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	EmployeeService es = ac.getBean("esobj",EmployeeService.class);
	System.out.println(es);
}
}
