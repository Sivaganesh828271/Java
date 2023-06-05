package com.java;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	private void testmethod() {
		// TODO Auto-generated method stub
		String expected = "hello";
		String actual = "Hello world";
		SoftAssert a = new SoftAssert();
		a.assertEquals(actual, expected);
		System.out.println("verification");

	}

}
