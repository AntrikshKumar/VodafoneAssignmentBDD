package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {

	WebDriver driver;
	public Home_Page(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(xpath=".//*[@id='menu']/li[6]/a")
	private WebElement MyVodafoneMenu;
	
	public void goNavToLoginPage(){
		MyVodafoneMenu.click();
	}
}
