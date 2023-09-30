package com.app.Akash.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("edo")
public class EmployeeDao {
	@Value("ORACLE")
private String dbName;

@Override
public String toString() {
	return "EmployeeDao [dbName=" + dbName + "]";
}

}
