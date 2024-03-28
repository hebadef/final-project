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
		String result= browser.findElement(By.name("validation_message")).toString();
		assertNotEquals(result,Expected);
		browser.close();
		
	}
				 @Test
		public void CorrectPassword_2() {
			browser.findElement(By.name("characters")).sendKeys("hebadef");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
			browser.close();
		}
			 @Test
		public void CorrectPassword_3() {
			browser.findElement(By.name("characters")).sendKeys("2121920");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
			browser.close();
		}
		
	 @Test
		public void CorrectPassword_4() {
			browser.findElement(By.name("characters")).sendKeys("*******");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
			browser.close();
		}
			 @Test
		public void CorrectPassword_5() {
			browser.findElement(By.name("characters")).sendKeys("CaT1***");
			browser.findElement(By.name("validate")).click();
			String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
			String Expected = "Valid Value";
			assertEquals(Expected, result);
			browser.close();
		}
	 @Test
		public void IncorrectPasswordMoreThan7() {
			 browser.findElement(By.name("characters")).sendKeys("Heba2345");
			 browser.findElement(By.name("validate")).click();
			 String Expected ="Invalid Value";
			 String result = browser.findElement(By.name("validation_message")).toString();
			 assertNotEquals(result,Expected);
			 browser.close();
		}
	 @Test
		public void IncorrectPasswordLessThan7() {
			 browser.findElement(By.name("characters")).sendKeys("Nadin2");
			 browser.findElement(By.name("validate")).click();
			 String Expected ="Invalid Value";
			 String result = browser.findElement(By.name("validation_message")).toString();
			 assertNotEquals(result,Expected);
			 browser.close();
		}
	 @Test
		public void Incorrect_inappropriateLetters() {
			 browser.findElement(By.name("characters")).sendKeys("Nadin2@");
			 browser.findElement(By.name("validate")).click();
			 String Expected ="Invalid Value";
			 String result = browser.findElement(By.name("validation_message")).toString();
			 assertNotEquals(result,Expected);
			 browser.close();
		}
	 @Test
		public void Incorrect_inappropriateLetters2() {
			 browser.findElement(By.name("characters")).sendKeys("678Mar%");
			 browser.findElement(By.name("validate")).click();
			 String Expected ="Invalid Value";
			 String result = browser.findElement(By.name("validation_message")).toString();
			 assertNotEquals(result,Expected);
			 browser.close();
		}
	 @Test
		public void Incorrect_inappropriateLetters3() {
			 browser.findElement(By.name("characters")).sendKeys("Heba19^");
			 browser.findElement(By.name("validate")).click();
			 String expectedValue="Invalid Value";
			 String result= browser.findElement(By.name("validation_message")).toString();
			 assertNotEquals(result,expectedValue);
			 browser.close();
		}
 
 
}
