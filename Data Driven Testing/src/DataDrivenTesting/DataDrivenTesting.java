package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class DataDrivenTesting 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driverExecutables/chroedriver.exe");
	}

		public static void main(String[] args) throws Throwable 
		{
			
			//WebDriver driver=new ChromeDriver();
			
			FileInputStream fis=new FileInputStream("C:\\Users\\HI\\Desktop\\ELF_BCA_BSc_TEAM3\\Selenium_Programs\\Data Driven Testing\\DataDrivenTesting");
			
			Properties prop=new Properties();
			prop.load(fis);
			
		//	String contactName = prop.getProperty("contactName");
			
			String productName = prop.getProperty("productName");
			String organization = prop.getProperty("organization");
			String password = prop.getProperty("password");
			String browser = prop.getProperty("browser");

			
			System.out.println(productName);
			System.out.println(organization);
			System.out.println(password);
			System.out.println(browser);
			
			WebDriver driver=null;
			
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./driverExecutables/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./driverExecutables/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else
			{
				driver=new ChromeDriver(); 
			}
			
		}
}
