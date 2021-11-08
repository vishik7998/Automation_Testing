package com.capgemini.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_12A {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/table");
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6500)");
	
	
		driver.switchTo().frame("frame_Further_simple_examples");
		
		WebElement row = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]"));
		
		List<WebElement> rowValue = row.findElements(By.tagName("td"));

		
		for(WebElement value : rowValue) {
			System.out.println(value.getText());
		}
		
		System.out.println(driver.findElement(By.xpath("//table[3]/tbody/tr[3]/td[4]")).getText());
		
		
		
		driver.close();
		
	}

}