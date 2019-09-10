package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Propertiesclass extends Driversclass{
	@FindBy(xpath="//*[@id=\"u_0_l\"]")public WebElement Firstname;
	@FindBy(xpath="//*[@id=\"u_0_n\"]")public WebElement Surname;
	@FindBy(xpath="//*[@id=\"u_0_q\"]")public WebElement Mobilenumberoremailaddress;
	@FindBy(xpath="//*[@id=\"u_0_x\"]")public WebElement Newpassword;
	//@FindBy(xpath="//*[@id=\"day\"]")public WebElement Day;
	Select a= new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	Select d= new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
	Select f= new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	
	public Propertiesclass(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void UserLogin() throws InterruptedException
	{
		Thread.sleep(3000);
		Firstname.sendKeys("jyothsnaaaa");
		Surname.sendKeys("jyo");
		Mobilenumberoremailaddress.sendKeys("9640272888");
		Newpassword.sendKeys("Lovely@Jyo9596");
		//Day.sendKeys("20");
		Thread.sleep(3000);
		a.selectByIndex(1);
		d.selectByIndex(3);
		f.selectByIndex(8);
	
		
	}
		
	}

