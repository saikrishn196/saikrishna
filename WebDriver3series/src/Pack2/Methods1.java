package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    List<WebElement> elements=driver.findElements(By.tagName("a"));
	    int i;
	    System.out.println(elements.size());
		Methods m=new Methods();
		m.elementPresent("email",true);
		m.elementPresent("pass",false);
	    /*for(i=0;i<=elements.size();i++)
	    	System.out.println(elements.get(i).getText());*/
	   
	}
}
