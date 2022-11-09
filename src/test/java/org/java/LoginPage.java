package org.java;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Sample {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnClick;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	
	
	
	
	
	
	

}
