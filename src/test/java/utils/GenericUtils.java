package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public GenericUtils(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void switchWindows() {
		String w1 = driver.getWindowHandle(), w2="";
		Set<String> w = driver.getWindowHandles();
		for(String i: w) {
			if(!i.equals(w1))
				w2 = i;
		}
		driver.switchTo().window(w2);
	}
	
	public void printPageTitle() {
		System.out.println(driver.getTitle());
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
