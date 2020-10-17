package AmazonTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonPom.AmazonPom1;
import amazonPom.AmazonPom2;

public class AmazonMain {
	

		WebDriver driver;
		AmazonPom1 Home;
		AmazonPom2 LoginHome;
		
		@BeforeClass
		public void openbrowser() throws InterruptedException
		{
			System.out.println("Open Browser");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Javatesting\\setup\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			// Maximize

			driver.manage().window().maximize();

			driver.get(
					"https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fext_vrnc%3Dhi%26tag%3Dgooghydrabk-21%26ascsubtag%3D_k_CjwKCAjw19z6BRAYEiwAmo64LQmh2AFd1B6hdtFUsi0O9lXfl4HryhQVkEe_SoOzqYM2lGBPFrFRmRoCWfYQAvD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjw19z6BRAYEiwAmo64LQmh2AFd1B6hdtFUsi0O9lXfl4HryhQVkEe_SoOzqYM2lGBPFrFRmRoCWfYQAvD_BwE%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");

			Thread.sleep(4000);

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Home = new AmazonPom1(driver);
			LoginHome=new AmazonPom2(driver);		}
		
		@AfterClass
		public void closebrowser() throws InterruptedException
		{
		
		driver.quit();
		}
		
		@BeforeMethod
		public void login()
		{
			LoginHome.SetAmazonLoginpageUn();
			LoginHome.SetAmazonLoginpageCont();
			LoginHome.SetAmazonLoginpagePw();
			LoginHome.SetAmazonLoginpageLogin();
		}
		@Test
		public void homepage()
		{
			Home.AmazonHomepageMobiles();
			Home.selectProduct();
			
			
		}
		
		@AfterMethod
		public void logout() throws InterruptedException
		{
			Home.SelectMobileInfo();
			Home.addtocart();
		}
}