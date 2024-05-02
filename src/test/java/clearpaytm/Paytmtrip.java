package clearpaytm;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.opencsv.CSVWriter;
 
public class Paytmtrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//Step1 : Launch The Browser
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://tickets.paytm.com/flights/");
	    //Step 2: Click The TextBox of New Delhi
	      driver.findElement(By.xpath("//div[@id='from']//span[@class='_3xDDz']")).click();
	      Actions act1=new Actions(driver);
	      act1.keyDown(Keys.CONTROL).sendKeys("a").perform();
	      act1.keyUp(Keys.CONTROL).perform();
	      act1.keyDown(Keys.DELETE).perform();
	      act1.keyUp(Keys.DELETE).perform();
	      act1.sendKeys("Delhi").perform();
	    List<WebElement> allsug=driver.findElements(By.xpath("//div[@class='_281ql']//div"));
	    Thread.sleep(3000);
	      for(WebElement sug:allsug)
			{    
				if(sug.getText().contains("Indira Gandhi Airport"))
				{
					Thread.sleep(2000);
					sug.click();
					break;
				}
	        }
	   WebElement to=driver.findElement(By.xpath("//span[text()='To']"));
	   to.click();
	   Actions act=new Actions(driver);
	      act.keyDown(Keys.CONTROL).sendKeys("a").perform();
	      act.keyUp(Keys.CONTROL).perform();
	      act.keyDown(Keys.DELETE).perform();
	      act.keyUp(Keys.DELETE).perform();
	      act.sendKeys("Chandigarh").perform();
	    //Step 4: Pick The Airport Name (Chandigarh)
         Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Chandigarh Airport']")).click();
	   //step 5: handle the travel date
	   datepickertrip.calendardate1(driver);
	   
	   //Step 5: Click The Search Flight Button
	   driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
	   WebElement price=driver.findElement(By.xpath("//section[@id='flightsList']/div[2]/div/div/div/div[5]/div[1]"));
	   String pricevalue=price.getText();
	  
	   //System.out.println(value);
	  // WebElement price1=driver.findElement(By.xpath("//section[@id='flightsList']/div[2]/div/div/div/div[5]/div[1]"));
	  // String pricevalue1=price1.getText();
	   driver.findElement(By.xpath("//section[@id='flightsList']/div[3]/div/div/div/div[1]/div/div[2]/span[2]")).click();
	   String flightno1=driver.findElement(By.xpath("//section[@id='flightsList']/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/span[2]")).getText();
	   CSVWriter writer=new CSVWriter(new FileWriter("csvFile3\\FileOne6.csv"));
	    String[] heading= {"FlightOperator","FlightNo","PricePaytm"};
		String[] data= {"Indigo",flightno1,pricevalue};
	    writer.writeNext(heading);
	    writer.writeNext(data);
	    writer.flush();
	   
}

}


