package com.app.Akash.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		Connection con=null;
		try {
			 con = DriverManager.getConnection("","","");
		con.setAutoCommit(false);
		//stmt,  ..execute..
		
		con.commit();
		
		}catch(Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		e.printStackTrace();
		}
	}
}
