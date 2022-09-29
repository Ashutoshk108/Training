package com.bhavna.coreSpring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContxtObj=new ClassPathXmlApplicationContext("PersonConfig.xml");
        
        Person person=(Person)appContxtObj.getBean("persn");
        System.out.println(person);
        System.out.println();
        Person person1=(Person)appContxtObj.getBean("persn1");
        System.out.println(person1);
        
        ((ClassPathXmlApplicationContext) appContxtObj).close();

	}

}
