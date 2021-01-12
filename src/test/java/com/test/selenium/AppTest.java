package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {

	WebDriver driver;

 
 @BeforeTest
  public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.get("http://18.222.71.5:32768//");
  }
  @Test
  public void verifyHomepageTitle() {
      driver.findElement(By.id("About Us")).click();
 }
  @AfterTest
  public void terminateBrowser(){
     // driver.close();
  }
}
