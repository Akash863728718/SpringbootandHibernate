package com.app.Akash.bean;

public class ExcelExport {
private String fileName;
private String fileExt;

public ExcelExport() {
	super();
	System.out.println("FROM CONSTRUCTOR");
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
	System.out.println("FROM SETTER METHOD");
}
public String getFileExt() {
	return fileExt;
}
public void setFileExt(String fileExt) {
	this.fileExt = fileExt;
}
@Override
public String toString() {
	return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
}
public void setup() {
	//FIS -->read data--> filename
	System.out.println("FROM INIT METHOD");
}
public void clear() {
	System.out.println("FROM DESTROY METHOD");
}
}
