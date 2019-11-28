package com.class26;

public class WebDriverTest {
	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.refresh();
		chrome.open();
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.refresh();
		firefox.open();
		
		WebDriver driver = new ChromeDriver();
		driver.open();
		driver.refresh();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.open();
		driver1.refresh();
		
		//no access to child specific class through Parent type
		
		

	}
}
