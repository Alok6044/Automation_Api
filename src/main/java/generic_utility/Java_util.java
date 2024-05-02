package generic_utility;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_util {
	
   public static void date(String[] args) {
	   WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.cleartrip.com/"); 
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']//button[1]")).click();
		String month="july 2023";
		String date="25";
	String text=driver.findElement(By.xpath("//div[contains(@class,'flex-1')]")).getText();
	System.out.println(text);
		/*while(true)
		{
			//div[contains(@class,'flex-1')]
		}*/
	   
	 

}}
