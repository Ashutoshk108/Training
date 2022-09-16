package com.bhavna.service1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class TestOperationTask2 {
	@ParameterizedTest
	@ValueSource(ints = {10,15,20,25})
	@DisplayName("ParameterisedValueSource")
	public void testCheckValueSource(int num) {
		OperationTwo o1=new OperationTwo();
		assertEquals(true,o1.isEven(num));
	}
	
	@ParameterizedTest
	@CsvSource({"10,true","15,false","20,true","25,false","30,true"})
	@DisplayName("ParameterisedCsvSource")
	public void testCheckCsvSourceValue(int num, boolean value) {
		OperationTwo o1=new OperationTwo();
		assertEquals(value,o1.isEven(num));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources="D:\\temp.csv")
	@DisplayName("ParameterisedCsvFileSource")
	public void testCheckCsvFileSourceValue(int num, boolean value) {
		OperationTwo o1=new OperationTwo();
		assertEquals(value,o1.isEven(num));
	}
	
	@Test
	@DisplayName(value = "ArrayIndexOutOfBound")
	public void testArrayIndexOutOfBound() {
		OperationTwo arr=new OperationTwo();
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			arr.demoArray();
		});

	}
	
}
/*
Write a program to demonstrate use of @ParameterizedTest annotation with follwing
1.@ValueSource
2.@CsvSource
3.@CsvFileSource
Write program to test exception for ArrayIndexOutofBounds Exception
 */
