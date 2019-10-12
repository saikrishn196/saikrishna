package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM {
	
/*	By FN=By.xpath("//*[@id='email']");
	By FN1=By.xpath("//*[@id='pass']");*/
	
	@FindBy(xpath="//*[@id='email']") WebElement FN;
	@FindBy(xpath="//*[@id='pass']") WebElement FN1;
	
}
