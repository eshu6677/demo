package com.spicejet.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Voyaah.org.Screenshort;

public class Spicejet {
	@Test(priority=1)
	public void OneWay() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\em21154\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/Search.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='Login']")).click();
//		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys("9391949393");
//		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys("eshu@123");
//		driver.findElement(By.name("ControlGroupLoginView$MemberLoginView2LoginView$ButtonLogIn")).click();
//		driver.findElement(By.xpath("//*[@id='highlight-book']")).click();
		driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).sendKeys("Hydrabad");
		Thread.sleep(1000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).sendKeys("Vij");
	


	 WebElement dm = driver.findElement(By.name("custom_date_picker"));
	 WebElement db = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[3]/a"));
				Actions a=new Actions(driver);
				a.moveToElement(dm).doubleClick().perform();
				a.moveToElement(db).doubleClick().perform();
				driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
				WebElement Adult = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
				Select s=new Select(Adult);
				s.selectByIndex(3);
				driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']")).click();
				driver.close();
				
	}
//	@Test(priority=2)
//	public void RoundTrip() throws Exception{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\em21154\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://book.spicejet.com/Search.aspx");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='Login']")).click();
//		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys("9391949393");
//		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys("eshu@123");
//		driver.findElement(By.name("ControlGroupLoginView$MemberLoginView2LoginView$ButtonLogIn")).click();
//		driver.findElement(By.xpath("//*[@id='highlight-book']")).click();
//		driver.findElement(By.xpath("//*[@id='RoundTrip']/label")).click();
//		driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
//		driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).sendKeys("Hydrabad");
//		Thread.sleep(1000);
//		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).sendKeys("Vij");
//
//	 WebElement dm = driver.findElement(By.name("custom_date_picker"));
//	 WebElement db = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[3]/a"));
//				Actions a=new Actions(driver);
//				a.moveToElement(dm).doubleClick().perform();
//				a.moveToElement(db).doubleClick().perform();
//				driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
//				WebElement Adult = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
//				Select s=new Select(Adult);
//				s.selectByIndex(2);
//				driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']")).click();
//				driver.close();
//	}
//	@Test(priority=1)
//	public void Multicity() throws Exception{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\em21154\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://book.spicejet.com/Search.aspx");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='Login']")).click();
//		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys("9391949393");
//		driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys("eshu@123");
//		driver.findElement(By.name("ControlGroupLoginView$MemberLoginView2LoginView$ButtonLogIn")).click();
//		driver.findElement(By.xpath("//*[@id='highlight-book']")).click();
//		driver.findElement(By.xpath("//*[@id='TripPlanner']/label")).click();
//		driver.findElement(By.xpath("//*[@id='btnOk']")).click();
//		driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).sendKeys("Hydrabad");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")).sendKeys("Vij");
//		
//
//	 WebElement dm = driver.findElement(By.name("custom_date_picker"));
//	 WebElement db = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[3]/a"));
//				Actions a=new Actions(driver);
//				a.moveToElement(dm).doubleClick().perform();
//				a.moveToElement(db).doubleClick().perform();
//				driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
//				WebElement Adult = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
//				Select s=new Select(Adult);
//				s.selectByIndex(2);
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation2_CTXT']")).click();
//				driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation2_CTXT']")).sendKeys("Pune");
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation2_CTXT']")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation2_CTXT']")).sendKeys("Goa");
//			
//			 WebElement dm1 = driver.findElement(By.xpath("//*[@id='custom_date_picker_id_2']"));
//			 WebElement db1 = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[3]/a"));
//						Actions a1=new Actions(driver);
//						a1.moveToElement(dm1).doubleClick().perform();
//						a1.moveToElement(db1).doubleClick().perform();
//						
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']")).click();
//				driver.close();
//	}
		
		
	}


