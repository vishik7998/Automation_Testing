package com.capgemini.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_9 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://materializecss.com/radio-buttons.html");
		
		driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[2]/label/span")).isSelected();
		// for css right click inspect,right click copy->copy selector
		driver.findElement(By.cssSelector("#radio>form>p:nth-child(2)>label>span")).click();
		driver.findElement(By.cssSelector("#radio > form > p:nth-child(3) > label > span")).click();	
		}

}
