package Page_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver pdriver;
	
	public Login_page(WebDriver rdriver)
	{
		pdriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Username")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//input[@class='btn btn-primary w-100']")
	WebElement logbutton;
	
	public void username()
	{
		username.sendKeys("Prasad123");
	}
	
	public void Password()
	{
		Password.sendKeys("kavita@user");
	}
	
	public void logbutton()
	{
		logbutton.click();
	}
	
}
