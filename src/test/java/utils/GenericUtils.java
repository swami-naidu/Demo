package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public GenericUtils(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

}
