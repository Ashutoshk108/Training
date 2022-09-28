package com.bhavna.jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MyConnection {
	public static Connection setConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/combhavna","root","Bhavna@123");
			
			if(connection.isClosed()) {
				System.out.println("Connection is still closed.");
			}else {
				System.out.println("Connection created");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}