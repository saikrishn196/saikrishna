package Pack2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junitttttt {
	WebDriver driver;
	@Before
	public void Launchapp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	}
	
	@Test
	public void Test1()
	{
	driver.findElement(By.id("email")).sendKeys("saikrishn196");
	boolean a=driver.findElement(By.id("pass")).isDisplayed();
	Assert.assertEquals(true, a);
	}
	@After
	public void closeapp()
	{
		driver.close();
	}

}
