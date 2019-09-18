package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saikrishna");
	    driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("krishna");
	    driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");
	}

}
