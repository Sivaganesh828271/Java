package com.java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider="input")
	private void testdata(String username,String pass) {
		// TODO Auto-generated method stub
		System.out.println(username);
		System.out.println(pass);

	}
	@DataProvider
	private Object[][] input() {
		// TODO Auto-generated method stub
		return new Object[][] {
			{"siva","123"},
			{"siva1","234"}
			
			
			
		};
		

	}

}
