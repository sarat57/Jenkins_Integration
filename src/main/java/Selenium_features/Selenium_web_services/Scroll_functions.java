package Selenium_features.Selenium_web_services;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_functions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		Scroll_functions sf = new Scroll_functions();
		sf.scrollTo();

	}
	
	public void scrollBy() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver();
						driver.get("https://www.naukri.com/");
				
				Thread.sleep(3000);
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				
				jse.executeScript("window.scrollBy(0,1000)");

				Thread.sleep(5000);
				
				jse.executeScript("window.scrollBy(0,-500)");
	}

	public void scrollTo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver();
						driver.get("https://www.naukri.com/");
				
				
						Thread.sleep(3000);
						
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				
				jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");

				Thread.sleep(3000);
				driver.close();
	}
	
	public void scrollintoView() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
						driver.get("https://www.naukri.com/");
				
				
						Thread.sleep(3000);
						
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				WebElement ele = driver.findElement(By.xpath("//*[@id=\"JobGallery\"]/h2"));
				jse.executeScript("arguments[0].scrollIntoView();",ele);
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyPress(KeyEvent.VK_MINUS);

				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_MINUS);
				
				Thread.sleep(3000);

				driver.close();
				
				
				
	}


}
