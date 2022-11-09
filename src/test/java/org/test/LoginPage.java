package org.test;
import com.type.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
			}
	@BeforeClass
	public static void beforeclass() {
		BaseClass a = new BaseClass();
		a.getdriver();
		a.maximizewindow();
		a.geturl("https://adactinhotelapp.com/");

	}
	@Test
	private void tc02() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Mani5858");
		String text = username.getText();
		Assert.assertEquals(text, username);
		System.out.println("Succesfully");
		
	}
	

}
