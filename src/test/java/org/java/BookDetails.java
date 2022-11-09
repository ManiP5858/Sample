package org.java;

import com.type.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookDetails extends BaseClass {
	public BookDetails() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement FirstName;
	
	@FindBy(id = "last_name")
	private WebElement LastName;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id = "cc_num")
	private WebElement CriditCard;
	
	@FindBy(id = "cc_type")
	private WebElement CCType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement Date;
	
	@FindBy(id = "cc_exp_year")
	private WebElement Year;
	
	@FindBy(id = "cc_cvv")
	private WebElement CVVno;
	
	@FindBy(id="book_now")
	private WebElement ClickBook;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCriditCard() {
		return CriditCard;
	}

	public WebElement getCCType() {
		return CCType;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getCVVno() {
		return CVVno;
	}

	public WebElement getClickBook() {
		return ClickBook;
	}
	
}
