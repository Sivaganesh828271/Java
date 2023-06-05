package com.java;

import org.testng.annotations.Test;

public class Expected_Exception1 {
	@Test(expectedExceptions=NullPointerException.class)
	private void sample() {
		// TODO Auto-generated method stub
		String a = null;
		int l = a.length();
        System.out.println(l);
	}

}
