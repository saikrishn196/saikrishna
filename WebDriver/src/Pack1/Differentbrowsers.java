package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Differentbrowsers {

	public static void main(String[] args) {
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getWindowHandle();*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com");
		driver1.findElement(By.id("email")).sendKeys("saikrishna");
		WebDriverBackedSelenium s =new WebDriverBackedSelenium(driver1, "http://");
		s.type("id=month", "Feb");
		s.type("id=day", "25");
		driver1.findElement(By.id("pass")).sendKeys("abcdef");
	}

}
