package miniproject_pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Akhil Sai
 * @author Nikitha
 * @author Dheeraj
 * class for Selecting an item and purchasing it
 */
public class JPetStore_Operation {
	WebDriver driver;



	public JPetStore_Operation(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy (how = How.NAME , using = "keyword")
	@CacheLookup
	WebElement search;

	@FindBy (how = How.XPATH , using = "//div[@id='Header']//a[2]//img[1]")
	@CacheLookup
	WebElement Dogs;
	
	@FindBy (how = How.LINK_TEXT , using = "K9-BD-01")
	@CacheLookup
	WebElement BullDog;
	
	
	@FindBy (how = How.XPATH , using = "//div[@id='QuickLinks']//a[5]//img[1]")
	@CacheLookup
	WebElement Birds;

	@FindBy (how = How.LINK_TEXT , using = "AV-CB-01")
	@CacheLookup
	WebElement AmazonParrot;
	
	@FindBy (how = How.XPATH , using = "//div[@id='QuickLinks']//a[1]//img[1]")
	@CacheLookup
	WebElement Fish;

	@FindBy (how = How.LINK_TEXT , using = "FI-SW-01")
	@CacheLookup
	WebElement AngelFish;
	
	@FindBy (how = How.XPATH , using = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]")
	@CacheLookup
	WebElement addAngelFishCart;		

	@FindBy (how = How.XPATH , using = "//tr[2]//td[5]//a[1]")
	@CacheLookup
	WebElement addtocart;
	
	@FindBy (how = How.XPATH , using = "//a[@class='Button']")
	@CacheLookup
	WebElement addParrotcart;
	
	@FindBy (how = How.LINK_TEXT , using = "FL-DLH-02")
	@CacheLookup
	WebElement Persian;
	
	@FindBy (how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/a[1]")
	@CacheLookup
	WebElement Persiancart;

	@FindBy (how = How.LINK_TEXT , using = "Proceed to Checkout")
	@CacheLookup
	WebElement proceedtocheckout;

	@FindBy (how = How.NAME , using = "newOrder")
	@CacheLookup
	WebElement proceedOrder;

	@FindBy (how = How.CLASS_NAME , using = "Button")
	@CacheLookup
	WebElement confirmOrder;

	@FindBy (how = How.LINK_TEXT , using = "Return to Main Menu")
	@CacheLookup
	WebElement returnmainmenu;

	@FindBy (how = How.LINK_TEXT , using = "Sign Out")
	@CacheLookup
	WebElement signout;
	
	/**
	 * method to click on Dogs Menu
	 * @throws Exception 
	 */
	public void clickDogs() throws Exception {
		Thread.sleep(1000);
		Dogs.click();
	}
	
	/**
	 * method to selecting an item from Dogs Menu
	 * @throws Exception 
	 */
	public void clickOnitem() throws Exception {
		Thread.sleep(1000);
		BullDog.click();
	}
	
	/**
	 * method to click on Birds Menu
	 * @throws Exception 
	 */
	public void clickBirds() throws Exception {
		Thread.sleep(1000);
		Birds.click();
	}
	
	/**
	 * method to selecting an item from Birds Menu
	 * @throws Exception 
	 */
	public void clickOnParrot() throws Exception {
		Thread.sleep(1000);
		AmazonParrot.click();
	}
	
	/**
	 * method to adding selected item to cart from birds menu
	 * @throws Exception
	 */
	public void addParrotCart() throws Exception {
		Thread.sleep(1000);
		addParrotcart.click();
	}
	
	/**
	 * method to click on Fish Menu
	 * @throws Exception 
	 */
	public void clickFish() throws Exception {
		Thread.sleep(1000);
		Fish.click();
	}
	
	/**
	 * method to selecting an item from Fish Menu
	 * @throws Exception 
	 */
	public void clickOnAngelFish() throws Exception {
		Thread.sleep(1000);
		AngelFish.click();
	}
	
	/**
	 * method to adding selected item to cart from Fish Menu
	 * @throws Exception
	 */
	public void addAngelFishCart() throws Exception {
		Thread.sleep(1000);
		addAngelFishCart.click();
	}
	
	/**
	 * method to adding item to cart
	 * @throws Exception 
	 */
	public void addCart() throws Exception {
		Thread.sleep(1000);
		addtocart.click();
	}

	/**
	 * method to search a product
	 */
	
	public void search(String inputText) {
		search.sendKeys(inputText);
		search.sendKeys(Keys.ENTER);
	}
	
	/**
	 * method to click on searched product
	 * @throws Exception
	 */
	public void clickPersian() throws Exception {
		Persian.click();
		Thread.sleep(1000);
		Persiancart.click();
	}
	
	/**
	 * method to process the payment
	 */
	public void proceedpayment() throws InterruptedException {
		proceedtocheckout.click();
		Thread.sleep(1000);
		proceedOrder.click();
		Thread.sleep(1000);
		confirmOrder.click();
	}
	
	/**
	 * method to return to main menu after completeion of payment
	 * @throws Exception 
	 */
	public void mainmenu() throws Exception {
		Thread.sleep(1000);
		returnmainmenu.click();
	}
	
	/**
	 * method to Sign Out
	 * @throws Exception 
	 */
	public void signOut() throws Exception {
		Thread.sleep(1000);
		signout.click();
	}
}