package com.bhavna.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class MyConnection {
	public static Connection setConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/comBhavna?verifyServerCertificate=false&useSSL=true","root","Bhavna@123");
			
			if(connection.isClosed()) {
				System.out.println("Connection is still closed.");
			}else {
				System.out.println("Connection Established");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/combhavna","root","Bhavna@123");
			String s="insert into Company(company_Id,turnOver,address,date) values(?,?,?,?)";
			PreparedStatement pstmnt=connection.prepareStatement(s);
			pstmnt.setInt(1,1);
			pstmnt.setDouble(2,123400);
			pstmnt.setString(3,"Delhi");
			pstmnt.setString(4,"2022-09-26");
			pstmnt.executeUpdate();
			System.out.println("Data inserted");
			
			String s1 = "select * from Company";
			 
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(s1);
			int cnt=0;
			
			while (result.next()){
			    int id = result.getInt(1);
			    Double turnOver = result.getDouble(2);
			    String address = result.getString(3);
			    String date = result.getString(4);
			 
			    String output = "User #%d: %d - %s - %s";
			    System.out.println(String.format(output, ++cnt, id, turnOver, address, date));
			}

			
			if(connection.isClosed()) {
				System.out.println("Connection is still closed.");
			}else {
				System.out.println("Connection created");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}*/

}
