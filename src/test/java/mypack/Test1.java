package mypack;

import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException { 
		
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	Thread.sleep(5000);
	driver.get("https://amazon.com");
	Thread.sleep(5000);
	driver.get("https://flipkart.com");
	Thread.sleep(5000);
	driver.get("https://myntra.com");
	driver.close();
	
	System.out.println();
	
	
	
	
	
	
	
			
		

	}

}
