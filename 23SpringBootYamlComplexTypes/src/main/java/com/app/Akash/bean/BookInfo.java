package com.app.Akash.bean;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Flow.Publisher;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.book")
public class BookInfo {
	
private String bname;

private List<String> authors;

private Map<String,String> versions;
//private Properties Versions;

private Publisher pob; //Has-A Variable
}
