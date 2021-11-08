package com.capgemini.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_17 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("books");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).submit();
		
		
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
		
	}

}
