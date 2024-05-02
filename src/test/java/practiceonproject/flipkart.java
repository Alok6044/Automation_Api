package practiceonproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class flipkart {
	WebDriver driver;
	public static void main(String[] args)
	{
		flipkart fli=new flipkart();
	fli.launchBrowser();
	fli.openApp();
	}

	public void launchBrowser() {
	    driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void openApp()
	{
		driver.get("https://www.flipkart.com/");
	}
	public void testcase1()
	{
		driver.findElement(By.xpath("//button[text()='✕']")).click(); 
		driver.findElement(By.name("q")).sendKeys("Iphonex");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
