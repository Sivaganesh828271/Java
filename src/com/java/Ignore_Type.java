package com.java;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Type {
	@Test
	private void Mumbaiindians() {
		// TODO Auto-generated method stub
		System.out.println("Rohit");

	}
	@Test
	private void csk() {
		// TODO Auto-generated method stub
		System.out.println("Dhoni");

	}
	
	@Ignore
	@Test
	private void rcb() {
		// TODO Auto-generated method stub
		System.out.println("Virat");

	}
	@Test(enabled=false)
	private void Gujarat() {
		// TODO Auto-generated method stub
		System.out.println("Pandya");

	}

}
