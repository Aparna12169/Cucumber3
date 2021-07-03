package org.utilities;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

		public static WebDriver driver;

		public static void launchBrowser()
		{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		}
		public static void loadhUrl(String url)
		{
			driver.get(url);
		}
		public static void maximizeWindow()
		{
			driver.manage().window().maximize();
		}
		public static void applWaitToAllLocators()
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		public static void fill(WebElement element ,String text)
		{
			element.sendKeys(text);
		}
		public static void btnClick(WebElement element)
		{
			element.click();
		}
		public  static void Select(WebElement element)
		{
			element.click();
		}
		public static void selectByVisibleText(WebElement element ,String text)
		{
			element.sendKeys(text);
			
		}
		public int getValue() {
			return 0;
		}
		
		public int getAttribute(int i) {
			return 0;
			
			
			
			
		}
		public static void closeBrowser()
		{
			driver.quit();
		}
		

}
