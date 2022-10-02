package com.bhavna.tester;

//import com.bhavna.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bhavna.bean.Company;
import com.bhavna.bean.Department;
import com.bhavna.bean.Employee;


public class TesterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Company compObj=(Company)context.getBean("company");
		System.out.println(compObj);
		Employee empObj=(Employee)context.getBean("employee");
		System.out.println(empObj);
		Department departObj=(Department)context.getBean("department");
		System.out.println(departObj);
		((ClassPathXmlApplicationContext) context).close();
		

	}

}
