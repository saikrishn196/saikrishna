package Cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
public WebDriver driver;
	
	@Given("^User launch app$")
	public void User_launch_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
	}

	@When("^User enters uid and pwd and click on login$")
	public void User_enters_uid_and_pwd_and_click_on_login() throws Throwable {
		    driver.findElement(By.id("email")).sendKeys("SaiKrishna");
	}

	@Then("^User able to login$")
	public void User_able_to_login() throws Throwable {
		    driver.close();
	}
}
