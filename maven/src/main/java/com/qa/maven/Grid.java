package com.qa.maven;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {

	public static void main(String[] args) throws Exception{
		URL u=new URL("http:\\localhost:5555/wd/hub");
		DesiredCapabilities d=DesiredCapabilities.firefox();
		RemoteWebDriver r=new RemoteWebDriver(u, d);
		WebDriver driver=r;
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
