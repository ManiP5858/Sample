package tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing3 {
	@Test(dataProvider="LoginDatas",dataProviderClass=Testing2.class)
	private void tc01(String user,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}

}
