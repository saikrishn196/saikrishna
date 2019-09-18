package Pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.xpath("//a[@id='terms-link']")).click();
	    driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
	    driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
	   //Count number of windows using window handles
	     Set<String> wh=driver.getWindowHandles();
	    ArrayList a=new ArrayList(wh);
	    System.out.println(a.size());
	    driver.switchTo().window((String)a.get(1)).findElement(By.id("email")).sendKeys("SaiKrishna");
	    
	    int i; int j;
	    for(i=0;i<a.size();i++)
	    {
	    	System.out.println(driver.switchTo().window((String)a.get(i)).getTitle());
	    	List<WebElement> links=driver.switchTo().window((String)a.get(i)).findElements(By.tagName("a"));
	    	for(j=0;j<links.size();j++)
	    	{
	    		System.out.println(links.get(j).getText());
	    }
	    	System.out.println("----------------");
	    	driver.close();
	    
	}
	}
}
