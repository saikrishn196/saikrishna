package Pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
public void screenshots(String url, String sspath) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(f,new File(sspath));
}
	
	public static void main(String[] args) throws Exception {
		Screenshots s=new Screenshots();
		s.screenshots("https://www.facebook.com", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Screenshot\\screenshot1.png");
		s.screenshots("https://www.rediff.com", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Screenshot\\screenshot2.png");
		
			
			    
	}

}
