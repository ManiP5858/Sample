package com.type;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
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

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	private static final CellType STRING = null;
	static WebDriver driver;

	public void getDriver() { // 1
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void enterUrl(String url) { // 2
		driver.get(url);
	}

	public void maximizeWindow() { // 3
		driver.manage().window().maximize();
	}

	public void elementsSendKeys(WebElement elemends, String data) { // 4
		elemends.sendKeys(data);
	}

	public void clickbutton(WebElement elemends) { // 5
		elemends.click();
	}

	public void clickOkinAlert() { // 6
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelinAlert() { // 7
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTextFromWebpage(WebElement elemends) { // 8
		String text = elemends.getText();
		return text;
	}

	public String insertedValueFromTextbox(WebElement elemends) { // 9
		elemends.sendKeys("Date");
		String attribute = elemends.getAttribute("Value");
		return attribute;
	}

	public void closeAllWindow() { // 10
		driver.quit();
	}

	public void closeWindow() { // 11
		driver.close();
	}

	public String gettheTitle() { // 12
		String title = driver.getTitle();
		return title;
	}

	public String enteredUrl() { // 13
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void contectclick(WebElement element) { // 14
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void referesh() { // 15
		driver.navigate().refresh();
	}

	public void forward() { // 16
		driver.navigate().forward();
	}

	public void backward() { // 17
		driver.navigate().back();
	}

	public void launchUrl(String value) { // 18
		driver.navigate().to(value);
	}

	public void sleep(int num) throws InterruptedException { // 19
		Thread.sleep(num);
	}

	public void implicitlyWait(int num) { // 20
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
	}

	public Actions moveToElement(WebElement element) { // 21
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return action;
	}

	public void takesScreenShot(String location) throws IOException { // 22
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(location);
		FileUtils.copyFile(screenshotAs, file);
	}

	public File file(String value) { // 23
		File file = new File(value);
		return file;
	}

	public Alert alertAccept() { // 24
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return alert;
	}

	public Alert alertdismiss() { // 25
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		return alert;
	}

	public void selectByIndex(WebElement element, int index) { // 26
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void selectByVisibleText(WebElement element, String value) { // 27
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public void selectByvalue(WebElement element, String value) { // 28
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public WebElement getFirstSelectedOptions(WebElement element) { // 29
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public void deselectByIndex(WebElement element) { // 29
		Select s = new Select(element);
		s.deselectAll();
	}

	public void deselectByValue(WebElement element, String value) { // 30
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public void deselectByVisibleText(WebElement element, String value) { // 31
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}

	public void deselectedByIndex(WebElement element, int index) { // 32
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public WebElement firstSelectedOption(WebElement element) { // 33
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public boolean isMultiple(WebElement element) { // 34
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public String getWindowHandle() { // 35
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set getWindowHandles() { // 36
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public void switchWindow(String value) { // 37
		driver.switchTo().window(value);
	}

	public void framesIndex(int index) { // 38
		driver.switchTo().frame(index);
	}

	public void frameStringValue(String value) { // 39
		driver.switchTo().frame(value);
	}

	public void framesRefName(WebElement element) { // 40
		driver.switchTo().frame(element);
	}

	public void parentFrame() { // 41
		driver.switchTo().parentFrame();
	}

	public void defaulContent() { // 42
		driver.switchTo().defaultContent();
	}

	public void hasCodeValue() { // 43
		driver.switchTo().hashCode();
	}

	public void elementSendKeys(WebElement element, String data) { // 44
		element.sendKeys(data);
	}

	public void elementClick(WebElement element) { // 45
		element.click();
	}

	public WebElement findLocatorById(String attributevalue) { // 46
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;
	}

	public WebElement findLocatorByName(String attributevalue) { // 47
		WebElement element = driver.findElement(By.name(attributevalue));
		return element;
	}

	public WebElement findLocatorByClassName(String attributevalue) { // 48
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;
	}

	public WebElement findLocatorByXpath(String xpath) { // 49
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String getApplnTitle() { // 50
		String title = driver.getTitle();
		return title;
	}

	public String getApplnUrl() { // 51
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void closeWindow1() { // 52
		driver.close();
	}

	public static void quiteWindow() { // 53
		driver.quit();
	}

	public String size() { // 54
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public String toString() {// 55
		String string = driver.toString();
		return string;
	}

	public void elementSendKeysjs(WebElement element, String data) {// 56
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value',' " + data + " ' )", element);
	}

	public void writecell(String sheetname, int rownum, int cellnum, String data) throws IOException { // 57
		File file = new File("C:\\Users\\Prasanth\\eclipse-workspace\\MavenProject\\Excel\\Test.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInputStream);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
	}

	public String getDataFromCell(String sheetname, int rownum, int cellnum) throws IOException {//58
		String res = "";
		File file = new File("C:\\Users\\Prasanth\\eclipse-workspace\\MavenProject\\Excel\\Test.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInputStream);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		org.apache.poi.ss.usermodel.CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellInternalDateFormatted(cell)) {
				java.util.Date dateCellValue = cell.getDateCellValue();
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
	

}