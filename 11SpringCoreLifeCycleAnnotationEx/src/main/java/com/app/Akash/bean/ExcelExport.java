package com.app.Akash.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exobj")
public class ExcelExport {
	
	@Value("SAMPLE")
private String fileName;
	                                                                
	@Value("csv")
private String fileExt;
	
@Override
public String toString() {
	return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
}
@PostConstruct
public void setupA() {
	System.out.println("FROM INIT METHOD");
}
@PreDestroy
public void clearB() {
	System.out.println("FROM DESTROY METHOD");
}
}
