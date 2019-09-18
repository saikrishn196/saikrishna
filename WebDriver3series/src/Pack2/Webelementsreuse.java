package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelementsreuse {
	public static void main(String[] args) {
		Methods m=new Methods();
		m.LaunchApp("https://www.facebook.com");
	WebDriver driver=new FirefoxDriver();
			driver.findElement(By.id("pass")).sendKeys("Saikrishna");
	WebElement ele=driver.findElement(By.id("u_0_a"));
	ele.click();
	ele.getAttribute("href");
	ele.isDisplayed();
	if(ele.isDisplayed());
}
}