package com.bhavna.service1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArrayTester {
	@Test
	@DisplayName("ArrayCheck")
	public void testArrayEquality() {
		int[] arr = {1,2,3,4,5,7};
		MyArray obj = new MyArray();
		assertArrayEquals(arr, obj.getArray());
	}

	@Test
	@DisplayName("ArrayIndex")
	public void testArrayIndexOutOfBound() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			MyArray.dumpArray();
		});

	}
}