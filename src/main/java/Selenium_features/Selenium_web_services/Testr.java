package Selenium_features.Selenium_web_services;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Testr {
	
	
	public static void main (String [] args) throws InterruptedException
	{
		//C:\Users\sarat\Downloads\geckodriver-v0.26.0-win64
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	

	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sarat\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");	

			//DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);

	WebDriver driver = new ChromeDriver();
			driver.get("https://book.spicejet.com/search.aspx");
	
	Thread.sleep(3000);
	
	//Handling dropdown
	WebElement eledropdown = driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']"));
	
	Select sel = new Select(eledropdown);
	
	List<WebElement> drop_down_vals =sel.getOptions();
	
	for(WebElement ele : drop_down_vals )
	{
	System.out.println(ele.getText());	
	}
	
	//Handling table data***********************************
	driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"]")).click();
	List<WebElement> mylist = driver.findElements(By.xpath("//*[@id='dropdownGroup1']/div/ul[3]/li/a"));
	
	for(int i =0;i<mylist.size();i++)
	{
		System.out.println(mylist.get(i).getText());
	}
	//****************************************************
	driver.close();
	
	}	
}
	