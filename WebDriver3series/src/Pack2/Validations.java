package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
/*		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();*/
        System.out.println(driver.findElement(By.id("pass")).isEnabled());
        System.out.println(driver.findElement(By.id("pass")).isDisplayed());
        System.out.println(driver.findElement(By.name("sex")).isSelected());
        System.out.println(driver.findElement(By.id("u_0_9")).getAttribute("name"));
        System.out.println(driver.findElement(By.id("pass")).getLocation());
        System.out.println(driver.findElement(By.id("pass")).getSize());
	}

}
