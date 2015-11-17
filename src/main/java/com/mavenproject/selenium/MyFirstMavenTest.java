package com.mavenproject.selenium;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstMavenTest {
	
	@Test
	public void StartWebDriver(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bitwiseglobal.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		assertEquals("Bitwise", driver.getTitle());
		assertEquals("Bitwise", driver.getTitle());
		driver.close();
		
	}
	
	@Test
	public void StartWebDriver2(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bitwiseglobal.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		assertEquals("Bitwise", driver.getTitle());
		
		driver.close();
		
		
	}
	
	@Test
	public void StartWebDriver4(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bitwiseglobal.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		assertEquals("Bitwise", driver.getTitle());
		
		driver.close();
		
		
	}


}
 