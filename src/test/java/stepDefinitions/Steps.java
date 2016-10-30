package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import pageObjects.Home_Page;
import pageObjects.MyVodafone_Page;
import pageObjects.SignIn_Page;

public class Steps {
	
	public static Properties config = new Properties();

	public WebDriver driver = null;
	private Home_Page homepage;
	private MyVodafone_Page myVodafonePage;
	private SignIn_Page signInPage;

	@Before
	public void setup(){
		
		try{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\config\\Config.properties");	
		config.load(fis);
		}catch(Throwable t){
			System.out.println("Unable to open config file.");
			t.printStackTrace();
		}
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		homepage = PageFactory.initElements(driver, Home_Page.class);
		myVodafonePage = PageFactory.initElements(driver, MyVodafone_Page.class);
		signInPage = PageFactory.initElements(driver, SignIn_Page.class);
	}

	
	
	@Given("^User is on Vodafone home page$")
	public void user_is_on_Vodafone_home_page() {
		driver.get(config.getProperty("homepage"));
	}

	@When("^user tries to login with invalid credentials$")
	public void user_tries_to_login_with_invalid_credentials() {
		homepage.goNavToLoginPage();
		myVodafonePage.clickLogin();
		signInPage.login(config.getProperty("invalidUsername"), config.getProperty("invalidPassword"));
	}

	@Then("^login should be unsuccessful$")
	public void login_should_be_unsuccessful() {
		assertTrue(config.getProperty("signInPageTitle").equals(signInPage.getTitle()));
	}

	@Then("^prompt following message to user$")
	public void prompt_following_message_to_user(String arg1) {
		assertTrue(arg1.equals(signInPage.getSubmitError()));
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}




