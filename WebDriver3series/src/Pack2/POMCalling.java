package Pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class POMCalling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");		
	  //One way of calling page objects by BY class
	    /*	POM P=new POM();
		driver.findElement(P.FN).sendKeys("Kishore");
		driver.findElement(P.FN1).sendKeys("saikrishn196");*/
		
		POM p=PageFactory.initElements(driver, POM.class);
		p.FN.sendKeys("Kishore");
		p.FN1.sendKeys("abcdef");
	}

}
