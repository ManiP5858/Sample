package com.type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterss extends BaseClass {

	@BeforeClass
	public static void beforeclass() {
		BaseClass a = new BaseClass();
		a.getdriver();
		a.maximizewindow();
		a.geturl("https://adactinhotelapp.com/");

	}

	@Parameters({ "username", "password" })
	@Test
	private void tc01(@Optional("infantjames29") String user, @Optional("Bruno1029$") String pass) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(user);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);

		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@Test
	private void tc02() {
		WebElement dropLoction = driver.findElement(By.id("location"));
		Select select = new Select(dropLoction);
		select.selectByValue("Sydney");

		WebElement btnclick = driver.findElement(By.id("Submit"));
		btnclick.click();

	}

	@Test
	private void tc03() {
		WebElement selecthotel = driver.findElement(By.id("radiobutton_1"));
		selecthotel.click();

		WebElement btncontinue = driver.findElement(By.id("continue"));
		btncontinue.click();

	}

	
	@Test
	private void tc04() {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Mani");

		WebElement Lastname = driver.findElement(By.id("last_name"));
		Lastname.sendKeys("P");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Near OMR");

		WebElement ccno = driver.findElement(By.id("cc_num"));
		ccno.sendKeys("8778675645678659");

		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select select = new Select(cctype);
		select.selectByValue("VISA");
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select sel = new Select(month);
		sel.selectByIndex(4);


		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select se = new Select(year);
		se.selectByValue("2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("088");

		WebElement btn = driver.findElement(By.id("book_now"));
		btn.click();

	}
}
