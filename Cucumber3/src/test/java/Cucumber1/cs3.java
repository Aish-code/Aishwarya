//package Cucumber1;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class cs3 {
//	
//	WebDriver driver;
//	
//	@Given("User opens the Test me app")
//	public void user_opens_the_Test_me_app() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
//	    
//	}
//
//	@Given("Home page is opened")
//	public void home_page_is_opened() {
//		System.out.println("Home page is opened");
//	    
//	}
//
//	@Given("user clicks on Signin link")
//	public void user_clicks_on_Signin_link() {
//		driver.findElement(By.linkText("SignIn")).click();
//		System.out.println("the page title"+ driver.getTitle());
//	}
//
//	@Given("enters username as lalitha")
//	public void enters_username_as_lalitha() {
//		driver.findElement(By.id("userName")).sendKeys("lalitha");
//	}
//
//	@Given("password as password{int}")
//	public void password_as_password(Integer int1) {
//		driver.findElement(By.id("password")).sendKeys("password123");
//	}
//
//	@Given("clicks on login")
//	public void clicks_on_login() {
//		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
//	}
//
//	@Then("displays login is succesfull")
//	public void displays_login_is_succesfull() {
//		System.out.println("Login successfull");
//	}
//
//	@Then("enters the search as Headphone")
//	public void enters_the_search_as_Headphone() {
//		 WebElement search=driver.findElement(By.id("myInput"));
//	   	  Actions act=new Actions(driver);
//	   	  act.sendKeys(search,"h").pause(1000).sendKeys(search,"e").pause(1000).sendKeys(search,"a").pause(1000).
//	   	  sendKeys(search,"d").pause(1000).build().perform();
//	   	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().build().perform();
//	   	  
//	}
//
//	@Then("clicks on find details")
//	public void clicks_on_find_details() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//
//	@Then("is directed to add to cart page")
//	public void is_directed_to_add_to_cart_page() {
//		System.out.println("User views add to cart page");
//	}
//
//	@Then("clicks on add to cart page")
//	public void clicks_on_add_to_cart_page() {
//		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
//	}
//
//	@Then("clicks on cart link")
//	public void clicks_on_cart_link() {
//		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
//	}
//
//	@Then("views the product details")
//	public void views_the_product_details() {
//		System.out.println(" User views the product details page");
//	}
//
//	@Then("clicks on checkout")
//	public void clicks_on_checkout() {
//		 driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
//	}
//
//	@Then("click on Proceed to pay")
//	public void click_on_Proceed_to_pay() {
//		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
//	}
//
//	@Then("the page is redirected to welcome to payment gateway")
//	public void the_page_is_redirected_to_welcome_to_payment_gateway() {
//		System.out.println(" The page is redirected to welcome to payment gateway");
//	}
//
//	@Then("select HDFC bank")
//	public void select_HDFC_bank() {
//		WebDriverWait Wait=new WebDriverWait(driver,20);
//	      Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'HDFC Bank')]")));
//	      driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
//	}
//
//	@Then("click on continue")
//	public void click_on_continue() {
//		 driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/a")).click();
//	}
//
//	@Then("enter the payment gateway username as {int}")
//	public void enter_the_payment_gateway_username_as(Integer int1) {
//		 driver.findElement(By.name("username")).sendKeys("123457");
//	}
//
//	@Then("password Pass@{int}")
//	public void password_Pass(Integer int1) {
//		 driver.findElement(By.name("password")).sendKeys("Pass@457");
//	}
//	
//	@Then("click LOGIN")
//	public void click_LOGIN() {
//		 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
//	} 
//
//	@Then("user enters the Transaction password as Trans@{int}")
//	public void user_enters_the_Transaction_password_as_Trans(Integer int1) {
//		 driver.findElement(By.name("transpwd")).sendKeys("Trans@457");
//	}
//	
//	    
//	    
//	@Then("clicks on Pay now option")
//	public void clicks_on_Pay_now_option() {
//		 driver.findElement(By.xpath("//input[@value='PayNow']")).click();
//	}
//
//	@Then("the User is directed to order details page")
//	public void the_User_is_directed_to_order_details_page() {
//		System.out.println(" The User is directed to order details page");
//	}
//
//}
