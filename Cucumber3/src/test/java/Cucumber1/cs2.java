package Cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs2 {
	
	WebDriver driver;
	
	@Given("Users navigate to testme app")
	public void users_navigate_to_testme_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}
	
	@Given("the home page is opened")
	public void the_home_page_is_opened() {
		System.out.println("Home page is opened");
	}

	@Given("the user clicks on signin")
	public void the_user_clicks_on_signin() {
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("the page title"+ driver.getTitle());
	  
	}

	@Given("Users enters {string} and {string}")
	public void users_enters_and(String username, String password) {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/a")).click();
	}
		
		
		
	@Then("Login is successfull")
	public void login_is_successfull() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();


}}
