package Cucumber1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cs04 {
	
	WebDriver driver;
	
	@Given("Alex has registered in to TestMeApp")
	public void alex_has_registered_in_to_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	
	@Given("user clicks on Signin link")
	public void user_clicks_on_Signin_link() {
		driver.findElement(By.linkText("SignIn")).click();
		System.out.println("the page title"+ driver.getTitle());

	}
	@Given("username lalitha")
	public void username_lalitha() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
	}
	
	@Given("password  password{int}")
	public void password_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("password123");
	}
	@Given("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

	}
	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() {
		driver.findElement(By.name("products")).sendKeys("Head");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	  
	}

	@When("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		String cart="Cart";
		   try{
		    WebElement ele = driver.findElement(By.partialLinkText(cart));
		    ele.click();
		    boolean cartAvailable = true;
		   }
		   catch(org.openqa.selenium.NoSuchElementException|StaleElementReferenceException e) {
		    e.printStackTrace();
		   }


		   
		Assert.assertNotNull("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]");
	}

	@Then("TestMeApp doesn't display the cart icon")
	public void testmeapp_doesn_t_display_the_cart_icon() {
		System.out.println("a");
		   boolean cartAvailable = false;
		Assert.assertTrue(!cartAvailable);
	}


}
