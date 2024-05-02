package vtiger;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class broken_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		//Fetch All the links using anchor tag
		List<WebElement> allLinks =driver.findElements(By.xpath("//a"));
		
		//create a empty arraylist for broken links
		List<String> brokenlinks =new ArrayList<String>();
		for(int i=0;i<allLinks.size();i++) {
			String links = allLinks.get(i).getAttribute("href");
			
        int statuscode=0;

        //Create url and 
        try {

          URL url=new  URL(links);
          URLConnection conn = url.openConnection();
          HttpURLConnection urlc = (HttpURLConnection)conn;
          statuscode=urlc.getResponseCode();
          if(statuscode>=400) {
            brokenlinks.add(links+" "+statuscode);
          }

        } catch (Exception e) {
          continue;
        }
        System.out.println(brokenlinks);
      }


    }
}


