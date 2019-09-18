package Pack2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actclass {

	public static void main(String[] args) throws Exception {
				/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();*/
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("https://www.naukri.com");
			    Thread.sleep(10000);
			    Actions b=new Actions(driver);
			    //WebElement ele=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a/div"));
			      //b.moveToElement(ele);
			      //b.sendKeys(Keys.F5).build().perform();
			      
			     Robot r=new Robot();
			      r.keyPress(KeyEvent.VK_F5);
			     

	}
}
			      
			      
			      
			      
			      
			      
//WebElement Tutorial=driver.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/div/nav/ul/li[2]/div/span[2]"));  
			      //a.moveToElement(Tutorial).build().perform();
/*	            Robot r=new Robot();
	            r.keyPress(KeyEvent.VK_F5);
*/			     
