package DemoPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginages
{
	WebDriver driver;
	static Logger log= Logger.getLogger(Loginages.class);

	//Register page locators
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	WebElement firstname;
	@FindBy(how=How.NAME,using="lastName")
	WebElement last1;
	@FindBy(how=How.NAME,using="phone")
	WebElement phone1;
	@FindBy(how=How.NAME,using="userName")
	WebElement mail1;
	@FindBy(how=How.NAME,using="address1")
	WebElement adress1;
	@FindBy(how=How.NAME,using="city")
	WebElement city1;
	@FindBy(how=How.NAME,using="state")
	WebElement state1;
	@FindBy(how=How.NAME,using="country")
	WebElement cou1;
	@FindBy(how=How.ID,using="email")
	WebElement user1;
	@FindBy(how=How.NAME,using="password")
	WebElement pass1;
	@FindBy(how=How.NAME,using="confirmPassword")
	WebElement confirm1;
	
	//Register Button locator
	@FindBy(how=How.NAME,using="submit")
	WebElement regbutton;
	//Sign off button locator
	@FindBy(how=How.XPATH,using="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement signoff;
	
	//Login page locators
	@FindBy(how=How.NAME,using="userName")
	WebElement username;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.XPATH,using="/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a")
	WebElement home;
	//Register link locator
	@FindBy(how=How.XPATH,using="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement reglink;
	
	public Loginages(WebDriver driver)
	{
		this.driver=driver;
		log.info("This is contructor");
	}
	
	public void fordata(String first,String last,String phone, String mail, String address, 
						String city, String state, String country1, String username, String password, String confirm)
	{
		log.info("For data start");
		firstname.sendKeys(first);
		last1.sendKeys(last);
		phone1.sendKeys(phone);
		mail1.sendKeys(mail);
		log.info("For data middle1");
		adress1.sendKeys(address);
		city1.sendKeys(city);
		state1.sendKeys(state);
		cou1.sendKeys(country1);
		log.info("For data middle2");
		user1.sendKeys(username);
		pass1.sendKeys(password);
		confirm1.sendKeys(confirm);
		log.info("Register data entered");
	}
	
	public void logindata(String us, String pass)
	{
		username.sendKeys(us);
		password.sendKeys(pass);
		log.info("Login data entered ");
	}

	public void reglogbutton()
	{
		regbutton.click();
		log.info("Register/login Button");
	}
	public void signoffbutton()
	{
		signoff.click();
		log.info("SignOff Button");
	}
	public void homelink()
	{
		home.click();
		log.info("Home Button");
	}
	public void reglink()
	{
		reglink.click();
		log.info("Register Button");
	}
	}

