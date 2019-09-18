package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nooflinksimagescomp {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
        driver.manage().window().maximize();
        int i;
        List<WebElement> links=driver.findElements(By.tagName("a"));
         // To print linknames along with href attributes
        for(i=0;i<links.size();i++)
        	System.out.println(links.get(i).getText() + "-" + links.get(i).getAttribute("href"));
        /*System.out.println(links.size());
   
             List<WebElement> images=driver.findElements(By.tagName("img"));
        System.out.println(images.size());
        if(links.size()>images.size())
        	System.out.println("links are more than images");
        else
        	System.out.println("images are more than links");
	*/}
}
