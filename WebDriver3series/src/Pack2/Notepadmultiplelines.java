package Pack2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notepadmultiplelines {

	public static void main(String[] args) throws Exception {
		//Reading multiple lines from notepad and printing in console
		/*FileReader f=new FileReader("C:\\Users\\saikrishna\\Desktop\\8AMWD\\1234.txt");
		BufferedReader b=new BufferedReader(f);
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		*/
		//Reading multiple words from notepad and parameterising to application
			/*String s;
			while((s=b.readLine())!=null)
			{
			System.out.println(s);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.facebook.com");
		String[] a=s.split(" ");
		driver.findElement(By.id("email")).sendKeys(a[3]);
		driver.findElement(By.id("pass")).sendKeys(a[8]);*/
		
		//Writing data to new notepad file
		/*FileWriter fw=new FileWriter("C:\\Users\\saikrishna\\Desktop\\8AMWD\\123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("saikrishna Ravikanti");
		bw.close();*/
		
		//Reading input from console and passing to app
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A value");
		int a=s.nextInt();
		System.out.println("Enter B value");
		int b=s.nextInt();
		int c=a*b;
		System.out.println(c);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    System.out.println("Enter the url");
	    String u=s.next();
	    driver.get(u);
	    System.out.println("Enter email locator");
	    String email_loc=s.next();
	    System.out.println("Enter email value");
	    String email_val=s.next();
	    System.out.println("Enter pwd locator");
	    String pass_loc=s.next();
	    System.out.println("Enter pwd value");
	    String pass_val=s.next();
	    driver.findElement(By.id(email_loc)).sendKeys(email_val);
	    driver.findElement(By.id(pass_loc)).sendKeys(pass_val);
	    
	    
		}
		
	}

