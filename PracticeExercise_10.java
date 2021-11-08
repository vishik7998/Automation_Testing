package com.capgemini.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExercise_10 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms11.htm");
		WebElement dropDown = driver.findElement(By.xpath("//td[3]/select"));
		Select dropSelect = new Select(dropDown);
		dropSelect.selectByIndex(2);
		

		WebElement dropDown2 = driver.findElement(By.xpath("//table[5]/tbody/tr/td/table/tbody/tr/td/select"));
		Select dropSelect2 = new Select(dropDown2);
		dropSelect2.selectByVisibleText("Hot Bread");
		
		List<WebElement> drops = dropSelect2.getOptions();
		
		for(WebElement dp : drops) {
			System.out.println(dp.getText());
		}
		
		driver.close();
	}

}




