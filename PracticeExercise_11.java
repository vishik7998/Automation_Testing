package com.capgemini.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExercise_11 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select/option[1]"));

		Select select = new Select(dropdown);
		if(select.isMultiple())
		{
			System.out.println("It allows here multiple selects.");
		}
		select.selectByIndex(0);
		select.selectByVisibleText("Andean flamingo");
		select.deselectByVisibleText("American flamingo");
		
		List<WebElement> flamingos = select.getOptions();
		for(WebElement flamingo : flamingos) {
			System.out.println(flamingo.getText());
			select.selectByVisibleText(flamingo.getText());
		}
		select.deselectAll();
		
		
		driver.close();

	
  }
}
	


