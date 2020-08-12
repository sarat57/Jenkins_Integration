package Selenium_features.Selenium_web_services;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_in_Sel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Actions_in_Sel acts = new Actions_in_Sel();
		acts.dragand_drop();
		
	}
	
	public void mouse() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
				
				WebDriver driver = new ChromeDriver();
						driver.get("https://book.spicejet.com/search.aspx");
				Thread.sleep(3000);
				//implicit wait
				Actions act = new Actions(driver);
				
			//	Code for Mouse hover movments
				act.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).perform();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"header-addons\"]/ul/li[2]/a")).click();
				Thread.sleep(9000);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.close();
	}
	
	
	
	public void dragand_drop() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
Thread.sleep(3000);
//implicit wait

driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));

Actions act = new Actions(driver);
WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
act.moveToElement(source).perform();
WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
System.out.println("Before drag");
act.dragAndDrop(source, target).build().perform();
System.out.println("After drag");
Thread.sleep(3000);

Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_MINUS);
robot.keyPress(KeyEvent.VK_MINUS);
robot.keyPress(KeyEvent.VK_MINUS);
robot.keyPress(KeyEvent.VK_MINUS);

robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_MINUS);
Thread.sleep(3000);

driver.switchTo().defaultContent();
driver.close();


		
	}

}
