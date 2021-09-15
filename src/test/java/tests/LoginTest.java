package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.BaseClass;

public class LoginTest extends BaseClass{
	
	
	@Test
	public void Login() throws IOException {
		WebDriver driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
		System.out.println("Pranjali Update the things");
		
		System.out.println("pranjali has done small change");
		
		}

}
