package org.java;

import com.type.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dropLocation;
	
	@FindBy(id="Submit")
	private WebElement clickSearch;

	public WebElement getDropLocation() {
		return dropLocation;
	}

	public WebElement getClickSearch() {
		return clickSearch;
	}
}
