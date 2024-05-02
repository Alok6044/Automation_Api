package vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import generic_utility.Java_util;

public class prctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java_util j=new Java_util();
		//j.dt();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.cleartrip.com/");
		WebElement text = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		text.click();
	    // text.clear(); 
	     Actions act=new Actions(driver);
	     act.sendKeys("new delhi").perform();
	   WebElement textfeild = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
	   Actions act1=new Actions(driver);
		textfeild.click();
		//textfeild.clear();
	    act1.sendKeys("chandigarh").perform();
	// WebElement date=driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']"));
	// String dateval="Sun, Jul 23";
	// selectdatebyjs(driver,date,dateval);
	    driver.findElement(By.xpath("//span[text()='Search flights']")).click();
	   
	    		   
	   }
		
	  /*  public static void selectdatebyjs(WebDriver driver,WebElement element,String dateval) {
		
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
		
	    
		}*/
	}


