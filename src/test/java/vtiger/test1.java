package vtiger;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	public static void main(String[] args)
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Random r=new Random();
		int num=r.nextInt(1000);
		String name="Qspider";
		name=name+num;
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
WebElement w=driver.findElement(By.id("submitButton"));
w.submit();
driver.findElement(By.linkText("Organizations")).click();
driver.findElement(By.cssSelector("[title='Create Organization...']")).click();
driver.findElement(By.name("accountname")).sendKeys(name,Keys.TAB,Keys.TAB,"www.qspiders");	
driver.findElement(By.id("phone")).sendKeys("9937374420");
driver.findElement(By.xpath("//input[contains(@class,'save')]")).click();
 
WebElement result=driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
String res=result.getText();
if(res.contains(name))
{
	System.out.println("organization created sussesful and verified");
	}
else {
	System.out.println("organization not created ");
}
WebElement wb1=driver.findElement(By.xpath("//td[starts-with(@onmouseover,'fnDropDownUser')]/img"));
Actions at=new Actions(driver);
at.moveToElement(wb1).perform();
WebElement wb3=driver.findElement(By.xpath("//a[text()='Sign Out']"));
at.click(wb3).perform();
	}

}



