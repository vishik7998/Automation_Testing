package com.capgemini.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_6 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		 driver.get("");
	}

}
