package miniproject_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * @author Akhil Sai
 * @author Nikitha
 * @author Dheeraj
 * Class created to configure and access the Browser
 * and returning WebDriver element
 */
public class BrowserAccess {
	ConfigReader config = new ConfigReader();
	public WebDriver driver;

	public WebDriver startBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", config.getchromepath());
			driver = new ChromeDriver();
			
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", config.getfirefoxpath());
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
