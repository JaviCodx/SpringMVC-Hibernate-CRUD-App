package com.luv2code.testdb;

import java.sql.Connection;

import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcURL ="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
				
		try {
			
			System.out.println("Connecting to data base: " + jdbcURL);
			
			Connection myConn = DriverManager.getConnection(jdbcURL, user, pass);
			
			System.out.println("Connection successfull!!");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

