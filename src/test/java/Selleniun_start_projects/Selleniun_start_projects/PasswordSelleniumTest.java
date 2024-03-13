package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertNotEquals;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PasswordSelleniumTest {
	
	static WebDriver browser;
	 
	 @Before
	  public void setup() {
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  	  String url = "https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
		  	  browser.get(url);
	  }
	
	 @Test
	public void CorrectPassword_1() {
		browser.findElement(By.name("characters")).sendKeys("Heba234");
		browser.findElement(By.name("validate")).click();
		String Expected = "Valid Value";
		String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		assertEquals(result,Expected);
	}
	
	 @Test
		public void IncorrectPassword_1() {
			browser.findElement(By.name("characters")).sendKeys("Nad234");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Invalid Value";
			assertEquals(Expected, result);
		}
	
	 @Test
		public void IncorrectPassword_2() {
			browser.findElement(By.name("characters")).sendKeys("Mar2345678");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Invalid Value";
			assertEquals(Expected, result);
		}
	
	 @Test
		public void IncorrectPassword_3() {
			browser.findElement(By.name("characters")).sendKeys("Heba12!");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Invalid Value";
			assertEquals(Expected, result);
		}
	
	 @Test
		public void CorrectPassword_2() {
			browser.findElement(By.name("characters")).sendKeys("hebadef");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
		}
	
	 @Test
		public void Test6() {
			browser.findElement(By.name("characters")).sendKeys("2121920");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
		}

	 @Test
		public void Test7() {
			browser.findElement(By.name("characters")).sendKeys("*******");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
		}

	 @Test
		public void Test8() {
			browser.findElement(By.name("characters")).sendKeys("CaT1***");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
		}
	 
}
