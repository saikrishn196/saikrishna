package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesgetlinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://docs.oracle.com/javase/7/docs/api/");
	  List<WebElement> frames=driver.findElements(By.tagName("frame"));
	    int i; int j;
	    for(i=0; i<frames.size();i++)
	    {
	    
	    	List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
	    	System.out.println(links.size());
	    	for(j=0;j<links.size();j++)
	    	{
	    		System.out.println(links.get(j).getText()); 		
	    	}
	    	System.out.println("-----------------------");
	    	driver.switchTo().parentFrame();
	    	
	    
	    }
	    	
	    	
	   
	}

}
