package com.type;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ReUsableM extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		ReUsableM n = new ReUsableM();
		n.booking();
	}

	private void booking() throws IOException, InterruptedException {

		getdriver();
		geturl("http://www.adactinhotelapp.com/");
		maximizewindow();
	
		WebElement findLocatorById = findLocatorById("username");
		String dataFromCell = getDataFromCell("Sheet1", 1, 0);
		Sendkeys(findLocatorById, dataFromCell);
		
		WebElement txtPassword = findLocatorById("password");
		String pass = getDataFromCell("Sheet1", 1, 1);
		Sendkeys(txtPassword, pass);

		WebElement btnLogin = findLocatorById("login");
		elementClick(btnLogin);

		WebElement location = findLocatorById("location");
		String location1 = getDataFromCell("Sheet1", 1, 2);
		SelectOptionByAttribute(location, location1);

		WebElement hotel = findLocatorById("hotels");
		String hotel1 = getDataFromCell("Sheet1", 1, 3);
		SelectOptionByAttribute(hotel, hotel1);

		WebElement roomtype = findLocatorByName("room_type");
		String roomtype1 = getDataFromCell("Sheet1", 1, 4);
		SelectOptionByAttribute(roomtype, roomtype1);

		WebElement roomnos = findLocatorByName("room_nos");
		String roomno1 = getDataFromCell("Sheet1", 1, 5);
		SelectOptionByAttribute(roomnos, roomno1);

		WebElement chkIn = findLocatorById("datepick_in");
		String chkIn1 = getDataFromCell("Sheet1", 1, 6);
		Sendkeys(chkIn, chkIn1);

		WebElement chkOut = findLocatorById("datepick_out");
		String chkOut1 = getDataFromCell("Sheet1", 1, 7);
		Sendkeys(chkOut, chkOut1);

		WebElement adRoom = findLocatorByName("adult_room");
		String adRoom1 = getDataFromCell("Sheet1", 1, 8);
		SelectOptionByAttribute(adRoom, adRoom1);

		WebElement chRoom = findLocatorByName("child_room");
		String chRoom1 = getDataFromCell("Sheet1", 1, 9);
		SelectOptionByAttribute(chRoom, chRoom1);

		WebElement btnLogin1 = findLocatorByName("Submit");
		elementClick(btnLogin1);

		WebElement btnLogin11 = findLocatorByName("radiobutton_0");
		elementClick(btnLogin11);

		WebElement btnLogin111 = findLocatorByName("continue");
		elementClick(btnLogin111);

		WebElement firstName = findLocatorById("first_name");
		String firstName1 = getDataFromCell("Sheet1", 1, 10);
		Sendkeys(firstName, firstName1);

		WebElement lastName = findLocatorById("last_name");
		String lastName1 = getDataFromCell("Sheet1", 1, 11);
		Sendkeys(lastName, lastName1);

		WebElement addr = findLocatorById("address");
		String addr1 = getDataFromCell("Sheet1", 1, 12);
		Sendkeys(addr, addr1);

		WebElement ccNum = findLocatorById("cc_num");
		String ccNum1 = getDataFromCell("Sheet1", 1, 13);
		Sendkeys(ccNum, ccNum1);

		WebElement cardType = findLocatorById("cc_type");
		String cardType1 = getDataFromCell("Sheet1", 1, 14);
		SelectOptionByAttribute(cardType, cardType1);

		WebElement expMonth = findLocatorById("cc_exp_month");
		String expMonth1 = getDataFromCell("Sheet1", 1, 15);
		SelectOptionByAttribute(expMonth, expMonth1);

		WebElement expYear = findLocatorById("cc_exp_year");
		String expYear1 = getDataFromCell("Sheet1", 1, 16);
		SelectOptionByAttribute(expYear, expYear1);

		WebElement cvv = findLocatorByName("cc_cvv");
		String cvv1 = getDataFromCell("Sheet1", 1, 17);
		Sendkeys(cvv, cvv1);

		WebElement bookNow = findLocatorByName("book_now");
		elementClick(bookNow);

		Thread.sleep(30000);

		WebElement order = findLocatorById("order_no");
		String value = getAttributeValue(order);
		writeData("Sheet1", 1, 18, value);

	}
}