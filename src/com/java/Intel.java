package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Intel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\XSC--10259\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://portal.intelschool.in/register");
		driver.manage().window().maximize();
		WebElement institute = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		institute.sendKeys("DMI College of Engineering");
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		city.sendKeys("chennai");
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("No-11,sri lakshmi nagar,2nd cross");
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("Alwarthiru nagar @%@chennai-87");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.name("reg_states"));
		Select s = new Select(state);
		s.selectByVisibleText("Tamil Nadu");
		//WebElement submit = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		//submit.click();
		
		//driver.quit();i
	}

}
