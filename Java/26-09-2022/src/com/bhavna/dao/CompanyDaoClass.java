package com.bhavna.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

import com.bhavna.bean.Company;
import com.bhavna.connection.MyConnection;
//import com.mysql.*;
//import com.mysql.cj.xdevapi.Statement;

public class CompanyDaoClass {
	
	public int insertData(Company company) {
		int i=0;
		PreparedStatement pstmnt=null;
		Connection connection=null;
		try {
			connection=MyConnection.setConnection();
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/combhavna","root","Bhavna@123");
			String s="insert into Company(company_Id,turnOver,address,date) values(?,?,?,?)";
			pstmnt=connection.prepareStatement(s);
			pstmnt.setInt(1,company.getCompany_Id());
			pstmnt.setDouble(2,company.getTurnOver());
			pstmnt.setString(3,company.getAddress());
			pstmnt.setString(4,company.getDate());
			pstmnt.executeUpdate();
			System.out.println("Data inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	public void getData(Company company) {
		Statement statement=null;
		Connection connection=null;
		ResultSet result=null;
		try {
			String s1 = "select * from Company";
			connection=MyConnection.setConnection(); 
			statement = connection.createStatement();
			result = statement.executeQuery(s1);
			int cnt=0;
			
			while (result.next()){
			    int id = result.getInt(1);
			    Double turnOver = result.getDouble(2);
			    String address = result.getString(3);
			    String date = result.getString(4);
			    String output = "User #%d: %d - %s - %s";
			    System.out.println(String.format(output, ++cnt, id, turnOver, address, date));
			}
		}catch(Exception e) {
				e.printStackTrace();
		}
	}
	public void updateData() {
		try {
			Connection connection=MyConnection.setConnection();
			String s="update company turnOver=?, address=?, date=?";
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter turnover: ");
			Double turnOver=Double.parseDouble(br.readLine());
			System.out.println("Enter new address: ");
			String address=br.readLine();
			System.out.println("Enter new date:");
			String date=br.readLine();
			
			PreparedStatement pstmt=connection.prepareStatement(s);
			pstmt.setDouble(1, turnOver);
			pstmt.setString(2, address);
			pstmt.setString(3, date);
			pstmt.executeUpdate();
			System.out.println("Update successful!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void deleteData() throws SQLException {
		/*
		String DELETE_USERS_SQL="delete from Company where company_Id=3;";
		System.out.println(DELETE_USERS_SQL);	        
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/comBhavna?verifyServerCertificate=false&useSSL=true","root","Bhavna@123");
            Statement statement = connection.createStatement();) {
            int result = statement.executeUpdate(DELETE_USERS_SQL);
            System.out.println("Number of records affected :: " + result);
        }catch ( SQLException e) {
            System.out.println(e);
        }*/
        
        String sql = "delete from Company where company_Id=2";
        try {
        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/comBhavna?verifyServerCertificate=false&useSSL=true","root","Bhavna@123");
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,2);
             
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A user was deleted successfully!");
            }
        }catch(SQLException e) {
        	System.out.println(e);
        }
        
	}
	
}
