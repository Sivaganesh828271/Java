package com.java;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {
	int s = 0;
	int end = 3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (s<end) {
			s++;
			return true;
			
		}
		return false;
	}

}
