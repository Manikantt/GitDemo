package TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hpsf.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Page_objects {
	
	public String url="http://test.aadityafoundation.com/Account/Login";
	public String userid="Prasad123";
	public String pass="kavita@user";
	public  WebDriver Driver;
	public static Logger logger;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium_Batch\\ERP_pro\\src\\test\\java\\drivers\\chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get(url);
		logger=Logger.getLogger("ERP_pro");
		PropertyConfigurator.configure("log4j.propertise.txt");
		logger.info("url launched");
	}

	@AfterClass
	public void afterclass()
	{
		Driver.quit();
	}
}
