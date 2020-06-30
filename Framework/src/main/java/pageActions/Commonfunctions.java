package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Commonfunctions {

	public WebDriver driver;
	
	public void initializeDriver(){
		String browserName=System.getProperty("browser");
		
		if(browserName.contains("chrome")){
			ChromeOptions option=new ChromeOptions();
			if(browserName.contains("headless")){
				option.addArguments("headless");
			}
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe");
			driver=new ChromeDriver(option);
		}
	}
	
	
	
}
