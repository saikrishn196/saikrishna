package Pack2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DataFromExcel {

	public static void main(String[] args) throws Exception {
		
		/*FileInputStream f=new FileInputStream("C:\\Users\\saikrishna\\Desktop\\8AMWD\\Excel.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet1");
		//For getting cell values from excel and printing data in console
		System.out.println(s.getCell(0,0).getContents());
		System.out.println(s.getCell(0,1).getContents());
		System.out.println(s.getCell("A1").getContents());
		//For parameterising to application from excel
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saikrishna\\Desktop\\8AMWD\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(s.getCell(0,2).getContents());
	    driver.findElement(By.id(s.getCell(0,3).getContents())).sendKeys(s.getCell(0,4).getContents());
	    driver.findElement(By.id(s.getCell(0,5).getContents())).sendKeys(s.getCell(0,6).getContents());
		//Count no of rows and columns in excel and identifying position of particular cell in excel sheet
		int r=s.getRows(); int c=s.getColumns();
		System.out.println(r);
		int i; int j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				String val=s.getCell(j,i).getContents();	
				if(val.equals("ravikanti")==true)
					System.out.println(j + "-" + i);
			}
			
		}
		//Writing the data to excel
		FileOutputStream f1=new FileOutputStream("C:\\Users\\saikrishna\\Desktop\\8AMWD\\Excel1.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(f1);
		WritableSheet s1=wwb.createSheet("Sheetone", 0);
		Label l=new Label(0, 0, "saikrishna");
		s1.addCell(l);
		Label l1=new Label(0, 1, "ravikanti");
		s1.addCell(l1);
		wwb.write();wwb.close();*/
		
		
		//Reading content from Notepad
	FileReader f2=new FileReader("C:\\Users\\saikrishna\\Desktop\\8AMWD\\1234.txt");
	BufferedReader br=new BufferedReader(f2);
	System.out.println(br.readLine());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}