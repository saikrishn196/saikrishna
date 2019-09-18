package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("http://www.mmtstraintimings.in/timetable.aspx");
        System.out.println(driver.findElement(By.xpath("//*[@id='timeTable1']/tbody/tr[1]/td[4]")).getText());
	}

}
