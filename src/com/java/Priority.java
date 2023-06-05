package com.java;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=5)
public void Lunch() {
	// TODO Auto-generated method stub
	System.out.println("meals");

}
	@Test(priority=-1)
public void breakfast() {
	// TODO Auto-generated method stub
	System.out.println("Idly");

}
	@Test(priority=7,invocationCount=4)
public void dinner() {
	// TODO Auto-generated method stub
	System.out.println("chappathi");

}

}
