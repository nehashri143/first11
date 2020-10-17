package fbTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebooookpooom.FBHome;
import facebooookpooom.FBlogin;

public class Fb {
	
	WebDriver driver;
	FBHome home;
	FBlogin login;
	
	@BeforeMethod
	public void openBrowser() throws InterruptedException{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\Javatesting\\setup\\chromedriver_win32\\chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver =new ChromeDriver(options);
		// Maximize
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afd1huBdzp8hfwLdOAFRVt0bnNHhfHvWYj--jfz9Yo-CGeDBUokyMsdnyVndFLhs0o90-N3Uk0pcq6IGaMfk3EzwLDficxjJAWRNPqFUQTug&smuh=8847&lh=Ac-S7D1UR3kpnPSgA1U");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		home = new FBHome(driver);
		login = new FBlogin(driver);
		
	}
	
	@Test()
	public void login()
	{
		// Object Creation Of POM class1
		
		login.setFBloginUN();
		login.setFBloginPW();
		login.setFBloginLogin();
	}
	@Test()
	public void homepage() throws InterruptedException
	{
		System.out.println("test executed");
		
		home.setFBloginNotification();
		home.setFBloginHome();
		Thread.sleep(3000);
	
		 home.setFBloginLogout();
		 Thread.sleep(2000);
		}
	@AfterMethod()
	public void closebrow()
	{	System.out.println("closing browser");
		driver.quit();
		System.out.println("closing browser");
	}
		
		}


