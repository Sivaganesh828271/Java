package com.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Testng{
public static WebDriver driver;
@BeforeClass
	public void browserlaunch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XSC--10259\\eclipse-workspace\\Java\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://guidejuniors.com/");
		driver.manage().window().maximize();

	}
@Test
	public void functions() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
		WebElement ourstory = driver.findElement(By.xpath("//a[text()='Our Story']"));
		ourstory.click();
		WebElement founder = driver.findElement(By.xpath("//a[text()='Founder']"));
		founder.click();
		WebElement blog = driver.findElement(By.xpath("//a[text()='Blog']"));
		blog.click();
		driver.navigate().back();//
		Thread.sleep(2000);
		WebElement contact = driver.findElement(By.xpath("//a[text()='Contact']"));
		contact.click();
		Actions a = new Actions(driver);
		a.doubleClick(contact).build().perform();


	}
/*@AfterClass
public void exit() {
	// TODO Auto-generated method stub
	driver.close();

}*/

}
