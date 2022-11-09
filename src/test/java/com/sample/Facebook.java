package com.sample;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	static WebDriver driver;
	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void after() throws IOException {
		Date d = new Date();
		System.out.println(d);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(name.getMethodName() + ".png"));
	}

	@Test
	public void M01() {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Mani585");
	}

	@Test
	public void M03() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@Test
	public void M02() {
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("mani5757");
	}

	@AfterClass
	public static void afterclass() {
		driver.close();

	}
}
