package clearpaytm;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.opencsv.CSVWriter;

public class CSVfile {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    CSVWriter writer=new CSVWriter(new FileWriter("csvFile3\\FileOne2.csv"));
    String[] heading= {"FlightOperator","FlightNo","PriceClearTrip","PricePaytm"};
	String[] data= {"Indigo","6E-2194","2489","2803"};
    String[] data1= {"Vistara","UK-957","2803","2803"};
    writer.writeNext(heading);
    writer.writeNext(data);
    writer.writeNext(data1);
    writer.flush();
	}




		
	}


