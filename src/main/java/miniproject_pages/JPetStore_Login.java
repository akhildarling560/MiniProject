
package miniproject_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Akhil Sai
 * @author Nikitha
 * @author Dheeraj
 * Class used to Login into page
 */
public class JPetStore_Login {

	WebDriver driver;
	public JPetStore_Login(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.XPATH, using = "//a[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement signIn;
	
	@FindBy (how = How.NAME , using = "username")
	@CacheLookup
	WebElement username;
	
	@FindBy (how = How.XPATH , using = "//input[@name='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy (how = How.NAME , using = "signon")
	@CacheLookup
	WebElement submit;
	
	/**
	 * method to click on first Sign In button
	 * @throws Exception 
	 */
	public void clickSignIn() throws Exception {
		Thread.sleep(1000);
		signIn.click();
	}
	/**
	 * method to enter credentials for login page
	 */
	public void enterCredentials(String Username , String pwd) {
		username.sendKeys(Username);
		password.clear();
		password.sendKeys(pwd);
		
		
	}
	/**
	 * method to click on Login button
	 * @throws Exception 
	 */
	
	public void submit() throws Exception {
		Thread.sleep(1000);
		submit.click();
	}
}

