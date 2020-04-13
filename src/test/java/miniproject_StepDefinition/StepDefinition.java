package miniproject_StepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import miniproject_pages.JPetStore_Login;
import miniproject_pages.JPetStore_Operation;
import miniproject_utility.BrowserAccess;
import miniproject_utility.ConfigReader;
import miniproject_utility.ExcelAccess;
import miniproject_utility.Screenshot;

/**
 * @author Akhil Sai
 * @author Nikitha
 * @author Dheeraj
 * 
 * Class : Writing the glue code for all the feature files
 *
 */
public class StepDefinition {
	ConfigReader config = new ConfigReader();
	WebDriver driver;
	JPetStore_Login page;
	ExcelAccess configExcel;
	JPetStore_Operation operation;
	Logger logger;

	public static ExtentReports report = new ExtentReports("./Report/ext_report.html");
	ExtentTest ext_test = report.startTest("JPetStore_Report");

	@Given("^open browser and start application$")
	public void open_browser_and_start_application() throws Throwable {

		/*starting the browser navigating to url*/

		BrowserAccess browser = new BrowserAccess();
		logger = Logger.getLogger("StepDefinition");
		PropertyConfigurator.configure("Log4j.properties");
		driver = browser.startBrowser("chrome" , config.getJPetStore_url());
		logger.info("Chrome Opened");
		ext_test.log(LogStatus.PASS, "Browser Opened");

	}

	@When("^I enter valid \"([^\"]*)\"$")
	public void i_enter_valid(String usernameNumber) throws Throwable {

		/*entering valid credentials into the login page*/

		page=PageFactory.initElements(driver, JPetStore_Login.class);
		page.clickSignIn();
		configExcel=new ExcelAccess(config.getExcelPath());
		Object[][] data=configExcel.passData();
		String username="";
		String password="";
		if(usernameNumber !=  null) {
			int userCount = Integer.parseInt(usernameNumber.trim());

			username = (String )data[userCount-1][0];
			password = (String )data[userCount-1][1];	
		}

		page.enterCredentials(username, password);

		logger.info("Valid Credentials Entered");
		ext_test.log(LogStatus.PASS, "Valid Credentials Entered");
	}


	@When("^user able to login$")
	public void user_able_to_login() throws Throwable {
		/* signing into the page */
		page.submit();

	}

	@Then("^user selects an item from menu$")
	public void user_selects_an_item_from_menu() throws Throwable {

		/* Selecting an item from Dogs Menu and adding to Cart */

		operation =PageFactory.initElements(driver, JPetStore_Operation.class);
		operation.clickDogs();
		logger.info("clicked on Dogs Menu");
		operation.clickOnitem();
		logger.info("Selected a product");
		operation.addCart();
		logger.info("selected product added to card");
		ext_test.log(LogStatus.PASS, "Item from Dogs menu added to Cart");


	}

	@Then("^payment has to be done$")
	public void payment_has_to_be_done() throws Throwable {
		
		/* Processing the Payment */
		
		logger.info("Processing Payment");
		operation.proceedpayment();
		logger.info("Payment Done");
		ext_test.log(LogStatus.PASS, "Payment Completed");
	}

	@Then("^user has to sign out$")
	public void user_has_to_sign_out() throws Throwable {
		
		/* Signing Out from the Site */
		
		operation.mainmenu();
		logger.info("Returned to Main Menu");
		operation.signOut();
		logger.info("Signed Out");
		ext_test.log(LogStatus.PASS, "Sign Out Successful");

	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
		
		/* Closing The Application */
		
		Thread.sleep(2000);
		driver.close();
		logger.info("Browser Closed");
		ext_test.log(LogStatus.PASS, "Browser Closed Successfully");
		report.endTest(ext_test);
		report.flush();

	}

	@Then("^user selects multiple items$")
	public void user_selects_multiple_items() throws Throwable {
		/* Selecting item from Birds Menu and adding to Cart */

		operation.clickBirds();
		operation.clickOnParrot();
		operation.addParrotCart();
		logger.info("Item from Birds menu added to Cart");
		ext_test.log(LogStatus.PASS, "Item from Birds menu added to Cart");
		
		/* Selecting item from Fish Menu and adding to Cart */
		operation.clickFish();
		operation.clickOnAngelFish();
		operation.addAngelFishCart();
		logger.info("Item from Fish menu added to Cart");
		ext_test.log(LogStatus.PASS, "Item from Fish menu added to Cart");
	}

	@Then("^user searches for an item$")
	public void user_searches_for_an_item() throws Throwable {
		
		/* Searching item and adding to Cart */
		
		operation =PageFactory.initElements(driver, JPetStore_Operation.class);
		operation.search("Persian");
		logger.info("Item:persian Searched");
		operation.clickPersian();
		logger.info("Item : 'Persian' from Search result added to Cart");
		ext_test.log(LogStatus.PASS, "Item : 'Persian' from Search result added to Cart");
	}

	@When("^I enter invalid \"([^\"]*)\"$")
	public void i_enter_invalid(String usernameNumber) throws Throwable {
		
		/* Entering Invalid Credentials */
		
		page=PageFactory.initElements(driver, JPetStore_Login.class);
		page.clickSignIn();
		configExcel=new ExcelAccess(config.getExcelPath());
		Object[][] data=configExcel.passData();
		String username="";
		String password="";

		if(usernameNumber !=  null) {
			int userCount = Integer.parseInt(usernameNumber.trim());

			username = (String )data[userCount-1][0];
			password = (String )data[userCount-1][1];	
		}

		page.enterCredentials(username, password);
		logger.info("Invalid Credentials Entered");
	}

	@Then("^user unable to login$")
	public void user_unable_to_login() throws Throwable {
		
		/* User Unable to login while entering Invalid Credentials */

		page.submit();    
		logger.info("LogOut failed for Invalid Credentials");
		ext_test.log(LogStatus.PASS, "LogOut failed for Invalid Credentials");
		
		/* Screenshot has to be taken while entering invalid credentials */
		Screenshot sc = new Screenshot();
		sc.getScreenshot(driver);
		logger.info("Screenshot taken for Invalid credentials");
		ext_test.log(LogStatus.PASS, "Screenshot taken for Invalid credentials");
	}


}
