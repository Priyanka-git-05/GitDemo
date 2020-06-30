package pageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.amazonLocator;

public class amazonAction {
	
	amazonLocator amazonLocator=new amazonLocator();
	WebDriver driver;
	Actions a=new Actions(driver);

	public void hoverOnAccountList(){
		a.moveToElement(amazonLocator.navLinkAccountList).build().perform();
	}
	
	public void enterUserCredentials(String username,String password){
		amazonLocator.username.sendKeys(username);
		amazonLocator.continueButton.click();
		amazonLocator.password.sendKeys(password);
		amazonLocator.loginButon.click();	
	}
	
	
	
}
