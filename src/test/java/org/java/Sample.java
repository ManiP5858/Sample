package org.java;
import org.openqa.selenium.WebElement;

import com.type.*;
public class Sample extends BaseClass {
	public static void main(String[] args) {
		
		BaseClass cc  = new BaseClass();
		cc.getdriver();
		cc.maximizewindow();
		cc.geturl("https://adactinhotelapp.com/");
		
		LoginPage page = new LoginPage();
		WebElement txtUsername = page.getTxtUsername();
//		cc.Sendkeys(txtUsername, "Welcome");
		
		driver.navigate().refresh();
		cc.Sendkeys(txtUsername, "infantjames29");
		
		WebElement txtPassword = page.getTxtPassword();
		cc.Sendkeys(txtPassword, "Bruno1029$");
		
		WebElement btnClick = page.getBtnClick();
		cc.elementClick(btnClick);
		
		SearchHotel ss = new SearchHotel();
//		ss.geturl("https://adactinhotelapp.com/SearchHotel.php");
		WebElement dropLocation = ss.getDropLocation();
		ss.allOptionsDropdownByText(dropLocation, "Paris");
		WebElement clickSearch = ss.getClickSearch();
		ss.elementClick(clickSearch);
		
		
		SelectHotel sh = new SelectHotel();
		WebElement radio = sh.getRadio();
		sh.elementClick(radio);
		
		WebElement continue1 = sh.getContinue();
		sh.elementClick(continue1);
		
		BookDetails bd = new BookDetails();
		WebElement firstName = bd.getFirstName();
		bd.Sendkeys(firstName, "Mani");
		
		WebElement lastName = bd.getLastName();
		bd.Sendkeys(lastName, "P");
		
		WebElement address = bd.getAddress();
		bd.Sendkeys(address, "Near Greens");
		
		WebElement criditCard = bd.getCriditCard();
		bd.Sendkeys(criditCard, "7878654567543456");
		
		WebElement ccType = bd.getCCType();
		bd.allOptionsDropdownByAttribute(ccType, "VISA");
		
		WebElement date = bd.getDate();
		bd.SelectOptionByText(date, "January");
		
		WebElement year = bd.getYear();
		bd.SelectOptionByText(year, "2022");
		
		WebElement cvVno = bd.getCVVno();
		bd.Sendkeys(cvVno, "087");
		
		WebElement clickBook = bd.getClickBook();
		bd.elementClick(clickBook);
		
		
		
		
		
		
		
		
		
		
	}

}
