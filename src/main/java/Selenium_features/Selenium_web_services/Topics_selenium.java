package Selenium_features.Selenium_web_services;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class Topics_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
//This is for date picker
		////*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr/td/a
						//tagname[@attributename='value']
		
		WebDriver driver = new ChromeDriver();
				driver.get("https://book.spicejet.com/search.aspx");
		
		Thread.sleep(3000);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"divsearchdisplay\"]/div[2]/div[3]/span"));
		//Explicit wait
		WebDriverWait waite = new WebDriverWait(driver, 60);
		waite.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(ele));
		
		ele.click();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(60, TimeUnit.SECONDS)
		       .pollingEvery(1, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>()

		   {
		     public WebElement apply(WebDriver driver1) {
		    	 
		    	 WebElement ele = driver1.findElement(By.xpath("//*[@id=\"home_banner\"]/a"));
		    	 
		    	 if(ele.getAttribute("BreakFast").equalsIgnoreCase("Idly"))
		    	 {
		    		 return ele;
		    	 }
		    	 
		    	 else
		    	 {
		    		 return null;
		    	 }
		     }
		   });
	}

}
