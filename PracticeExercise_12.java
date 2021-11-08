package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeExercise_12 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 
		 ((JavascriptExecutor) driver).executeScript("scroll(0,350)");
		 
		 WebElement we =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[6]/div/div[1]/h2"));
		 Actions action = new Actions(driver);
		 action.moveToElement(we).perform();
		 
	}

}


