package Selleniun_start_projects.Selleniun_start_projects;
import org.junit.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Before;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.Thread;
import org.openqa.selenium.support.ui.Select;


public class PageSelleniumTest {
	 
	
	 static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		      String url = "https://testpages.eviltester.com/styled/validation/input-validation.html";
		      browser.get(url);
	  }
	 
	// Firstname too short 
	@Test
	public void Tests1() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("Heba");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Defrawiiiiii");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("18");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("Greece");
			textBox = browser.findElement(By.id("notes"));
			textBox.sendKeys("Hi I'm Heba Defrawi");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
   }
	
	 // Surname provided is too short
	@Test
	public void Tests2() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("Nadin");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Kang");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("19");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("China");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
   }
	
	 //Input passed validation
	@Test
	public void Tests3() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("Maryan");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Halounnnnnnn");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("22");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("Israel");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
   }
	
	 //Input passed validation
	@Test
	public void Tests4() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("Albert");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Einsteinnnn");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("76");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("Germany");
			textBox = browser.findElement(By.id("notes"));
			textBox.sendKeys("Hi I'm Albert Einstein");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
   }
  
	//Input passed validation through even though what is written doesn't make sense!
	@Test
	public void Tests5() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("789987");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("23456788900987");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("18");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("Hungary");
			textBox = browser.findElement(By.id("notes"));
			textBox.sendKeys(":)");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
   }

}
