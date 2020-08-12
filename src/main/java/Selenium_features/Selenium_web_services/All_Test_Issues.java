package Selenium_features.Selenium_web_services;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_Test_Issues {

	
	WebDriver driver;
	
	public All_Test_Issues()
	{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		 driver = new ChromeDriver();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		All_Test_Issues ati = new All_Test_Issues();
		ati.spicejet_example();
		//http://demo.guru99.com/test/drag_drop.html

		}
	
	public void check_pageISLoded() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		if(jse.executeScript("return document.readyState").toString().equals("complete"))
		{
			System.out.println("Page is loded");
			return;
		}
		for(int k=0;k<40;k++)	
		{
			Thread.sleep(500);
			if(jse.executeScript("return document.readyState").toString().equals("complete"))
			{
				break;
			}	
		}
	}
	
	public void wait_for_an_element_to_clickble(String xpath)
	{
int time_towait = 10;
        WebElement ele = driver.findElement(By.xpath(xpath));
        WebDriverWait wait = new WebDriverWait(driver, time_towait);
        wait.ignoring(ElementNotSelectableException.class).until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void spicejet_example() throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
//		WebDriver driver = new ChromeDriver();
//		
		driver.get("https://www.spicejet.com/");	
		check_pageISLoded();
         Actions act=new Actions(driver);					

         wait_for_an_element_to_clickble("//*[@id='ctl00_HyperLinkLogin']");
         act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_HyperLinkLogin']"))).build().perform();

         wait_for_an_element_to_clickble("//*[@id='smoothmenu1']/ul/li[15]/ul/li[2]/a");
               act.moveToElement(driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[15]/ul/li[2]/a"))).build().perform();


               wait_for_an_element_to_clickble("//*[@id='smoothmenu1']/ul/li[15]/ul/li[2]/ul/li[2]/a");
         driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[15]/ul/li[2]/ul/li[2]/a")).click();
         check_pageISLoded();
         
         driver.findElement(By.xpath("//*[@id=\"CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName\"]")).sendKeys("TEst");

         wait_for_an_element_to_clickble("//*[@id=\"highlight-addons\"]");
         act.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"))).build().perform();
        

         wait_for_an_element_to_clickble("//*[@id='menu-list-addons']/li[1]/a");
         driver.findElement(By.xpath("//*[@id=\"menu-list-addons\"]/li[1]/a")).click();
         //check_pageISLoded();
         Thread.sleep(3000);
         Alert alt = driver.switchTo().alert();
         System.out.println(alt.getText().toString());

         System.out.println(alt.toString());
         Thread.sleep(3000);
         alt.dismiss();
         Thread.sleep(3000);
         driver.close();
         

	}
	
}

