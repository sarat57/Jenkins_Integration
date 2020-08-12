package Selenium_features.Selenium_web_services;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Stop_watch_Flu_Wait {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarat\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		//This is for date picker
				////*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr/td/a
								//tagname[@attributename='value']
				
				WebDriver driver = new ChromeDriver();
						driver.get("https://www.timeanddate.com/stopwatch/");
				
				Thread.sleep(3000);
				//implicit wait
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//*[text()='Start'])[1]")).click();
				
				
				//WebElement ele = driver.findElement(By.xpath("//*[@id=\"divsearchdisplay\"]/div[2]/div[3]/span"));
				
				 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					       .withTimeout(60, TimeUnit.SECONDS)
					       .pollingEvery(1, TimeUnit.SECONDS)
					       .ignoring(NoSuchElementException.class);

					   WebElement foo = wait.until(new Function<WebDriver, WebElement>()

					   {
					     public WebElement apply(WebDriver driver1) {
					    	 
					    	 WebElement ele = driver1.findElement(By.xpath("//span[@"
					    	 		+ "class='c-stopwatch__time']"));
					    	 
					    	 if(ele.getText().contains("00:00:50."))
					    	 {
					    		 return ele;
					    	 }
					    	 
					    	 else
					    	 {
					    		 return null;
					    	 }
					     }
					   });
					   

						driver.findElement(By.xpath("(//*[text()='Pause'])[1]")).click();

		
	}

}
