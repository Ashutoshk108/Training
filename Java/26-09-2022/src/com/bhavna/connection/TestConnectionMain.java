package com.bhavna.connection;

import java.sql.SQLException;

import com.bhavna.bean.Company;
import com.bhavna.dao.CompanyDaoClass;

public class TestConnectionMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		MyConnection obj=new MyConnection();
		Company company=new Company(2,534512.0,"Faridabad","2022-09-27");
		CompanyDaoClass in=new CompanyDaoClass();
		in.getData(company);
		//in.insertData(company);
		//in.insertData(new Company(3,563478,"Noida","2022-09-21"));
		in.getData(company);
		//in.deleteData();
		//in.updateData();
		in.getData(company);
		//in.updateDate();
		//in.getData(company);
	}

}
