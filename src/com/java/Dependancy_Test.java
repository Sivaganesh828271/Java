package com.java;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependancy_Test {
	@Test(dependsOnMethods="jarFile1")
	private void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Testing tool");

	}
	
	@Test
	private void jarFile1() {
		// TODO Auto-generated method stub
		System.out.println("Selenium requires jar file");

	}
	@Ignore
	@Test
	private void jdktool() {
		// TODO Auto-generated method stub
		System.out.println("Java developement kit");

	}

}
