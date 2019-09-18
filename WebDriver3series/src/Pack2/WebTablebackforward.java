package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablebackforward {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://money.rediff.com/sectors/bse/auto");
	    WebElement table=driver.findElement(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
	    List<WebElement> rows=table.findElements(By.tagName("tr"));
	    //System.out.println(rows.size());
	    int i;
	    for(i=1;i<rows.size();i++)
	    	table.findElement(By.xpath("tr[" + i + "]/td[1]")).click();
	    	Thread.sleep(10000);
	    	String inside=driver.findElement(By.xpath("//*[@id='for_BSE']/div[3]/table/tbody/tr[2]/td[5]/span")).getText();
	    	Thread.sleep(10000);
	    	System.out.println(inside);
	    	Thread.sleep(2000);
	    	driver.navigate().back();
	}

}
