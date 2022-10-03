package com.bhavna.service;

import java.sql.*;

public class ServiceProvider {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "Bhavna@123");
			//return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void insertReferralData() {
		try {
			System.out.println("Inserting data in the table");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root",
					"Bhavna@123");
			// Connection connection=getConnection();
			String query = "insert into referral(referralId,referralName,phoneNo,emailId,dateOfReferral) values(?,?,?,?,?)";
			PreparedStatement stmnt = connection.prepareStatement(query);
			stmnt.setInt(1, 3);
			stmnt.setString(2, "Abhi");
			stmnt.setString(3, "45687876554");
			stmnt.setString(4, "Ajay@gmail.com");
			stmnt.setString(5, "15/07/2022");
			stmnt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void viewReferralData() throws SQLException {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Viewing record");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDB", "root", "Bhavna@123");
		String query = "select * from referral";
		Statement stmnt = connection.createStatement();
		ResultSet res = stmnt.executeQuery(query);
		while (res.next()) {
			int id = res.getInt("referralId");
			String name = res.getString("referralName");
			String phoneNo = res.getString("phoneNo");
			String email = res.getString("emailId");
			String date = res.getString("dateOfReferral");
			System.out.println(id + "\t" + name + "\t" + phoneNo + "\t" + email + "\t" + date);
		}
		res.close();
	}

	public static void updateReferralData() throws SQLException{
		System.out.println("Record updated");
		String query="update referral set referralName=? where referralId=?";
		Connection connection=ServiceProvider.getConnection();
		PreparedStatement stmnt=connection.prepareStatement(query);
		stmnt.setString(1,"Ram");
		stmnt.setInt(2,3);
		stmnt.executeUpdate();
				
	}

	public static void deleteReferralData() throws SQLException {
		System.out.println("Deleting record");
		String query = "delete from referral where referralId=3";
		PreparedStatement stmnt = getConnection().prepareStatement(query);
		stmnt.execute();
	}

	/*public static void main(String args[]) throws SQLException {
		//insertReferralData();
		viewReferralData();
		updateReferralData();
		viewReferralData();
		deleteReferralData();
		viewReferralData();
	}*/

}
/*
 * create table referral( referralId int primary key, referralName varchar(50),
 * phoneNo varchar(50), emailId varchar(30), dateOfReferral date );
 */