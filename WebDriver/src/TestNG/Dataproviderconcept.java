package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Dataproviderconcept {
	public WebDriver driver;
	@Test(dataProvider="Testdata1")
	  public void f(String uid, String pwd) {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	  }
	  @DataProvider(name="Testdata1")
	  public Object[][] data1(){
		  Object[][] obj=new Object[2][2];
		  obj[0][0]="Saikrishna"; obj[0][1]="Sai";
		  obj[1][0]="Krishna"; obj[1][1]="Ravikanti";
		  return obj;
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

