package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

public class Firstclass {
	public WebDriver driver;
  @Test
  public void f() {
	 driver.get("https://www.facebook.com");
	 String s=driver.getTitle();
	  System.out.println(s);
	  //Hard Assert stops exec if false
	  Assert.assertEquals(s, true);
	  //Soft Assert- continues exec if true or false 
	  SoftAssert s1=new SoftAssert();
	  s1.assertEquals(s, false);
  System.out.println(driver.getCurrentUrl());
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
