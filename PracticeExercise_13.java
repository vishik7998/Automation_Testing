package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeExercise_13 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		
		// drag bank box below
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		Actions action= new Actions(driver);
		action.dragAndDrop(From, To).build().perform();

	}

	
}
