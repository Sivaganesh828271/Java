package com.java;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterized_Test {
	@Test()
	@Parameters({"Username","password"})
	private void credentials(@Optional("shiv")String username,String password) {
		// TODO Auto-generated method stub
		System.out.println("The username is :"+username);
		System.out.println("The password is :"+password);

	}

}
