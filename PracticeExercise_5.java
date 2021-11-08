package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_5 {

	public static void main(String[] args) throws Exception {

		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");

		 driver.findElement(By.partialLinkText("Account & Lists")).click();		
		 Thread.sleep(1000);
		 String name=driver.findElement(By.id("continue")).getTagName();
		 System.out.println("name"); 
		 driver.findElement(By.linkText("Privacy Notice")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).click();
	}

}
