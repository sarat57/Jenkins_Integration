package Selenium_features.Selenium_web_services;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screen_Shot {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.spicejet.com/");
				Thread.sleep(3000);
				TakesScreenshot tsc = ((TakesScreenshot)driver);
				File source =tsc.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\sarat\\OneDrive\\Desktop\\xpath_topics.png");
				FileUtils.copyFile(source, dest);
						
	}

}