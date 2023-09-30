package com.app.Akash.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.Akash.bean.ExcelExport;
import com.app.Akash.config.AppConfig;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
	ExcelExport ee=ac.getBean("exobj",ExcelExport.class);
	System.out.println("FROM MAIN");
	System.out.println(ee);
}
}
