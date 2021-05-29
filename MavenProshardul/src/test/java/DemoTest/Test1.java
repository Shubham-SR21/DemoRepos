package DemoTest;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DemoPage.Loginages;

public class Test1 {
	WebDriver driver;
	Logger log = Logger.getLogger(Test1.class);
	
	@Test
	(priority=-1)
	public void openBrowser() throws FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		log.info("URL entered succesfully");
	}

	@Test
	(priority=1)
	public void RegisterTest() throws IOException
	{
		Loginages lrp= PageFactory.initElements(driver, Loginages.class);
		//Locate xlsx file
		
		FileInputStream fls = new FileInputStream("D:\\shubh\\Login_Reg_data_MercuryTours_PageFactory.xlsx");
		//Locate workbook
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		XSSFWorkbook xsw = new XSSFWorkbook(fls);
		//Locate sheet
		XSSFSheet sheet = xsw.getSheet("Sheet1");
		//print row count
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows count: "+rowcount);
		
		//Reg of 2 users for that used for loop
//		for(int i =0;i<rowcount;i++)
//		{
			XSSFRow row= sheet.getRow(1);
			
			XSSFCell col0 =row.getCell(0);
			XSSFCell col1 =row.getCell(1);
			XSSFCell col2 =row.getCell(2);
			XSSFCell col3 =row.getCell(3);
			XSSFCell col4 =row.getCell(4);
			XSSFCell col5 =row.getCell(5);
			XSSFCell col6 =row.getCell(6);
			XSSFCell col7 =row.getCell(7);
			XSSFCell col8 =row.getCell(8);
			XSSFCell col9 =row.getCell(9);
			XSSFCell col10 =row.getCell(10);
			
			// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			String first = col0.getStringCellValue();
			log.info(first);
			String last = col1.getStringCellValue();
			log.info(last);
			String phone = col2.getStringCellValue();
			log.info(phone);
			String mail = col3.getStringCellValue();
			log.info(mail);
			String address = col4.getStringCellValue();	
			log.info(address);
			String city = col5.getStringCellValue();
			log.info(city);
			String state = col6.getStringCellValue();
			log.info(state);
			String country1 = col7.getStringCellValue();
			String username = col8.getStringCellValue();
			log.info(username);
			String password = col9.getStringCellValue();
			log.info(password);
			String confirm = col10.getStringCellValue();
			log.info(confirm);
			
            lrp.fordata(first, last, phone, mail, address, city, state, country1, username, password, confirm);
			lrp.reglogbutton();
			log.info("User Registration process complete");
		log.info("Git Update for Pull request");
		log.info("Git Update for Pull request");
		
	}
		
	}

