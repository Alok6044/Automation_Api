package clearpaytm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datepickertrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tickets.paytm.com/flights/");
		calendardate1(driver);
		}
	   //for handling paytmticket travel date
		public static void calendardate1(WebDriver driver) throws InterruptedException	{
		    Thread.sleep(2000);
		    WebElement element=driver.findElement(By.xpath("//span[text()='Departure Date']"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		    Thread.sleep(2000);
		    WebElement newElement = driver.findElement(By.xpath("//div[@class='Mobile-datepicker']/div/div/table/tbody/tr[5]/td[4]/div"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newElement);
		}
	}

