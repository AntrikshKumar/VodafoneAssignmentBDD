package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyVodafone_Page {
	
	WebDriver driver;
	public MyVodafone_Page(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[@title='Login']")
	private WebElement LoginButton;
	
	public void clickLogin(){
		LoginButton.click();
	}
}
