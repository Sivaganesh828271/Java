package com.java;

import org.testng.annotations.Test;

public class Timeout_Test {
	@Test(timeOut=3000)
	private void login() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		System.out.println("Browser launch");
		Thread.sleep(2000);
		System.out.println("Url launch");
		System.out.println("username");
		System.out.println("password");
		System.out.println("login");
		

	}
	

}
