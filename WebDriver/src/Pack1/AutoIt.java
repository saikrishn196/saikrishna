package Pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://transfer.pcloud.com/");
	    driver.findElement(By.xpath("//img[@class='plus_sign']")).click();
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("C:\\Users\\saikrishna\\Desktop\\8AMWD\\AutoIts\\Fileupload.exe");

	}

}
