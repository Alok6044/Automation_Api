package clearpaytm;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVWriter;

public class Cleartrip {


	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//Step1 : Launch The Browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.cleartrip.com/");
		//Step 2: Click The TextBox of New Delhi
		WebElement from = driver.findElement(By.xpath("//input[@placeholder=\"Where from?\"]"));
		from.click();
		from.sendKeys("del");
		Thread.sleep(2000);
		// Step 3: Pick the Airport Name(Delhi)
		driver.findElement(By.xpath("//p[text()='New Delhi, IN - Indira Gandhi Airport (DEL)']")).click();
		
		//Step 4: Pick The Airport Name (Chandigarh)
		WebElement where = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		where.click();
	    where.sendKeys("chan");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Chandigarh, IN - Chandigarh (IXC)']")).click();
		//step 5:handle the travel date of 26,july.
		datepicker.calendardate(driver);
		
		//Step 6: Click The Search Flight Button
		driver.findElement(By.xpath("//span[text()='Search flights']")).click();
		//step 7: fetch the price
		WebElement data = driver.findElement(By.xpath("//span[@data-testid='chevLeft']/../../../div[8]/div/div[1]/div[1]/div/div/div/div[2]/div"));
		String value=data.getText();
		//System.out.println(value);
		WebElement data1 = driver.findElement(By.xpath("//span[@data-testid='chevLeft']/../../../div[8]/div/div[2]/div[1]/div/div[2]/div[3]/div[2]/div"));
		String value1=data1.getText();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		String flightno=driver.findElement(By.xpath("//span[@data-testid='chevLeft']/../../../div[8]/div/div[4]/div/div/div[2]/div/div[1]/div[1]/div[3]/p[2]")).getText();
		String flightno2=driver.findElement(By.xpath("//span[@data-testid='chevLeft']/../../../div[8]/div/div[6]/div/div/div[2]/div[1]/div/div/div[3]/p[2]")).getText();
		 CSVWriter writer=new CSVWriter(new FileWriter("csvFile3\\FileOne5.csv"));
		    String[] heading= {"FlightOperator","FlightNo","PriceClearTrip"};
			String[] data3= {"Indigo",flightno,value};
			 String[] data11= {"Vistara",flightno2,value1};
			  writer.writeNext(heading);
			  writer.writeNext(data3);
			  writer.writeNext(data11);
			  writer.flush();
				
		}
		}




