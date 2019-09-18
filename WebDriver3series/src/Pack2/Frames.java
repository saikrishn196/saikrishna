package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://docs.oracle.com/javase/7/docs/api/");
	    WebElement f1=driver.findElement(By.xpath("//*[@name='packageListFrame']"));
	    driver.switchTo().frame(f1);
	    driver.findElement(By.xpath("//a[@href='java/awt/package-frame.html']")).click();
	    driver.switchTo().parentFrame();
	    Thread.sleep(2000);
	    WebElement f2=driver.findElement(By.xpath("//*[@name='packageFrame']"));
	    driver.switchTo().frame(f2);
	    driver.findElement(By.xpath("//*[@href='CompositeContext.html']")).click();

	}

}
