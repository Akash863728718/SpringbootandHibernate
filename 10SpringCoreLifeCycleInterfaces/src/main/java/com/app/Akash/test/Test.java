package com.app.Akash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Akash.bean.ExcelExport;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	ExcelExport ee=ac.getBean("exobj",ExcelExport.class);
	System.out.println("FROM MAIN");
	System.out.println(ee);
}
}
