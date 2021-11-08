package com.capgemini.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_19 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
		
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("/html/body/form/input")).click();
		
		Alert inputBox = driver.switchTo().alert();
		
		System.out.println(inputBox.getText());
		
		inputBox.sendKeys("Swarada");
		
		inputBox.accept();
	}

}
