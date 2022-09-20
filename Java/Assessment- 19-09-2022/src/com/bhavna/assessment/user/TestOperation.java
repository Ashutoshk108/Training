package com.bhavna.assessment.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.bhavna.assessment.service.Referral;

class TestOperation {
	@Test
	public void Checkmethod() {
		Referral o1=new Referral("Aman",789654l,"aman@gmail.com",true);
		Referral o2=new Referral("Akash",789654l,"akash@gmail.com",false);
		assertNotEquals(o1,o2);
		
	}
	@BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("before all");
    }



   @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("after all");
    }



   @BeforeEach
    void setUp() throws Exception {
        System.out.println("before each");
    }



   @AfterEach
    void tearDown() throws Exception {
        System.out.println("after each");
    }

}
