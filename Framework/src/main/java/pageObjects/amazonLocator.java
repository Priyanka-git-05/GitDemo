package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonLocator {
	
	WebDriver driver;

	@FindBy(id="nav-link-accountList")
	public WebElement navLinkAccountList;
	
	@FindBy(id="ap_email")
	public WebElement username;
	
	@FindBy(id="continue")
	public WebElement continueButton;
	
	@FindBy(id="ap_password")
	public WebElement password;
	
	@FindBy(id="signInSubmit")
	public WebElement loginButon;
	
	
	public amazonLocator(){
		PageFactory.initElements(driver, this);
	}
	
}
