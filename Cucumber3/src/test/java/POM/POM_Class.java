package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Class {
	WebDriver driver;
	By link=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By loglin=By.xpath("//input[@value='Log in']");
	By logout=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	public POM_Class (WebDriver driver) {
		this.driver=driver;
	}
	
	public void clicklink( ) {
		driver.findElement(link).click();
	}
	
	public void typeuname(String username ) {
		driver.findElement(uname).sendKeys("aishwaryamusale123@gmail.com");
	}
	
	public void typepwd(String password ) {
		driver.findElement(pwd).sendKeys("Aish12");
	}
	
	public void clickLogin( ) {
		driver.findElement(loglin).click();
	}
	
	public void clickLogout( ) {
		driver.findElement(logout).click();
	}

}
