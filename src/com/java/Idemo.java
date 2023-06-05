package com.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Idemo {
	@Test
	public void pass() {
		// TODO Auto-generated method stub
		String a = "Siva";
		String b = "Siva";
		Assert.assertEquals(b, a);
		

	}
	@Test(retryAnalyzer=Rerun.class)
	public void fail() {
		// TODO Auto-generated method stub
		int a1 = 14;
		int b1 = 24;
		Assert.assertEquals(b1, a1);

	}

}
