package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Workwithmulipleelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
        driver.manage().window().maximize();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int i;
        for(i=0;i<links.size();i++)
        {
        String linkname=links.get(i).getText();
        if(linkname.startsWith("M")==true)
        System.out.println(linkname);
        }
	}

}
