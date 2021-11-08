package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_7 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
		 WebElement e= driver.findElement(By.name("submit"));
		 boolean status=e.isEnabled();
		 //Button is enabled then print true or id disabled print false by using status
		 System.out.println("Status of button:"+status);
		 
		 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/button")).click();
		 System.out.println("Submit button is disabled before entring firstname and lastname");
		 driver.findElement(By.id("firstName")).sendKeys("abcd");
		 driver.findElement(By.id("lastName")).sendKeys("efgh");

		 WebElement e1= driver.findElement(By.name("submit"));
		 boolean status1=e1.isEnabled();
		 //Button is enabled then print true or id disabled print false by using status
		 System.out.println("Status of button:"+status);
	}

}

