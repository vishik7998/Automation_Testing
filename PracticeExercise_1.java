package com.capgemini.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise_1 {

	public static void main(String[] args) {
		   
	   
		System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 String Title=driver.getTitle();
		 int length =driver.getTitle().length();
		 
		 System.out.println("Title is:"+Title);
		 System.out.println("Length of Title is:"+length);
		 
		 if(driver.getCurrentUrl().equalsIgnoreCase("https://www.amazon.in/"))
			 System.out.println("Correct page opened");
		 
		 String pgsrc=driver.getPageSource();
		 int pglength=driver.getPageSource().length();
		 
		 System.out.println("Length of Page is:"+pglength);
		 
	}

}
