package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Differentbrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("Saikrishn196");
        
        driver.findElement(By.id("pass")).sendKeys("abcdef");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("day")).sendKeys("14");
        driver.findElement(By.id("month")).sendKeys("Feb");
	}

}
