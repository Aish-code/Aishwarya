package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		POM_Class PObject = new POM_Class(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		PObject.clicklink();
		String username = null;
		PObject.typeuname(username);
		String password = null;
		PObject.typepwd(password);
		PObject.clickLogin();
		PObject.clickLogout();
		System.out.println("title of the page is "+ driver.getTitle());

	}

}


