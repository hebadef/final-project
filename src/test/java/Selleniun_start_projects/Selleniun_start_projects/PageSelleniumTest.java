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
	 
	/*
	 * First name Error
	 * First name too short 
	 */
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
			browser.close();
   }
	
	 /*
	  * Input not passed
	  * Surname provided is too short 
	  */
	@Test
	public void Tests2() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("Nadine");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Kanj");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("19");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("China");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
			browser.close();
   }
	
	 /*
	  * Input passed validation 
	  */
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
			browser.close();
   }
	
	 /*
	  * Input passed validation
	  */
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
			browser.close();
   }
  
	/*
	 * Input passed validation
	 * what is written doesn't make sense!
	 */
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
			browser.close();
   }
	/*
	 * Input passed validation
	 * first name and last name in Hebrew
	 */
	@Test
	public void Tests6() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("היבה");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("דפראויייייי");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("20");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("Egypt");
			textBox = browser.findElement(By.id("notes"));
			textBox.sendKeys(":)");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
			browser.close();
   }
	/*
	 * Input passed validation
	 * first name and last name in Arabic
	 */
	@Test
	public void Tests7() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("نادين");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("كنججججججججج");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("30");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("Turkey");
			textBox = browser.findElement(By.id("notes"));
			textBox.sendKeys(":)");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
			browser.close();
   }
	/*
	 * Input passed validation
	 * first name with symbol
	 */
	@Test
	public void Tests8() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("heba$");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Defrawiiiiii");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("70");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("United States of America");
			textBox = browser.findElement(By.id("notes"));
			textBox.sendKeys(":)");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertNotEquals(currentPage, newPage);
			browser.close();
   }
	/*
	 * Input not passed 
	 * age more than 80
	 */
	@Test
	public void Tests9() {
			WebElement textBox = browser.findElement(By.id("firstname"));
			textBox.sendKeys("Heba");
			textBox = browser.findElement(By.id("surname"));
			textBox.sendKeys("Defrawiiiiii");
			textBox = browser.findElement(By.id("age"));
			textBox.sendKeys("85");
			Select drpCountry = new Select(browser.findElement(By.name("country")));
			drpCountry.selectByVisibleText("United States of America");
			textBox = browser.findElement(By.id("notes"));
			textBox.sendKeys(":)");
			String currentPage=browser.getCurrentUrl();
			browser.findElement(By.cssSelector("input[type='submit']")).click();
			String newPage = browser.getCurrentUrl();
			assertEquals(currentPage, newPage);
			browser.close();
   }

}
