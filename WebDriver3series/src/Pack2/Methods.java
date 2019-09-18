package Pack2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	
	public void WebDriver(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	}
	public void LaunchApp(String Url){	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
    driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get(Url);
	}
	public void elementPresent(String loc,boolean exp){
		
    boolean b=driver.findElement(By.id(loc)).isDisplayed();
    if(b==exp)	
    System.out.println("pass");
    else	
    System.out.println("fail");    
}
}