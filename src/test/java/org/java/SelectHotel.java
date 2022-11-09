package org.java;
import com.type.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
		public SelectHotel() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="radiobutton_1")
		private WebElement radio;
		
		@FindBy(id="continue")
		private WebElement Continue;

		public WebElement getRadio() {
			return radio;
		}

		public WebElement getContinue() {
			return Continue;
		}
		
		
	}


