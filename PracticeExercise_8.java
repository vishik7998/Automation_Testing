package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_8 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moto");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 WebElement check=driver.findElement(By.id("p_90/6741118031"));
		 check.click();
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
		 driver.findElement(By.id("priceblock_ourprice")).getText()
	 
	 )
	
	}

}
