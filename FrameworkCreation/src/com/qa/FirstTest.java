package com.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver;
	
	@Test
	public void happyFlow() {
		driver  = new ChromeDriver();
		driver.get("Http://www.resume-now.com");
		driver.findElement(By.xpath("(//a[contains(text(),\"Create Resume\")])[1]")).click();
		driver.getTitle();
		driver.manage().window().fullscreen();
		driver.navigate().refresh();
	}
	
	@AfterTest
	public void destroy() {
		driver.quit();
	}
}

