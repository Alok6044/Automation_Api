package clearpaytm;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com/");
		calendardate(driver);
		}
	//handling cleartrip travel date
	public static void calendardate(WebDriver driver) throws InterruptedException{
    Thread.sleep(2000);
    WebElement element=driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']//button[1]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    Thread.sleep(2000);
    WebElement newElement = driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']/div[2]/div[1]/div[3]/div[5]/div[7]/div/div"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newElement);
    
    }
    
}
