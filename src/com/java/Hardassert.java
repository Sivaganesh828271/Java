package com.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {
	@Test
	private void testmethod() {
		// TODO Auto-generated method stub
		String expected ="xcelcorp";
		String actual =null;
		Assert.assertNotEquals(actual, expected);
		Assert.assertNotNull(expected);
		System.out.println("validation");

	}
	
	

}
