package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static WebDriver driver;

	public void getDriver(String browser) {
		switch ("browser") {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("The Browser Name is Invalid");
			break;
		}
		driver.manage().window().maximize();
	}
	public void getUrl(String url) {
	    driver.get(url);
	}
}