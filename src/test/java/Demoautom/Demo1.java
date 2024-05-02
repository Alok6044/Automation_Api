package Demoautom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Automationapi\\src\\test\\resources\\resources\\testdata.properties");
		Properties p=new Properties();
		p.load(file);
		String value1=p.getProperty("browser");
		System.out.println(value1);
		String value=p.getProperty("username");
		System.out.println(value);

	}

}
