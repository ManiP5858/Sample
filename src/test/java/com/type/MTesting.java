package com.type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MTesting extends BaseClass {
	@BeforeClass
	private void tc01() {
		BaseClass a = new BaseClass();
		a.getdriver();
		a.maximizewindow();
		a.geturl("https://www.facebook.com/");
	}

	@Test

	private void tc02() {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Mani5858");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("mani5858");

	}

}

