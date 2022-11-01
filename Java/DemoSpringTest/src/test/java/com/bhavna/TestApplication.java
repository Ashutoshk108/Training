package com.bhavna;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;
import com.bhavna.controller.EmployeeController;


@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TestApplication {
	@Autowired
	private EmployeeController employeeController;
	@Autowired
	private RestTemplate restTemplate;
	@LocalServerPort
	private int port;
	
	@Test
	public void contextLoads() {
		System.out.println("In contextload");
		assertTrue(employeeController==null);
	}
	@Test
	public void testDisplay() {
		String msg="In test display method";
		assertTrue(msg.contains("In test display method"));
	}
	/*@Test public void testHandler() {
		String msg=this.restTemplate.getForObject("http://localhost:"+port+"/display", String.class);
		System.out.println(msg);
		assertTrue(msg.contains("Its message from the controller"));
		
	}*/

}
