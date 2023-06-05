package com.java;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="fruits")
	private void orange() {
		// TODO Auto-generated method stub
		System.out.println("Orange");

	}
	@Test(groups="fruits")
	private void banana() {
		// TODO Auto-generated method stub
		System.out.println("banana");

	}
	@Test(groups="fruits")
	private void grapes() {
		// TODO Auto-generated method stub
		System.out.println("grapes");

	}
	@Test(groups="Vegetables")
	private void onion() {
		// TODO Auto-generated method stub
		System.out.println("onion");

	}
	@Test(groups="Vegetables")
	private void tomato() {
		// TODO Auto-generated method stub
		System.out.println("Tomato");

	}
	@Test(groups="color")
	private void red() {
		// TODO Auto-generated method stub
		System.out.println("Red");

	}
	@Test(groups="color")
	private void blue() {
		// TODO Auto-generated method stub
		System.out.println("Blue");

	}
	
	
	

}
