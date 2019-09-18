package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleRightClicks {

	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    WebElement ele=driver.findElement(By.id("email"));
	    Actions a=new Actions(driver);
	    // a.sendKeys(Keys.F5).build().perform();
	    /*a.doubleClick(ele).build().perform();
	    Thread.sleep(3000);*/
	    a.contextClick(ele).build().perform();
	    a.sendKeys(Keys.DOWN).build().perform();
	    /*
	    Thread.sleep(3000);
	    a.sendKeys(Keys.DOWN).build().perform();
	    Thread.sleep(3000);
	    a.sendKeys(Keys.DOWN).build().perform();
	    Thread.sleep(3000);
	    a.sendKeys(Keys.DOWN).build().perform();*/
	}
}
