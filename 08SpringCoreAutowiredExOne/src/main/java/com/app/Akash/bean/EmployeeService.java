package com.app.Akash.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("esobj")
public class EmployeeService {
	
	@Autowired
private EmployeeDao dao; //HAS-A relation

@Override
public String toString() {
	return "EmployeeService [dao=" + dao + "]";
}

}
