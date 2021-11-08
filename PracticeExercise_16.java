package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_16 {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Books");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).submit();
		
		String parentWin = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Think ")).click();
		
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(parentWin);
		
		driver.findElement(By.partialLinkText("You Only")).click();
		System.out.println(driver.getWindowHandles());
		

	}

}
