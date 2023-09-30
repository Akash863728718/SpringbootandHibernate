package com.app.Akash;

public class MyDbCon {
	
private String driver;
private String url;
//Source > Generate Constructor using Fields > Deselect All > Generate
public MyDbCon() {
	super();
}
//Source > Generate setters/getters > select All > Generate
public String getDriver() {
	return driver;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
//Source > Generate toString > Generate
@Override
public String toString() {
	return "MyDbCon [driver=" + driver + ", url=" + url + "]";
}

}
