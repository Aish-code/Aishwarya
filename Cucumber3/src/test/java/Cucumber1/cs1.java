package Cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class cs1 {
	WebDriver driver=null;
	
	
	@Given("the signup page is opened")
	public void the_signup_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  
	}

	@Then("user enters Aishwarya as username")
	public void user_enters_Aishwarya_as_username() {
		driver.findElement(By.id("userName")).sendKeys("Aishwarya");
	    
	}

	@Then("user enters First name Aishwarya")
	public void user_enters_First_name_Aishwarya() {
		driver.findElement(By.id("firstName")).sendKeys("Aishwarya");
	   
	}

	@Then("user enters Last name Musale")
	public void user_enters_Last_name_Musale() {
		driver.findElement(By.id("lastName")).sendKeys("Aishwarya");
	    
	}

	@Then("entersAish{int} as password")
	public void entersaish_as_password(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("Aishwarya"); 
	   
	}

	@Then("enters Aish{int} as password for confirmation")
	public void enters_Aish_as_password_for_confirmation(Integer int1) {
		driver.findElement(By.id("pass_confirmation")).sendKeys("Aishwarya");
	    
	}

	@Then("Select gender as Female")
	public void select_gender_as_Female() {
		driver.findElement(By.xpath("//input[@value='Female']")).click();;
	   
	}

	@Then("enters aishwaryamusale@gmail.com as email id")
	public void enters_aishwaryamusale_gmail_com_as_email_id() {
		driver.findElement(By.id("emailAddress")).sendKeys("aishwaryamusale123@gmail.com");
	   
	}

	@Then("user enters {string} as phone number")
	public void user_enters_as_phone_number(String string) {
		driver.findElement(By.id("mobileNumber")).sendKeys("8553348403");
	    
	}

	@Then("Selects {string} as his date of birth")
	public void selects_as_his_date_of_birth(String string) {
		driver.findElement(By.id("dob")).sendKeys("27-08-1997");
	}

	@Then("enters abcdef as address")
	public void enters_abcdef_as_address() {
		driver.findElement(By.id("address")).sendKeys("abcdef");
	}

	@Then("selects security question as birth place")
	public void selects_security_question_as_birth_place() {
		driver.findElement(By.id("securityQuestion")).sendKeys("What is your Birth Place");
	}

	@Then("answers as Hubli")
	public void answers_as_Hubli() {
		driver.findElement(By.id("answer")).sendKeys("Hubli");
	}

	@Then("Clicks on register")
	public void clicks_on_register() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	   
	}

	@Then("User is navigated to Login Page")
	public void user_is_navigated_to_Login_Page() {
	   
	}
}




