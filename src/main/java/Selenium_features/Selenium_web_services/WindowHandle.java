package Selenium_features.Selenium_web_services;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
Thread.sleep(3000);
//implicit wait
driver.manage().window().maximize();
Thread.sleep(3000);
String parent_window = driver.getWindowHandle();
//driver.findElement(By.xpath("//*[@id=\"banner\"]/div[1]/a[5]")).click();

Thread.sleep(3000);

Set<String> windows =driver.getWindowHandles();

for(String wins : windows)//10
{
		driver.switchTo().window(wins);
		if(driver.getTitle().contains("Optum"))
		{
			break;
		}
		
	
}


//driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div[2]/div[1]/div/div[2]/div[1]/div[1]/a/div/span/span")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[1]/label/div/div[2]/div/input")).sendKeys("Prakash");

driver.switchTo().window(parent_window);
driver.close();
	}

}
