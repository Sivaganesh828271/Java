package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		//Property setting
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\XSC--10259\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");
		//Browser launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://guidejuniors.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(2500);
		
		
		WebElement write = driver.findElement(By.xpath("//button[text()='Write Now']"));
		write.click();
		Thread.sleep(2500);
		
		
				
		
	

	}

}
