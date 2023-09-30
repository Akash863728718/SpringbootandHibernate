package com.app.Akash;

import java.util.List;

public class Product {
 private String pcode;
 private String mode1;
 private List<String> data;
 private Vendor vob;

public Product(String pcode, String mode1, List<String> data , Vendor vob) {
	super();
	this.pcode = pcode;
	this.mode1 = mode1;
	this.data = data;
	this.vob=vob;
}

@Override
public String toString() {
	return "Product [pcode=" + pcode + ", mode1=" + mode1 + ", data=" + data + ", vob=" + vob + "]";
}



 
}
