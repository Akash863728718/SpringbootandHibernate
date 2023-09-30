package com.app.Akash;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[]args) {
	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
	
	ExcelExport ee = ac.getBean("exobj", ExcelExport.class);
	System.out.println(ee);
}
}
