package com.type;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.KeyStore.Entry.Attribute;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.functors.ExceptionClosure;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void maximizewindow() {
		driver.manage().window().maximize();
	}

	public void Sendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void elementClick(WebElement element) {
		element.click();
	}

	public WebElement findLocatorById(String attributeValue) {
		WebElement element1 = driver.findElement(By.id(attributeValue));
		return element1;
	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element1 = driver.findElement(By.name(attributeValue));
		return element1;
	}

	public WebElement findLocatorByXpath(String Xpath) {
		WebElement element1 = driver.findElement(By.xpath(Xpath));
		return element1;
	}

	public WebElement findLocatorByClassName(String attribute) {
		WebElement element1 = driver.findElement(By.className(attribute));
		return element1;
	}

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getApplnUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void closeWindow() {
		driver.close();
	}

	public static void quitWindow() {
		driver.quit();
	}

	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void SelectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void SelectOptionByAttribute(WebElement hotel1, String value) {
		Select select = new Select(hotel1);
		select.selectByValue(value);
	}

	public void SelectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public void simpleAlert(WebElement element) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void confirmAlert(WebElement element) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String promptAlert(WebElement element, String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("data");
		alert.accept();
		alert.dismiss();
		return data;
	}

	public void elementSendkeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value',+ 'data')");
	}

	public void elementClickJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()");
	}

	public void launchBrowser(String key, String value) {
		System.setProperty("key", "value");
		WebDriver driver = new ChromeDriver();
	}

	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void frameById(String attributename) {
		driver.switchTo().frame(attributename);
	}

	public void allOptionsDropdownByText(WebElement element, String data) {
		Select select = new Select(element);
		List<WebElement> all = select.getOptions();
		for (WebElement option : all) {
			String text = option.getText();
			select.selectByVisibleText(text);
		}
	}

	public void allOptionsDropdownByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		List<WebElement> all = select.getOptions();
		for (WebElement option : all) {
			String text = option.getAttribute(value);
			select.selectByValue(value);
		}
	}

	public void firstSelectedOptionDropdown(WebElement element, String data) {
		Select select = new Select(element);
		WebElement element1 = select.getFirstSelectedOption();
		String text = element1.getText();
		System.out.println(text);
	}

	public void multiSelectOptionDropDown(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
	}

	public void implicitWait(int Long) {
		driver.manage().timeouts().implicitlyWait(Long, TimeUnit.SECONDS);
	}

	public WebElement isDisplayed(WebElement element, String attributeValue) {
		WebElement element1 = driver.findElement(By.id(attributeValue));
		boolean displayed = element1.isDisplayed();
		return element1;
	}

	public WebElement isEnabled(WebElement element, String attributeValue) {
		WebElement element1 = driver.findElement(By.id(attributeValue));
		boolean Enabled = element1.isEnabled();
		return element1;
	}

	public WebElement isSelected(WebElement element, String attributeValue) {
		WebElement element1 = driver.findElement(By.id(attributeValue));
		boolean Selected = element1.isSelected();
		return element1;
	}

	public void deSelectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deSelectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectAll(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void onlySelectedOption(WebElement element, String data) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement option : allSelectedOptions) {
			String text = option.getText();
			System.out.println(text);
		}
	}

	public void getParentWindow(String data) {
		String parent = driver.getWindowHandle();
		System.out.println(parent);
	}

	public void getAllWindows(String data) {
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!parent.equals(x)) {
				driver.switchTo().window(x);
			}
		}
	}

	public void clearTextBox(WebElement element, String data) {
		WebElement element1 = driver.findElement(By.id(data));
		element1.sendKeys(data);
		element1.clear();
	}

	public void screenShot(WebElement element) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	}

	public void scrrenshotForElement(WebElement element, String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(path);
		FileUtils.copyFile(screenshotAs, file);
	}

	public void singleMouseOverAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void DragandDrop(WebElement element) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, element).perform();
	}

	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public String getDataFromCell(String sheetName, int rownum, int cellnum) throws IOException {
		String res = "";
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Name\\Excel Formate\\Day3.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long check = Math.round(numericCellValue);
				if (numericCellValue == check) {
					res = String.valueOf(check);
				} else {
					res = String.valueOf(numericCellValue);
				}
			}

		default:
			break;

		}

		return res;

	}

	public void writeData(String sheetName, int rownum, int cellnum, String data) throws IOException {
		File file1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Name\\Excel Formate\\Day3.xlsx");
		FileInputStream stream = new FileInputStream(file1);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream output = new FileOutputStream(file1);
		workbook.write(output);
	}
	


}
