package com.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng {
	@BeforeSuite
	public void Design() {
		// TODO Auto-generated method stub
		System.out.println("Gokul");

	}
	@BeforeTest
	public void Developement() {
		// TODO Auto-generated method stub
		System.out.println("Dicky");
		

	}
	@BeforeClass
	public void deploy() {
		// TODO Auto-generated method stub
		System.out.println("sekar");

	}
	@BeforeMethod
	public void testing() {
		// TODO Auto-generated method stub
		System.out.println("vasu");

	}
	@Test
	public void softwaredevelopement() {
		// TODO Auto-generated method stub
		System.out.println("SDLC");

	}
	@AfterMethod
	public void Design1() {
		// TODO Auto-generated method stub
		System.out.println("Vasu");
		

	}
	@AfterClass
	public void Developement1() {
		// TODO Auto-generated method stub
		System.out.println("Dicky");
		

	}
	@AfterTest
	public void deploy1() {
		// TODO Auto-generated method stub
		System.out.println("sekar");

	}
	@AfterSuite
	public void testing1() {
		// TODO Auto-generated method stub
		System.out.println("Gokul");

	}
}
