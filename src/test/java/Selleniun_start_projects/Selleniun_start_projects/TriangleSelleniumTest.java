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

public class TriangleSelleniumTest {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  	  String url = "https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
		      browser.get(url);
		
	  }
	 
	 @Test
		public void NotATriangle_1() {
			browser.findElement(By.name("side1")).sendKeys("1");
			browser.findElement(By.name("side2")).sendKeys("2");
			browser.findElement(By.name("side3")).sendKeys("3");
			browser.findElement(By.id("identify-triangle-action")).click();
			String Expected = "Error: Not a Triangle";
			String result = browser.findElement(By.id("triangle-type")).toString();	
			assertNotEquals(result,Expected);
			browser.close();
		}

	 @Test
		public void Scalene() {
			browser.findElement(By.name("side1")).sendKeys("2");
			browser.findElement(By.name("side2")).sendKeys("5");
			browser.findElement(By.name("side3")).sendKeys("6");
			browser.findElement(By.id("identify-triangle-action")).click();
			String Expected = "Scalene";
			String result = browser.findElement(By.id("triangle-type")).toString();	
			assertNotEquals(result,Expected);
			browser.close();
		}
		 
	 @Test
		public void Isosceles_1() {
			browser.findElement(By.name("side1")).sendKeys("5");
			browser.findElement(By.name("side2")).sendKeys("4");			
			browser.findElement(By.name("side3")).sendKeys("4");
			browser.findElement(By.id("identify-triangle-action")).click();
			String Expected = "Isosceles";
			String result = browser.findElement(By.id("triangle-type")).toString();	
			assertNotEquals(result,Expected);
			browser.close();
		}
	
	 @Test
		public void Isosceles_2() {
			browser.findElement(By.name("side1")).sendKeys("10");
			browser.findElement(By.name("side2")).sendKeys("5");
			browser.findElement(By.name("side3")).sendKeys("10");
			browser.findElement(By.id("identify-triangle-action")).click();
			String Expected = "Isosceles";
			String result = browser.findElement(By.id("triangle-type")).toString();	
			assertNotEquals(result,Expected);
			browser.close();
		}
	 
	 
	 @Test
		public void Isosceles_3() {
			browser.findElement(By.name("side1")).sendKeys("3");
			browser.findElement(By.name("side2")).sendKeys("3");
			browser.findElement(By.name("side3")).sendKeys("2");
			browser.findElement(By.id("identify-triangle-action")).click();
			String Expected = "Isosceles";
			String result = browser.findElement(By.id("triangle-type")).toString();	
			assertNotEquals(result,Expected);
			browser.close();
		}
	  
	 @Test
		public void Equilateral() {
			browser.findElement(By.name("side1")).sendKeys("8");
			browser.findElement(By.name("side2")).sendKeys("8");
			browser.findElement(By.name("side3")).sendKeys("8");
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();	
			String Expected = "Equilateral";
			assertNotEquals(Expected,result);
			browser.close();
		} 

	 @Test
		public void NotATriangle_2() {
			browser.findElement(By.name("side1")).sendKeys("4");
			browser.findElement(By.name("side2")).sendKeys("2");
			browser.findElement(By.name("side3")).sendKeys("2");
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();	
			String Expected = "Error: Not a Triangle";
			assertNotEquals(Expected,result);
			browser.close();
		}
	 	
	 @Test
		public void NotATriangle_3() {
			browser.findElement(By.name("side1")).sendKeys("5");
			browser.findElement(By.name("side2")).sendKeys("15");
			browser.findElement(By.name("side3")).sendKeys("5");
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();	
			String Expected = "Error: Not a Triangle";
			assertNotEquals(Expected,result);
			browser.close();
		}
	 
	 @Test
		public void NotATriangle_4() {
			browser.findElement(By.name("side1")).sendKeys("3");
			browser.findElement(By.name("side2")).sendKeys("3");
			browser.findElement(By.name("side3")).sendKeys("10");
			browser.findElement(By.id("identify-triangle-action")).click();
			String result = browser.findElement(By.id("triangle-type")).toString();	
			String Expected = "Error: Not a Triangle";
			assertNotEquals(Expected,result);
			browser.close();
		}
	 
	 
	 

	 
}
