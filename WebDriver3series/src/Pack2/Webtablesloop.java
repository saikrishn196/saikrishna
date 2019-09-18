package Pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablesloop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.mmtstraintimings.in/timetable.aspx");
        WebElement table=driver.findElement(By.xpath("//*[@id='nameTable1']/tbody"));
        WebElement table1=driver.findElement(By.xpath("//*[@id='timeTable1']/tbody"));
	    List<WebElement> rows=driver.findElements(By.tagName("tr"));
	    System.out.println(rows.size());
	    int i;
	    for(i=1;i<=rows.size();i++)
	    {
	    	int j=i-1;
	    String val=table.findElement(By.xpath("tr[" + i + "]/td")).getText();
	    System.out.println(val);
	    if(val.equals("Falaknuma")==true)
	    System.out.println(table1.findElement(By.xpath("tr[" + j + "]/td[8]")).getText());
	    }
	     

}

}
