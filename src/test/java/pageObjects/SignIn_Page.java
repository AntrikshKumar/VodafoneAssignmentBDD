package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn_Page {

	WebDriver driver;
	public SignIn_Page(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(id="myvfLoginOnlineId")
	private WebElement Username;
	
	@FindBy(id="myvfLoginPassword")
	private WebElement Password;
	
	@FindBy(id="sign-in-button")
	private WebElement Submit;
	
	@FindBy(xpath=".//*[@id='loginHandler']/label")
	private WebElement SubmitError;
	
	public void login(String arg1, String arg2){
		Username.sendKeys(arg1);
		Password.sendKeys(arg2);
		Submit.submit();
	}
	
	public String getSubmitError(){
		return SubmitError.getText();
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
}
