package com.bhavna.MavenTestDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;

public class TestClass {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void beforeAllDemo() {
		System.out.println("before all");
	}

	@Test
	public void testCheckAddition() {
		Calculator obj=new Calculator();
		int actualResult = obj.addition(5, 7);
		assertEquals(12, actualResult);
	}
	@After
    public  void afterAllDemo() {
        System.out.println("after all");
    }
   @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  

}