package com.bhavna.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.bhavna.assessment.Referral;

class TestOperation {
	@Test
	@DisplayName("TestAddReferral()")
	public void testmethod() {
		Referral tester=new Referral();
		tester.addReferral("Aman","86545656","aman@gmail.com");
		assertNotNull(Referral.referralLst);
	}
	@Test
	@DisplayName("TestViewReferral()")
	public void testView() {
		Referral tester=new Referral();
		tester.viewReferral();
		assertNotNull(Referral.referralLst);
	}
	
	@Test
	@DisplayName("TestEditReferral()")
	public void testEdit() {
		Referral tester=new Referral();
		Referral tester1=tester;
		tester.editReferral("Aman","1234565","Aman@gmail.com");
		tester.viewReferral();
		tester1.viewReferral();
		assertSame(tester,tester1);
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
